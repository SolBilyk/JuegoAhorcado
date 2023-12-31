
package Ahorcado;


import static Ahorcado.palabraSecreta.obtenerPalabraSecreta;
import java.util.Scanner;


public class JuegoAhorcado {
    
    public static void main(String[] args) {
        //En esta parte se mostrará las palabras y su longitud
        String palabraSecreta = obtenerPalabraSecreta();
//        //Muestra la palabra
//        System.out.println(palabraSecreta);
        char[] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
       
        //Para terminar el juego:
        boolean juegoTerminado = false;
        try (Scanner lector = new Scanner(System.in)) {
            int intentos = 3;
            
            do {
                System.out.println("Te quedan " + intentos + " intentos");
                System.out.println(palabraGuiones);
                System.out.println("Ingresa una letra:");
                char letra = (char) lector.next().charAt(0);
                boolean algunaLetraAcertada = false;
                for(int i = 0; i < palabraSecreta.length(); i++){
                    if(palabraSecreta.charAt(i) == letra ){
                        palabraGuiones[i] = letra;
                        algunaLetraAcertada = true;
                    }
                }
                
                if(algunaLetraAcertada){
                    System.out.println("No has acertado ninguna letra");
                    --intentos;
                    if(intentos == 0){
                        System.out.println("PERDISTE!!! ");
                        juegoTerminado = true;
                    }
                }
                else{
                    boolean juegoGanado = hayGuiones(palabraGuiones);       
                    if (juegoGanado){
                        System.out.println("Has ganado el juego!!");
                        juegoTerminado = true;
                    }
                }
            }while(juegoTerminado);
        }
}
    
    
   
    static boolean hayGuiones(char[] array){
    for(char l:array){
        if(l=='_') return true;
        }
        return false;
    }

    private static char[] getGuionesFromPalabra(String palabraSecreta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}