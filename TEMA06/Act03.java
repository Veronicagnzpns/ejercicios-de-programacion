public class Act03{
  public static void main(String[] args) {
    System.out.println("Genera al azar una carta de una baraja española:");
      String numeroCarta="";  
      String paloCarta="";
      int carta=(int)(Math.random()*11)+1;
      
    switch(carta) {
      case 1:
        numeroCarta=("AS");
        break;
       case 10:
        numeroCarta=("Sota");
        break;
       case 11:
        numeroCarta=("Caballo");
        break; 
       case 12:
        numeroCarta=("Rey");
        break; 
      default:
        numeroCarta=(" "+carta);
      }
      
    switch((int)(Math.random()*4)) {
      case 0:
        paloCarta=("oro");
        break;
      case 1:
        paloCarta=("bastos");
        break;
      case 2:
        paloCarta=("espada");
        break;
        case 3:
        paloCarta=("copas");
        break; 
      default:
    }
        System.out.print(numeroCarta+" de " );
        System.out.println(paloCarta);
  }
}
