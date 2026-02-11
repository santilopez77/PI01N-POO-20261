package uniquindio.edu.co;

public class Ejercicio6 {

    /**
     * Metodo que permite determinar si un caracter es vocal
     * @param letra
     * @return
     */
    public static boolean esVocal(char letra){
        boolean bandera = false;
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
            bandera = true;
        }
        return bandera;
    }

    /**
     *
     * @param palabra
     * @return
     */
    public static int contarVocales(String palabra){
        int contador = 0;
        for(int i = 0; i < palabra.length() ; i++){
            char caracter = palabra.charAt(i);
            if(!esVocal(caracter)){
                contador++;
            }
        }
        return contador;
    }

    //opcion 2
    public static int contarVocales2(String palabra){
        int contador = 0;
        for(int i = 0; i < palabra.length() ; i++){
            char caracter = palabra.charAt(i);
            if(caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String argd[]){
        String palabra = "pedro";
        System.out.println("La cantidad de vocales que tiene la palabra " + palabra + " es: " + contarVocales2(palabra));
    }

}
