import java.util.*;
class GenDemo
{
  public static void main(String args[])
  {
    ArrayList arr = new ArrayList();
    String n = "Pratikshya";
    Integer roll = new Integer(35);
    Float m = new Float(9.04);
    arr.add(m);
    arr.add(n);
    arr.add(roll);
    System.out.println(arr);

    for(Object o : arr)
     System.out.println(o);

   System.out.println((Integer)arr.get(1)+(Float)arr.get(2));
  }
}