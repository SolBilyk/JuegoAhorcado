
package Ahorcado;


class guiones {

static char[] getGuionesFromPalabra(String paalabra){
        //Se cuentan las letras de la palabra secreta 
        int nLetrasPalabraSecreta = palabraSecreta.length();
        //array de char
        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        //Para rellenar la palabra secreta con guiones 
        for(int i = 0; i < palabraSecreta.length(); i++) {
         
            palabraGuiones[i] = '_'; //comillas simples
            
        }
    return palabraGuiones;
}
}


