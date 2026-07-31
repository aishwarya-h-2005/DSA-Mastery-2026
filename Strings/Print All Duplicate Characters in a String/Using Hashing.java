import java.util.HashMap;
class GFG{
  static void dublicate(String s){
    HashMap<Character,Integer>map=new HashMap<>();
    char [] arr=s.toCharArray();
   
     for(int i=0;i<arr.length;i++)
     {
       if(map.containsKey(arr[i]))
       {
         map.put(arr[i],map.get(arr[i])+1);
       }
       else
       {
         map.put(arr[i],1);
       }
     }
   for(Character key:map.keySet())
   {
     if(map.get(key)>1)
      {
      System.out.print("["+"'"+key+"'" + ","+  " " + map.get(key) + "]" + "," + " ");
      }
   }
  }
    public static void main(String [] args)
         {
           String s="geeksforgeeks";
           dublicate(s);
         }
  }
    
      
    
