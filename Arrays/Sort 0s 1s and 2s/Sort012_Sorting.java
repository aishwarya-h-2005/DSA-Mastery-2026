import java.util.Arrays;
class GFG{
  static void sort012_Sorting (int [] arr) {
    Arrays.sort(arr);
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
    System.out.print(arr[i] + " ");
    }
  }
  public static void main(String [] args) {
    int [] arr={ 0, 1, 2, 0, 1, 2 };
    sort012_Sorting(arr);
  }
}
