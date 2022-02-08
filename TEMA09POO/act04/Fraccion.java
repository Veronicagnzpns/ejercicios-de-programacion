public class Fraccion{
   private int numerador;
   private int denominador;

   public void invierte() {
     int num=this.numerador;
     this.numerador=this.denominador;
     this.denominador=num;
     String.out.println("Fraccion invertda " + this.numerador + "/" + this.denominador);
   }
   
/*
   public void simplifica() {

    
    }

    public void multiplica() {

    
    }

    public void divide() {

    
    }*/

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
}