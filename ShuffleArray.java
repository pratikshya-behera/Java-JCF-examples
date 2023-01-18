import java.util.*;
class ShuffleArray
{
  public static void main(String args[])
  {
    ArrayList <Integer> n = new ArrayList();
    Collections.addAll(n, 55, 60, 10, 5, 3, 0, 11);
    Collections.shuffle(n);
    System.out.println("Minimum value:"+Collections.min(n));
    System.out.println("Maximum value:"+Collections.max(n));
    System.out.println(n);
  }
}