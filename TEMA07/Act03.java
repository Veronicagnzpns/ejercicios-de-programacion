public class Act03 {
  public static void main(String[] args) {
    System.out.printf("----------ARRAYS NUMERO ALEATORIO, CUADRADO, CUBO-----------\n");

    int[] numero= new int[20];
    int[] cuadrado= new int[20];  
    int[] cubo= new int[20];
    for(int i=0;i<20;i++){
      numero[i] = (int)(Math.random() * 101);
      cuadrado[i]= numero[i]*numero[i];
      cubo[i]=cuadrado[i]*cuadrado[i]*cuadrado[i];
      }
    for(int i=0;i<20;i++){
    System.out.printf("numero[%2d] %11d  ",i,numero[i]);
    System.out.printf("cuadrado[%2d] %11d  ",i,cuadrado[i]);
    System.out.printf("cubo[%2d] %11d ",i,cubo[i]);
     System.out.println();
  }
    
  }
}
