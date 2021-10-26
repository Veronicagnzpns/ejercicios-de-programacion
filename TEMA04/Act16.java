public class Act16 {
  public static void main(String[] args) {   
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
    System.out.print("a)verdadero b)falso");
    String respuesta = System.console().readLine();
    int a=0;
    if (respuesta.equals("a")) {
       a+=3;
    }
   System.out.print("2. Ha aumentado sus gastos de vestuario\n ");
   System.out.print("a)verdadero b)falso");
    String respuesta2 = System.console().readLine();
   
    if (respuesta2.equals("a")) {
       a+=3;
    }
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti\n");
    System.out.print("a)verdadero b)falso");
    String respuesta3 = System.console().readLine();
    
    if (respuesta3.equals("a")) {
       a+=3;
    }
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)\n ");
    System.out.print("a)verdadero b)falso");
    String respuesta4 = System.console().readLine();
    
    if (respuesta4.equals("a")) {
       a+=3;
    }
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil\n");
    System.out.print("a)verdadero b)falso");
    String respuesta5 = System.console().readLine();
   
    if (respuesta5.equals("a")) {
       a+=3;
    }
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante\n ");
    System.out.print("a)verdadero b)falso");
    String respuesta6 = System.console().readLine();
    
    if (respuesta6.equals("a")) {
       a+=3;
    }
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a\n");
    System.out.print("a)verdadero b)falso");
    String respuesta7 = System.console().readLine();
    
    if (respuesta7.equals("a")) {
       a+=3;
    }
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener muchomás trabajo\n ");
    System.out.print("a)verdadero b)falso");
    String respuesta8 = System.console().readLine();
    
    if (respuesta8.equals("a")) {
       a+=3;
    }
    System.out.print("9. Has notado que últimamente se perfuma más\n");
    System.out.print("a)verdadero b)falso");
    String respuesta9 = System.console().readLine();
   
    if (respuesta9.equals("a")) {
       a+=3;
    }
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo\n ");
    System.out.print("a)verdadero b)falso");
    String respuesta10 = System.console().readLine();
   
    if (respuesta10.equals("a")) {
       a+=3;
    }
    if ((a>=0)&&(a<=10)){
    System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
  }else if ((a>=10)&&(a<=22)){
    System.out.print(": Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
  }else if ((a>=22)&&(a<=30)){
    System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza."+a);
  }
}
}





