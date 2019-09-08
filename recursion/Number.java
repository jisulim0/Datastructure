package recursion;

public class Number {

  private static void number(int n) {
    if(n==10)
      System.out.println(n);
    else{
      number(n+1);
      System.out.println(n);
    }
  }

  public static void main(String[] args) {
    number(1);
  }

}
