public class Act29 {

  public static void main(String[] args) {
    
   
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo):");
      String tipoDesayuno = System.console().readLine();
   
   
     
     
      double precio=0;
      String tipoPitu="";
       switch (tipoDesayuno) {
            case "palmera":
            precio= 1.40;
              break;
              
            case "donut":
            precio=1;
              break;
              
             case "pitufo":
             System.out.print("¿Qué tipo de pitufo? (aceite o tortilla):");
              tipoPitu = System.console().readLine();
             
                if (tipoPitu.equals("tortilla")){
                  precio= 1.60;
                }
                if (tipoPitu.equals("aceite")){
                  precio= 1.20;
                }
              
              break;

            default:
             

           } 
           double precio2=0;
            System.out.print("¿Que bebida a tomado? ( zumo o cafe):");
              String bebida = System.console().readLine();
                if (bebida.equals("zumo")){
                  precio2= 1.50;
                }
                if (bebida.equals("cafe")){
                  precio2= 1.20;
                }
            if ((tipoDesayuno.equals("palmera")) || (tipoDesayuno.equals("donut"))){
            System.out.printf("%s                %6.2f\n",tipoDesayuno,precio);
          }
          if (tipoDesayuno.equals("pitufo")){
            System.out.printf("%s con %s                %6.2f\n",tipoDesayuno,tipoPitu,precio);
            }
            System.out.printf("%s                %6.2f\n",bebida,precio2);
            System.out.printf("Total                %6.2f\n",precio+precio2);
          
            
 }
}

