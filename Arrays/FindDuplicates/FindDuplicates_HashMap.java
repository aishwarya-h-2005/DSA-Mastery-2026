import java.util.HashMap;
class GFG{
  static void dublicate(int [] arr)
  {
    HashMap<Integer,Integer>map=new HashMap<>();
    
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
    
    for(Integer key:map.keySet())
    {
      if(map.get(key)>1)
         {
           System.out.print(key + " ");
         }
    }
  }
  
  public static void main(String [] args)
  {
    int [] arr={1, 6, 5, 3, 2, 2, 3};
    dublicate(arr);
  }
}
        
