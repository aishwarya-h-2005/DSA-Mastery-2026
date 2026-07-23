import java.util.Arrays;
class GFG{
  static void inversions(int [] arr){
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          count++;
        }
      }
    }
    System.out.print(count);
  }
  public static void main(String [] args)
  {
    int [] arr={4, 3, 2, 1};
    inversions(arr);
  }
}
