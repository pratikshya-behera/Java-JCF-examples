import java.util.*;
class AlphaNum
{
  public static void main(String args[])
  {
    ArrayList <String> pass = new ArrayList();
    for(char i='A'; i<='Z'; pass.add(""+i),i++);
    for(char i='a'; i<='z'; pass.add(""+i),i++);
    for(int i=1; i<=9; pass.add(""+i),i++);
    Collections.shuffle(pass);
    String gpass = "";
    for(int i=0; i<8; gpass=gpass+pass.get(i),i++);
    System.out.println(gpass);
  }
}