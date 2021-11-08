public class Act08 {
  public static void main(String[] args) {
    int s=0;
    System.out.print("Dime un número: ");
    int n = Integer.parseInt(System.console().readLine());
    for (int i=1; i <= 11; s=n*(i++)) {
      System.out.println(s);
    }
  }
}
