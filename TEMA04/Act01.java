public class Act01 {
  public static void main(String[] args) {   
       System.out.print("HORARIO DE CLASE\n");
    System.out.print("Por favor, introduzca un dia de la semana: ");
    String diaSemana = System.console().readLine();
    
    
    
    switch (diaSemana.toLowerCase()) { //pasa las palabras a minusculas para que no haya error
      case "lunes":
        System.out.println( "Hoy a primera hora toca Programación");
        break;
      case "martes":
        System.out.println("Hoy a primera hora toca Programación");
        break;
      case "miercoles":
        System.out.println( "Hoy a primera hora toca Sistemas Informaticos");
        break;
      case "jueves":
       System.out.println("Hoy a primera hora toca Programacion");
        break;
      case "viernes":
        System.out.println("Hoy a primera hora toca Sistemas Informaticos");
        break;
      default:
        System.out.println("No hay clase ");
    }

}
}
