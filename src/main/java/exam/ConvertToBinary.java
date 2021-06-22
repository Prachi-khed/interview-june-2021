package exam;

public class ConvertToBinary {

  static String toBinary(int n) {
    if(n == 0)
    return "0";
    String b = "";
    while(n>0)
    {
      b = ((n & 1) == 0 ? '0' : '1')+b;
      n >>= 1;
    }
    return b;
  }
  public static void main(String args[])
  {
    int n = 53;
    System.out.println(toBinary(n));
  }
}
