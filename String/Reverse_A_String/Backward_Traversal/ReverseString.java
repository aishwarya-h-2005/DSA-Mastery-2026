class GFG{
  static void reverse(String s){
    StringBuilder result=new StringBuilder();
    for(int i=s.length()-1;i>=0;i--)
    {
      result.append(s.charAt(i));
    }
    System.out.print(result);
  }
  public static void main(String [] args)
  {
    String s="abdcfe";
    reverse(s);
  }
}
    
