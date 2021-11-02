public class Act23 {

  public static void main(String[] args) {
    
   
    System.out.print("Porfavor introduzca la base imponible: ");
        double bi = Double.parseDouble(System.console().readLine());
   
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido):");
     String iva = System.console().readLine();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc)");
      String cod = System.console().readLine();
      
          int ivaN=0;

          switch (iva) {
            case "general":
            ivaN=21;
              break;
              
            case "reducido":
            ivaN=10;
              break;
              
            case "superreducido":
            ivaN=4;
              break;

            default:
            System.out.print("no existe ");
           } 
              double ivaAplicable=((bi*ivaN)/100);
              double precioSinDescuento=(bi-ivaAplicable);
            double descuento=0;
        switch (cod) {
            case "nopro":
              break;
              
            case "mitad":
           descuento= precioSinDescuento/2;
              break;
              
            case "meno5":
            descuento= precioSinDescuento-5;
              break;
              
            case "5porc":
             descuento= precioSinDescuento-(precioSinDescuento/0.05);
              break;  
              

            default:
              System.out.print("no existe ");
             } 
             
            double total = (precioSinDescuento-descuento);
              System.out.printf("Base imponible.......%6.2f\n",bi);
            System.out.printf("IVA (%2d%%)..........%6.2f\n",ivaN,ivaAplicable);
            System.out.printf("Precio con IVA ........%6.2f\n",precioSinDescuento);
            System.out.printf("Cód. promo. (%5s):.....%6.2f\n",cod,descuento);
            System.out.printf("TOTAL..................%6.2f\n", total);
  }
}


