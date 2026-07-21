import java.util.Arrays;
class GFG {
  static void min_max_diff(int [] arr, int k)
  {
    Arrays.sort(arr);
    int n=arr.length;
    int smallest=arr[0]+k;
    int largest=arr[n-1]-k;
    int ans=arr[n-1]-arr[0];
    for(int i=1;i<arr.length;i++)
    {
      if(arr[i]-k<0)
      {
        continue;
      }
      else
      {
        int minH=Math.min(smallest,arr[i]-k);
        int maxH=Math.max(largest,arr[i-1]+k);
        ans=Math.min(ans,maxH-minH);
      }
    }
    System.out.print(ans);
  }
  public static void main(String [] args)
  {
    int [] arr={1, 5, 8, 10};
    int k=2;
    min_max_diff(arr,k);
  }
}
                    
