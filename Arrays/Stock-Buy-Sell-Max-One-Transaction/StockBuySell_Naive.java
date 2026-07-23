import java.util.Arrays;
class GFG{
  static void buy_sell(int [] prices){
    int result=0;
    for(int i=0;i<prices.length;i++)
    {
      for(int j=i+1;j<prices.length;j++)
      {
        result=Math.max(result,prices[j]-prices[i]);
      }
    }
    System.out.print(result);
  }
  public static void main(String [] args)
  {
    int [] prices={7, 10, 1, 3, 6, 9, 2};
    buy_sell(prices);
  }
}
