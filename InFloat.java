import java.util.*;
class InFloat
{
  public static void main(String args[])
  {
    ArrayList <Float> f = new ArrayList();
    for(int i=0; i<9; f.add((float) i),i++);
    for(int i=0; i<9; System.out.println(f.get(i)), i++);
  }
}