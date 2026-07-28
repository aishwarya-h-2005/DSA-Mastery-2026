import java.util.Arrays; 
import java.util.ArrayList;
class GFG{
  static void overlap(int [][] arr){
    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    ArrayList<Integer>new_arr_list=new ArrayList<>();
    Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
    new_arr_list.add(arr[0][0]);
    new_arr_list.add(arr[0][1]);
    result.add(new_arr_list);
                for(int i=1;i<arr.length;i++)
                {
                  ArrayList<Integer>last=result.get(result.size()-1);
                  if(arr[i][0]<=last.get(1))
                     {
                      last.set(1,Math.max(last.get(1),arr[i][1]));
                     }
                     else
                     {
                       ArrayList<Integer>intervals=new ArrayList<>();
                       intervals.add(arr[i][0]);
                       intervals.add(arr[i][1]);
                       result.add(intervals);
                     }
                }
    for(int i=0;i<result.size();i++)
    {
      System.out.println(result.get(i).get(0) + " " + result.get(i).get(1));
    }
  }
    public static void main(String [] args)
    {
      int arr[][] = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
      overlap(arr);
    }
  }
      
                               
                               
                       
                                 
                                 
                               
                       
                
                
         
    
  
