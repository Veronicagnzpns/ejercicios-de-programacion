public class Act02{
  public static void main(String[] args) {
    System.out.println("Genera al azar piedra, papel o tijera:");
      String numeroCarta="";  
      String paloCarta="";
      int carta=(int)(Math.random()*12)+1;
      
    switch(carta) {
      case 1:
        numeroCarta=("A");
        break;
       case 10:
        numeroCarta=("J");
        break;
       case 11:
        numeroCarta=("Q");
        break; 
       case 12:
        numeroCarta=("K");
        break; 
      default:
        numeroCarta=(" "+carta);
      }
      
    switch((int)(Math.random()*4)) {
      case 0:
        paloCarta=(" picas ♠");
        break;
      case 1:
        paloCarta=("corazones ♥");
        break;
      case 2:
        paloCarta=("diamantes ♦");
        break;
        case 3:
        paloCarta=("tréboles ♣");
        break; 
      default:
    }
        System.out.print(numeroCarta+" de " );
        System.out.println(paloCarta);
  }
}
