public class Act25 {

  public static void main(String[] args) {
    
    
   
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String bordado = System.console().readLine();
    
   
    
    int cm= h*a;
    double precioCm= cm*0.01;
    double precioEscudo=0;
    String escudo;
    
    if (bordado.equals("s")){
       escudo="Con escudo";
       precioEscudo=2.50;
      } else {
        escudo="Sin escudo";
        precioEscudo=0;
        }
      double gastosDeEnvio=3.25;
      double total=precioCm+precioEscudo+gastosDeEnvio; 
    
            System.out.printf("Bandera de %5d cm2:        %6.2f\n",cm,precioCm);
            System.out.printf("%s:               %6.2f\n",escudo,precioEscudo);
            System.out.printf("Gastos de envío:          %6.2f\n",gastosDeEnvio);
            System.out.printf("Total:                    %6.2f\n",total);
    }
  }
