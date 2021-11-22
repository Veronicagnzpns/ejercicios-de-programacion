public class Act23 {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Suma de números mientras su suma no supere el valor 10000.");
    int  sumaNumeroIntroducido=0;
    int numeroIntroducido=0;
    int numeroAnterior=0;
    int cantidadNumIntro=0;
   
    while (sumaNumeroIntroducido < 10000) {
      
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      sumaNumeroIntroducido=(numeroIntroducido+numeroAnterior);
      cantidadNumIntro++;
      numeroAnterior=sumaNumeroIntroducido;

    }
    System.out.println("Total acumulado " + (sumaNumeroIntroducido) +" contando con el ultimo numero intrdoduciido con el qeu hemos llegado a 10000");

    System.out.println("La cantidad de numeros introducidos es: " + (cantidadNumIntro));
  
    System.out.println("La media total de ellos es: " + (sumaNumeroIntroducido/cantidadNumIntro));
  }
}
