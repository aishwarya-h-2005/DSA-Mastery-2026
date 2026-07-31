class GFG{
  static void rotate(String s1,String s2){
    String result=s1+s1;
      if(result.contains(s2))
      {
        System.out.print(true);
        return;
      }
      else
      {
        System.out.print(false);
        return;
      } 
  }
        public static void main(String [] args)
      {
        String s1 = "abcd";
      String s2 = "cdab";
      rotate(s1,s2);
      }
  }
    
         
     
