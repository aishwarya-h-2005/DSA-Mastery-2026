import java.util.Arrays;
class GFG{
  static void median(int [] a,int [] b){
    int n1=a.length;
    int n2=b.length;
    int k=0;
    int merge []=new int [n1+n2];
   
    for(int i=0;i<n1;i++)
    {
      merge[k]=a[i];
      k++;
    }
    for(int j=0;j<n2;j++)
    {
      merge[k]=b[j];
      k++;
    }
    Arrays.sort(merge);
    int mid1=merge.length/2-1;
    int mid2=merge.length/2;
  double median_value=((merge[mid1]+merge[mid2])/2.0);
    if(median_value==(int)median_value)
    {
    System.out.print((int)median_value);
    }
    else
    {
      System.out.print(median_value);
    }
  }
  public static void main(String [] args){
    int a[] = { 1, 12, 15, 26, 38 };
    int b[] = { 2, 13, 17, 30, 45};
    median(a,b);
  }
}
    
      
        
