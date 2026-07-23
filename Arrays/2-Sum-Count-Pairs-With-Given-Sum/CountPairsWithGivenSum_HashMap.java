import java.util.HashMap;
class GFG{
  static void sum(int [] arr,int target)
  {
    int count=0;
      HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
      int complement=target-arr[i];
      if(map.containsKey(complement))
         {
           count+=map.get(complement);
            }
         if(map.containsKey(arr[i]))
            {
              map.put(arr[i],map.get(arr[i])+1);
            }
                   else
                   {
                     map.put(arr[i],1);
                   }
            }
            System.out.print(count);
            }
              public static void main(String [] args)
  {
   int [] arr={1, 5, 7, -1, 5};
    int target = 6;
    sum(arr,target);
  }
}
            
                   
                   
