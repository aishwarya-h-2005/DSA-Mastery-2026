import java.util.Arrays;
class GFG {
  static void merge(int [] arr1,int [] arr2)
  {
    
    int n1=arr1.length;
    int n2=arr2.length;
    int [] merged=new int [n1+n2];
   
    for(int i=0;i<n1;i++)
    {
      merged[i]=arr1[i];
    }
    for(int j=0;j<n2;j++)
    {
      merged[n1+j]=arr2[j];
    }
    
    Arrays.sort(merged);
    for(int i=0;i<n1;i++)
    {
      arr1[i]=merged[i];
    }
    for(int j=0;j<n2;j++)
    {
      arr2[j]=merged[n1+j];
    }
    for(int i=0;i<n1;i++)
    {
    System.out.print(arr1[i] + " ");
    }
    System.out.println();
    for(int j=0;j<n2;j++)
    {
    System.out.print(arr2[j] + " ");
    }
    System.out.println();
    
  }
  public static void main(String [] args)
  {
     int arr1[] = {1, 3, 5, 7};;
    int arr2[] = {2, 4, 6, 8};
    merge(arr1,arr2);
  }
}
    
      
                       
