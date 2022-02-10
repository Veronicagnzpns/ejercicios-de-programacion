package MisFunciones;

/**
 * Funciones geométricas
 * 
 * @author Luis José Sánchez
 */
public class Matematicas {

  /**
   * Calcula el volumen de un cilindro.
   * Tanto el radio como la altura se deben proporcionar en las
   * mismas unidades para que el resultado sea congruente.
   * 
   * @param r radio del cilindro
   * @param h altura del cilindro
   * @return  volumen del cilindro
   */
  public static double volumenCilindro(double r, double h) {
    return Math.PI * r * r * h;  
  }
  
  /**
   * Calcula la longitud de una circunferencia a partir del radio.
   * 
   * @param r radio de la circunferencia
   * @return  longitud de la circunferencia
   */
  public static double longitudCircunferencia(double r) {
    return 2 * Math.PI * r;  
  }
  
  public static int voltea (int n){
	  int volteado=0;
	  while(n>0){
      volteado=(volteado*10)+(n%10);
      n/=10;
		}
    return volteado;
	}
	  
  public static boolean esCapicua (int n){
		boolean esCapicua=false;
		if(voltea(n)==n){
			esCapicua=true;
		}
	return esCapicua;
		
     }	
     
   public static boolean esPrimo(int n) {
    boolean esPrimo = true;
    
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }
    
    return esPrimo;
  }	
  
  public static int digitos(int n){
	  int i=0;
	  for(i=0;n>0;i++){
		  n/=10;
		  }
	   return i;
	  }

}
