public class Act02 {
  public static void main(String[] args) {   
       System.out.print("-------HORARIO--------- \n");
    System.out.print("Por favor, introduzca un hora del dia: ");
    int horaDelDia = Integer.parseInt(System.console().readLine());
    
     if ((horaDelDia >= 6) && (horaDelDia <= 12)) {
      System.out.println("Buenos Dias");
    } else if ((horaDelDia >= 13) && (horaDelDia <= 20)){
      System.out.println("Buenas Tardes");
    } else if (( horaDelDia >= 21 ) && ( horaDelDia  <=24 )){
     System.out.println("Buenas Noches");
    } else if ((horaDelDia >=0) && (horaDelDia<=5)){
       System.out.println("Buenas Noches");
    }
     else {
      System.out.println("No existe.");
      }
  }
    
    

}


