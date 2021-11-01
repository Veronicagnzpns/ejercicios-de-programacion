public class Act22 {

  public static void main(String[] args) {
    
   
    System.out.print("Porfavor introduzca un dia: ");
      String n = System.console().readLine();
   
    System.out.print("Porfavor introduzca una hora: ");
      int  h = Integer.parseInt(System.console().readLine());
    System.out.print("Y minutos: ");
      int  m = Integer.parseInt(System.console().readLine());
  
  
   String recu;

          switch (n) {
            case "lunes":
              System.out.print(((h*60+m)-1440)+(1440*3)+900);
              break;
            case "martes":
              System.out.print(((h*60+m)-1440)+(1440*2)+900);
              break;
            case "miercoles":
              System.out.print(((h*60+m)-1440)+(1440*1)+900);
              break;
            case "jueves":
              System.out.print(((h*60+m)-1440)+(1440*0)+900);
              break;
            case "viernes":
              System.out.print(((h*60+m)-1440)+(1440*3)+900);
              break;
            case "sabado":
              System.out.print(((h*60+m)-1440)+(1440*5)+900);
              break;
            case "domingo":
              System.out.print(((h*60+m)-1440)+(1440*4)+900);
              break;

            default:
              recu = "no existe ";
  
  }
}
}
