import java.util.Arrays;
class GFG{
static void MinMax(int [] arr) {
  Arrays.sort(arr);
  int n=arr.length;
  int min=arr[0];
  int max=arr[n-1];
  {
    System.out.println(min + " " + max + " ");
  }
}
  
public static void main(String [] args) {
  int [] arr={3, 5, 4, 1, 9};
  MinMax(arr);
}
} 
