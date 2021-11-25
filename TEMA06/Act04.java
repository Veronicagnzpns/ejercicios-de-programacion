public class Act04 {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 0 y 10 (sin decimales):");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random()*11) + "  ");
    }

    System.out.println();
  }
}
