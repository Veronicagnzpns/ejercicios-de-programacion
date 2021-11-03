public class Act27 {

  public static void main(String[] args) {
    
   
    System.out.print("Elija un sabor (manzana, fresa o chocolate):");
      String tipoTarta = System.console().readLine();
   
   
     
     
      double precio=0;
      String tipoChoco="";
       switch (tipoTarta) {
            case "fresa":
            precio= 16;
              break;
              
            case "manzana":
            precio=18;
              break;
              
             case "chocolate":
             System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco):");
              tipoChoco = System.console().readLine();
             
                if (tipoChoco.equals("negro")){
                  precio= 14;
                }
                if (tipoChoco.equals("blanco")){
                  precio= 15;
                }
              
              break;

            default:
             

           } 
            System.out.print("¿Quiere nata? (si o no):");
              String nata = System.console().readLine();
     
            System.out.print("¿Quiere ponerle un nombre? (si o no):");
              String ponerNombre=System.console().readLine();
           
       
            
            if ((tipoTarta.equals("manzana")) || (tipoTarta.equals("fresa"))){
            System.out.printf("Tarta de %s                %6.2f\n",tipoTarta,precio);
            }
            
           if (tipoTarta.equals("chocolate")){
            
            System.out.print ("Tarta de "+tipoTarta);
            System.out.printf("con       "+tipoChoco);
             System.out.print ("   %6.2f\n "+precio);
            }
                
          if (nata.equals("si")){
            precio=precio+2.50;
             System.out.printf("Con nata:                %.2f\n",2.50);
            } 
            double precio3=0;
          if (ponerNombre.equals("si")){
            precio=precio+2.75;
            System.out.printf("Con Nombre:                %f\n",2.75);
            } 
            System.out.printf("Total                %6.2f\n",precio);
          
            
 }
}

