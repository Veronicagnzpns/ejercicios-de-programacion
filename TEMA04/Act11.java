public class Act11{
  public static void main(String[] args) {
    int hora;
    int minutos;
    System.out.print("\n----Calculadora de segundos dependidendo de las horas y minutos ");
    System.out.print("\nPorfavor, introduzca la hora: ");
        hora = Integer.parseInt(System.console().readLine());
        System.out.print("ahora introduzca el valor de los minutos: ");
        minutos = Integer.parseInt(System.console().readLine());
    
         System.out.println("El resultado de los segundos es " + (hora*3600)+(minutos*60) +" s");
         
}
}
