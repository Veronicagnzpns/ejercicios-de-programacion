public class Act24 {

  public static void main(String[] args) {
    
   
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = Integer.parseInt(System.console().readLine());
   
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?:");
     int viaje = Integer.parseInt(System.console().readLine());
     
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
      int estadoCivil = Integer.parseInt(System.console().readLine());
      double sueldo=0;
       switch (cargo) {
            case 1:
            sueldo= 950;
              break;
              
            case 2:
            sueldo= 1200;
              break;
              
            case 3:
            sueldo= 1600;
              break;

            default:
            System.out.print("no existe ");
           } 
          
          double irpf=0;
           switch (estadoCivil) {
            case 1:
            irpf=25;
              break;
              
            case 2:
            irpf=20;
              break;

            default:
            System.out.print("no existe ");
           } 
           
           
           double sueldoExtra= viaje*30;
           double sueldoBruto= sueldoExtra+sueldo;
           double irpfTotal= sueldoBruto-(sueldoBruto*irpf/100);
           double total= sueldoBruto-irpfTotal;
           
            System.out.printf("Sueldo base                %6.2f\n",sueldo);
            System.out.printf("viajes (%2d viajes)          %6.2f\n",viaje,sueldoExtra);
            System.out.printf("Sueldo bruto               %6.2f\n",sueldoBruto);
            System.out.printf("Retención IRPF (%.2f%%):   %6.2f\n",irpf,irpfTotal);
            System.out.printf("Sueldo neto                 %6.2f\n",total);
 }
}
