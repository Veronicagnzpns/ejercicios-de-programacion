public class Act8 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce las horas semanales trabajadas: ");
    double horasTrabajadas= Integer.parseInt(System.console().readLine());
    int precioHora = 12;
    double salario = horasTrabajadas*precioHora;
    
    
        
    System.out.println(" El salario de esa semana es: "+ salario+"€");
    
  }
}
