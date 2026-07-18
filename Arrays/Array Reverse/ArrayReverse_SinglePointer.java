import java.util.Arrays;
class GFG {
  static void reverseArray(int [] arr) {
    int n=arr.length;
    for(int i=0;i<n/2;i++)
    {
      int temp=arr[n-1-i];
      arr[n-1-i]=arr[i];
      arr[i]=temp;
    }
  }
    public static void main(String[] args){
      int[] arr={1, 4, 3, 2, 6, 5 };
      int n=arr.length;
      reverseArray(arr);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i] + " ");
    }
   }
}
