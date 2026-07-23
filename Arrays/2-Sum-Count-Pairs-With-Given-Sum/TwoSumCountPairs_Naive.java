import java.util.Arrays;
class GFG{
  static void two_sum(int [] arr,int target){
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]+arr[j]==target)
           {
             sum++;
        }
      }
    }
    System.out.print(sum);
  }
  public static void main(String [] args)
  {
    int [] arr={1, 5, 7, -1, 5};
    int target = 6;
    two_sum(arr,target);
  }
}
             
         
    
