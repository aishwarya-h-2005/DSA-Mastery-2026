import java.util.Arrays;
class GFG{
  static void suffeled(String str1,String str2){
    char [] arr=str1.toCharArray();
    Arrays.sort(arr);
    for(int i=0;i<=str2.length();i++)
    {
      String temp=str2.substring(i,i+str1.length());
      char [] arr2=temp.toCharArray();
      Arrays.sort(arr2);
      if(Arrays.equals(arr,arr2))
         {
           System.out.print("YES");
           return;
         }
    }
         {
            System.out.print("NO");
         }
   }
         public static void main(String [] args)
         {
           String str1 = "onetwofour";
           String str2 = "hellofourtwooneworld";
           suffeled(str1,str2);
         }
    }
         
