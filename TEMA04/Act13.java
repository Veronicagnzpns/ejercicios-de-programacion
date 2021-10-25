public class Act13 {
  public static void main(String[] args) {   
     int n1;
     int n2;
     int n3;
     System.out.print("------PROGRAMA ORDENADDOR DE NUMEROS------- ");
    System.out.print("Inserte un numero: ");
     n1 = Integer.parseInt(System.console().readLine());
   
    System.out.print("Inserte un numero: ");
     n2 = Integer.parseInt(System.console().readLine());
   
    System.out.print("Inserte un numero: ");
     n3 = Integer.parseInt(System.console().readLine());
   
   if ((n1<n2) && (n2<n3)){
     System.out.print("1º: "+n1+" \n2º: "+ n2+" \n3º: "+ n3);
     } else if ((n2<n1) && (n1<n3)){
     System.out.print("1º: "+n2+" \n2º: "+ n1+" \n3º: "+ n3);
     } else if ((n3<n1) && (n1<n2)){
     System.out.print("1º: "+n3+" \n2º: "+ n1+" \n3º: "+ n2);
     } else if ((n1<n3) && (n3<n2)){
     System.out.print("1º: "+n1+" \n2º: "+ n3+" \n3º: "+ n2);
     } else if ((n3<n2) && (n2<n1)){
     System.out.print("1º: "+ n3+" \n2º: "+ n2+" \n3º: "+ n1);
     }else if ((n2<n3) && (n3<n1)){
     System.out.print("1º: "+n2+" \n2º: "+ n3+" \n3º: "+ n1);
     }
  }
}

