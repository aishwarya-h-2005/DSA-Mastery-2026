import java.util.Arrays;
class GFG{
  static void print_subarray(int [] arr){
    int current =arr[0];
    int max_so_far=arr[0];
    int start=0;
    int end=0;
    int temp=0;
    for(int i=1;i<arr.length;i++)
    {
      if(arr[i]>arr[i]+current)
      {
        current=arr[i];
        temp=i;
      }
      else
      {
        current=current+arr[i];
      }
      if(current>max_so_far)
      {
        max_so_far=current;
        start=temp;
        end=i;
      }   
    }
    
    for(int i=start;i<=end;i++)
    {
    System.out.print(arr[i] + " ");
    }
  }
  public static void main(String [] args)
  {
    int arr[] = {2, 3, -8, 7, -1, 2, 3};
    print_subarray(arr);
  }
}
    
