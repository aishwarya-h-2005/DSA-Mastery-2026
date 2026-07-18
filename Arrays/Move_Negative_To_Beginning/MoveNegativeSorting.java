import java.util.Arrays;
class GFG {
static void pos_neg(int [] arr) {
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String [] args)
  {
    int arr []= {-12, 11, -13, -5, 6, -7, 5, -3, -6 };
    pos_neg(arr);
  }
}
    
