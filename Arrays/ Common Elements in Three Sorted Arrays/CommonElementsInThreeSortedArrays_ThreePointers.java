import java.util.Arrays;
class GFG{
  static void common(int [] a, int [] b,int [] c){
    int i=0;
    int j=0;
    int k=0;
    int n1=a.length;
    int n2=b.length;
    int n3=c.length;
    int f=0;
    int result []=new int [n1+n2+n3];
    while(i<n1 && j<n2 && k<n3)
    {
      if(a[i]==b[j] && b[j]==c[k])
      {
        result[f]=a[i];
        i++;
        j++;
        k++;
        f++;
      }
     else if(a[i]<b[j] && a[i]<c[k])
        {
          i++;
        }
        else if(b[j]<a[i] && b[j]<c[k])
        {
          j++;
        }
      else
      {
        k++;
      }
    }
    for(int x=0;x<f;x++)
    {
    System.out.print(result[x] + " ");
    }
  }
  public static void main(String [] args)
  {
    int [] a= {1, 5, 10, 20, 30};
    int b[] = {5, 13, 15, 20};
    int c[] = {5, 20};
    common(a,b,c);
              }
  }
      
