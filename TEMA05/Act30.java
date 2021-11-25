public class Act30 {
  public static void main(String[] args) {
   
    System.out.print("CALCULO ENTRE HORAS");
   
    int dia1 = 0;
    int dia2 = 0;
    int hora1;
    int hora2;
    String dia1String;
    String dia2String;
    boolean datosCorrectos = true;
    String nombreDia1 = " ";
    String nombreDia2 = " ";
    
    do{
    System.out.print("Por favor, introduzca la primera fecha\n");
    System.out.print("Dia:");
    dia1String = System.console().readLine();
    System.out.print("Hora: ");
    hora1 = Integer.parseInt(System.console().readLine());
       switch(dia1String){
        case "lunes":
        case "1":
          dia1 = 1;
          nombreDia1 = "lunes";
          break;
        case "martes":
        case "2":
          dia1 = 2;
          nombreDia1 = "martes";
          break;
        case "miercoles":
        case "3":
          dia1 = 3;
          nombreDia1 = "miercoles";
          break;
        case "jueves":
        case "4":
          dia1 = 4;
          nombreDia1 = "jueves";
          break;
        case "viernes":
        case "5":
          dia1 = 5;
          nombreDia1 = "viernes";
          break;
        case "sabado":
        case "6":
          dia1 = 6;
          nombreDia1 = "sabado";
          break;
        case "domingo":
        case "7":
          dia1 = 7;
          nombreDia1 = "domingo";
          break;
          default:
          dia1=0;
          }
          
    System.out.print("Por favor, introduzca la segunda fecha\n");
    System.out.print("Dia:");
    dia2String = System.console().readLine();
    System.out.print("Hora: ");
    hora2 = Integer.parseInt(System.console().readLine());
      switch(dia2String){
        case "lunes":
        case "1":
          dia2 = 1;
          nombreDia2 = "lunes";
          break;
        case "martes":
        case "2":
          dia2 = 2;
          nombreDia2 = "martes";
          break;
        case "miercoles":
        case "3":
          dia2 = 3;
          nombreDia2 = "miercoles";
          break;
        case "jueves":
        case "4":
          dia2 = 4;
          nombreDia2 = "jueves";
          break;
        case "viernes":
        case "5":
          dia2 = 5;
          nombreDia2 = "viernes";
          break;
        case "sabado":
        case "6":
          dia2 = 6;
          nombreDia2 = "sabado";
          break;
        case "domingo":
        case "7":
          dia2 = 7;
          nombreDia2 = "domingo";
          break;
          default:
          dia2=0;
          }
        datosCorrectos = true;
               

            
      if (dia2 <= dia1) {
        System.out.println("El segundo día debe ser posterior al primero.");
        datosCorrectos = false;
      }
      
      if ((dia1 == 0) || (dia2 == 0)) {
        System.out.println("No se ha introducido correctamente el día de la semana.");
        System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
        datosCorrectos = false;
      }
      
      if ((hora1 < 0) || (hora1 > 23) || (hora2 < 0) || (hora2 > 23)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        System.out.println("Las horas válidas están entre 0 y 23.");
        datosCorrectos = false;
      }
      
    } while (!datosCorrectos);
    
    
    System.out.print("Entre las " + hora1 + ":00h del " + nombreDia1);
    System.out.print(" y las " + hora2 + ":00h del " + nombreDia2);
    System.out.println(" hay " + (((dia2 * 24) + hora2) - ((dia1 * 24) + hora1)) + " horas.");
    
    
    
      }
    
   
   
  
      
      
    

    }

