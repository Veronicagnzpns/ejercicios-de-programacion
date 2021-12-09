public class Act36 {

  public static void main(String[] args) {
    
    System.out.print("----------------CAPICUA----------------\n");

    System.out.print("Porfavor introduzca un numero entero: ");
    long nIntro = Long.parseLong(System.console().readLine());
    long n=nIntro;
    long volteado=0;
    while(n>0){
      volteado=(volteado*10)+(n%10);
      n/=10;
    }
    if (volteado==nIntro){
      System.out.print("El "+nIntro+" es capicua");
    }else {
      System.out.print("El "+nIntro+" no es capicua");
    }
      
}
}
