import java.util.Arrays;
class GFG{
  static void best_time_buy_sell(int [] prices){
    int buy_price=prices[0];
    int result=0;
    for(int i=1;i<prices.length;i++)
    {
      if(prices[i]>buy_price)
      {
        result=Math.max(result,prices[i]-buy_price);
      }
      else
      {
        buy_price=prices[i];
      }
    }
    System.out.print(result);
  }
  public static void main(String [] args)
  {
    int [] prices={7, 10, 1, 3, 6, 9, 2};
    best_time_buy_sell(prices);
  }
}
