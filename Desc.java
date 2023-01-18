import java.util.*;
class Desc
{
  public static void main(String args[])
  {
    ArrayList <Integer> n = new ArrayList();
    Collections.addAll(n, 55, 60, 10, 5, 3, 0, 11);
    Collections.sort(n);
    Collections.reverse(n);
    System.out.println(n);
  }
}