public class Act01 {
  public static void main(String[] args) {
    System.out.println("Tirada de tres dados:");
    int calculo=0;
    int calculoTotal=0;
    for (int i = 1; i <=3; i++) {
      calculo=(int)(Math.random()*7);
      System.out.print( "\n"+i+" Tirada: "+calculo );
      calculoTotal+=calculo;
    }
    System.out.println("\nLa suma total de las tres tiradas es: "+calculoTotal);

    System.out.println();
  }
}
