import java.util.Arrays;
class GFG {
  static void kadense(int [] arr) {
    int max_so_far=arr[0];
    int current=arr[0];
    for(int i=1;i<arr.length;i++)
    {
      current=Math.max(arr[i],arr[i]+current);
      max_so_far=Math.max(current,max_so_far);
    }
    System.out.print(max_so_far);
  }
  public static void main(String [] args) {
    int [] arr={2, 3, -8, 7, -1, 2, 3};
    kadense(arr);
  }
}
