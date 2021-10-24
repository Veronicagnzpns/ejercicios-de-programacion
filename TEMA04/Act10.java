public class Act10{
  public static void main(String[] args) {
    System.out.print("\nPorfavor, introduzca el dia de mes de tu nacimiento: ");
        String mes = System.console().readLine();
        System.out.print("ahora introduzca el dia: ");
        double dia = Double.parseDouble(System.console().readLine());

      switch (mes.toLowerCase()) { //pasa las palabras a minusculas para que no haya error
      case "enero":
        if (dia>=21){
        System.out.println( "tu signo es Acuario " );
        } else if (dia<=20) {
        System.out.println(" tu signo es Capricornio" );
        }
        break;
      case "febrero":
         if (dia<=19){
        System.out.println( "tu signo es Acuario " );
        } else if (dia>=20) {
        System.out.println(" tu signo es Piscis" );
        }
        break;
      case "marzo":
        if (dia<=20){
        System.out.println( "tu signo es Piscis " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Aries" );
        }
        break;
      case "abril":
       if (dia<=20){
        System.out.println( "tu signo es Aries " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Tauro" );
        }
        break;
      case "mayo":
        if (dia<=20){
        System.out.println( "tu signo es Tauro " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Géminis" );
        }
        case "junio":
        if (dia<=20){
        System.out.println( "tu signo es Géminis " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Cancer" );
        }
        break;
        case "julio":
         if (dia<=20){
        System.out.println( "tu signo es Cancer" );
        } else if (dia>=21) {
        System.out.println(" tu signo es Leo" );
        }
        break;
        case "agosto":
        if (dia<=20){
        System.out.println( "tu signo es Leo " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Virgo" );
        }        
        break;
        case "septiembre":
         if (dia<=20){
        System.out.println( "tu signo es Virgo " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Libra" );
        }
        break;case "octubre":
         if (dia<=20){
        System.out.println( "tu signo es Libra " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Escorpio" );
        }
        break;
        case "noviembre":
         if (dia<=20){
        System.out.println( "tu signo es Escorpio " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Sagitario" );
        }
        break;
        case "diciembre":
         if (dia<=20){
        System.out.println( "tu signo es Sagitario " );
        } else if (dia>=21) {
        System.out.println(" tu signo es Capricornio" );
        }
        break;
      default:
        System.out.println("No hay clase ");
    } 
  }
}   
  
