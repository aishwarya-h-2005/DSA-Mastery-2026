import java.util.Arrays;
class GFG {
  static void reverseArray(int [] arr) {
    int n=arr.length;
    int left=0;
    int right=n-1;
   while(left<right)
    {
      int temp=arr[right];
      arr[right]=arr[left];
      arr[left]=temp;
      left++;
      right--;
    }
  }
  public static void main(String[] args)
   {
     int [] arr={ 1, 4, 3, 2, 6, 5};
     int n=arr.length;
    reverseArray(arr);
     for(int i=0;i<n;i++)
     {
       System.out.print(arr[i] + " ");
     }
   }
 }
     
     
                             
              

