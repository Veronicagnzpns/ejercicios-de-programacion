

public class Act26 {

  public static void main(String[] args) {
    
   
    System.out.print("Número de entradas: ");
      double numEntradas = Double.parseDouble(System.console().readLine());
   
    System.out.print("Día de la semana:");
     String diaSemana = System.console().readLine();
     
    System.out.print("¿Tiene tarjeta CineCampa? (s/n):");
      String tarjeta =System.console().readLine();
     
     
      double precio=8;
      double numEntradaPareja=0;
       switch (diaSemana) {
            case "miercoles":
            precio= 5;
              break;
              
            case "jueves":
            numEntradaPareja= numEntradas/2;
            numEntradas=numEntradas%2;
              break;

            default:
             precio=8;

           } 
           
           
           double total= (precio*numEntradas) + (11* numEntradaPareja);
           double descuento=0;
           double total2=total ;
          if (tarjeta.equals("s")){
            descuento= (total*0.1);
            total2=total -descuento;
            } else {
            descuento=0;
            }
            double precioEntradaPareja=11;
           if (numEntradas>0){
            System.out.printf("Entradas individuales                %6.2f\n",numEntradas);
            System.out.printf("Precio por entrada individual          %6.2f\n",precio);
            }
            
           if (numEntradaPareja>0){
            System.out.printf("Entradas pareja                %6.2f\n",numEntradaPareja);
            System.out.printf("Precio por entrada pareja          %6.2f\n",precioEntradaPareja);}
            
            System.out.printf("Total                %6.2f\n",total);
            System.out.printf("Descuento:   %6.2f\n",descuento);
            System.out.printf("A pagar                 %6.2f\n",total2);
 }
}
