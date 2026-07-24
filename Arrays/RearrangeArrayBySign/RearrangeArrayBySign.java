import java.util.Arrays;
class GFG{
  static void rearrange(int [] arr){
    int n=arr.length;
    int j=0;
    int [] pos=new int[n];
    int k=0;
    int [] neg=new int [n];
    for(int i=0;i<n;i++)
    {
      if(arr[i]>0)
      {
        pos[j]=arr[i];
        j++;
      }
      else
      {
        neg[k]=arr[i];
        k++;
      }
    }
   int p=0;
    int q=0;
    int r=0;
    while(p<j && q<k)
    {
      arr[r]=pos[p];
      p++;
      r++;
      arr[r]=neg[q];
      q++;
      r++;
    }
    while(p<j)
    {
     arr[r]=pos[p];
     p++;
     r++;
    }
    while(q<k)
    {
      arr[r]=neg[q];
      q++;
      r++;
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
    
      
      
  public static void main(String [] args)
  {
    int [] arr={1, 2, 3, -4, -1, 4};
    rearrange(arr);
  }
}
