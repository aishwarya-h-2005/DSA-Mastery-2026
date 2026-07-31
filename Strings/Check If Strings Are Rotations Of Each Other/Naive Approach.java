class GFG{
  static void rotate(String s1,String s2){
    if(s1.length()!=s2.length())
    {
      System.out.print(false);
      return;
    }
    for(int i=0;i<s1.length();i++)
    {
      if(s1.equals(s2))
      {
        System.out.print(true);
        return;
      }
      s1=s1.substring(1)+s1.charAt(0);
    }
      {
        System.out.print(false);
      }
  }
    public static void main(String [] args)
    {
      String s1 = "abcd";
      String s2 = "cdab";
      rotate(s1,s2);
    }
  }
    
      
