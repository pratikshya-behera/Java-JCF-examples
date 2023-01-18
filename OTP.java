import java.util.*;
class OTP
{
  public static void main(String args[])
  {
    ArrayList <Integer> n = new ArrayList();
    for(int i=1; i<=9; n.add(i), i++);
    Collections.shuffle(n);
    String otp = ""+n.get(0)+n.get(1)+n.get(2)+n.get(3)+n.get(4);
    System.out.print(otp);
  }
}