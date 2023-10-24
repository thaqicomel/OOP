package Classes;

public class Main {
  public static void main(String[] args) {
    Class myOuter = new Class();
    Class.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}