import java.util.Arrays;
class GFG {
  static void merge(int arr1 [],int arr2 []) {
    
    int n1=arr1.length;
    int n2=arr2.length;
    int i=0;
    int j=0;
    int k=0;
    int [] merged=new int [n1+n2];
    
   while(i<n1 && j<n2)
   {
    if(arr1[i]<=arr2[j])
    {
      merged[k]=arr1[i];
      i++;
      k++;
    }
    else
    {
      merged[k]=arr2[j];
      j++;
      k++;
    }
   }
    while(i<n1)
    {
      merged[k]=arr1[i];
      i++;
      k++;
    }
    while(j<n2)
    {
      merged[k]=arr2[j];
      j++;
      k++;
    }
    
    i=0;
    for(;i<n1;i++)
    {
      arr1[i]=merged[i];
    }
    j=0;
    for(;j<n2;j++)
    {
      arr2[j]=merged[n1+j];
    }
    
    i=0;
    for(;i<n1;i++)
    {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    j=0;
    for(;j<n2;j++)
    {
      System.out.print(arr2[j] + " ");
    }
    System.out.println();
  }
  
  public static void main(String [] args)
  {
    int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
    merge(arr1,arr2);
  }
}
    
    
    
    
    
      
      
      
    
    
