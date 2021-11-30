public class Act04 {
  public static void main(String[] args) {
    System.out.println("-----------------NUMEROS INTRODUCIDOS ALREVES------------------- ");

    int[] n = new int[10];
 
    System.out.println("Introduzca 10 numeros por teclado dando al intro: ");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("Los numeros introducidos en orden inverso serian: ");
    
     for(int i=9;i>=0;i--){
    System.out.printf(" %d ",n[i]);
  }
     
}
}
