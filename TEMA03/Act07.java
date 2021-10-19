public class Act7 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce el precio del producto: ");
    double baseImponible= Integer.parseInt(System.console().readLine());
    double iva = 0.21;
    double totalIva = baseImponible * iva;
    double factura = baseImponible + totalIva;
    
        
    System.out.println(" El total de la factura es: "+ factura);
    
  }
}
