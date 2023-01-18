import java.util.*;
class MapE
{
  public static void main(String args[])
  {
    Map <Integer,String> map = new HashMap();
    map.put(16,"Manish");
    map.put(13,"Kunal");
    map.put(15,"Manaswinee");
    for(Map.Entry m : map.entrySet())
    {
      System.out.println(m.getValue()+" "+m.getKey());
    }
  }
}