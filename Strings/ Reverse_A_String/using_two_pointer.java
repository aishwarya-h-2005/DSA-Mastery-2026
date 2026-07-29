class GfG{
  static void reverse(String s){
    char [] arr=s.toCharArray();
    int left=0;
    int right=s.length()-1;
    while(left<right)
    {
      char temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
      left++;
      right--;
    }
    System.out.print(arr);
  }
    public static void main(String [] args)
    {
      String s= "abdcfe";
      reverse(s);
    }
}
  
      
      
      
