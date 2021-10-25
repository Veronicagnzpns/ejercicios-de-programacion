public class Act04{
  public static void main(String[] args) {
    System.out.print("-------------Calculadora de salarios---------------");
    System.out.print("Por favor, introduce las horas semanales trabajadas: ");
    double horasTrabajadas= Integer.parseInt(System.console().readLine());
    
       
     if ((horasTrabajadas <=40)) {
      int precioHora = 12;
    double salario = horasTrabajadas*precioHora;
    System.out.println(" El salario de esa semana es: "+ salario+"€");
    } else if (horasTrabajadas >=41){
      int precioHora1 = 12;
      int precioHora2 = 16;
    double salario = 40*precioHora1 + (horasTrabajadas-40)*precioHora2;
    System.out.println(" El salario de esa semana es: "+ salario+"€");
    }
    
    
  }
}

