import java.util.Arrays;
class GFG{
  static void dubli(String s){
    char [] arr=s.toCharArray();
    Arrays.sort(arr);
    int count=1;
    for(int i=1;i<arr.length;i++)
    {
      if(arr[i-1]==arr[i])
         {
           count++;
         }
        else
         {
         if(count>1)
         {
         System.out.print( "[" + "'" + arr[i-1] + "'" + "," + count + "]" + ",");
         }
          count=1;
         }
    }
    if(count>1)
    {
      System.out.print("[" + "'" + arr[arr.length-1] + "'" + "," + count + "]" + ",");
    }
   }
         public static void main(String [] args)
         {
           String s="geeksforgeeks";
           dubli(s);
         }
         }
        
