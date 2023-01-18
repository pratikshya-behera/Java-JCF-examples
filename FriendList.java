import java.util.*;
class FriendList
{
  public static void main(String args[])
  {
    ArrayList <String> n = new ArrayList();
    Collections.addAll(n,"Pratikshya","Manaswinee","Manish","Kunal","Rocky","Sarbesh","Sahil","Rani","Saranya","Samikshya");
    Collections.sort(n);
    System.out.println(n);
  }
}