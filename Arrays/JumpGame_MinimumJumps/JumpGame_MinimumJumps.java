import java.util.Arrays;
class GFG{
  static void jump(int [] arr)
  {
    int n=arr.length;
    int jumps=0;
    int coverage=0;
    int last_index=0;
    int destination=n-1;
    if(arr[0]==0)
    {
      System.out.print("-1");
      return;
    }
    for(int i=0;i<n-1;i++)
    {
      coverage=Math.max(coverage,i+arr[i]);
      if(i==last_index)
      {
        jumps++;
        last_index=coverage;
      }
      if(last_index>=destination)
      {
         System.out.print(jumps);
           return;
      }
    }
  }
  public static void main(String [] args)
  {
    int arr [] ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    jump(arr);
  }
}
      
     
