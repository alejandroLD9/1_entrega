package dominio;

import java.util.ArrayList;
import java.util.List;

public class Mates {

    // 1. La suma 0 + 1 + 2 + ... + n.
    public static String sumatorio (int n){
        int suma = 0;
        
        for (int i = 0; i <= n; i++){
            
            suma = suma + i;      
        }
        
        return "El resultado del sumatorio desde 0 hasta "+ n +" es: "+ suma; 
    }

    // 2. El factorial de un número.
    public static String factorial (int n){
        int multi = 1;
        
        for (int i = 1; i <= n; i++){
            
            multi = multi * i;    
        }

        return "El factorial de "+ n + " es: "+ multi;
    }
    
    // 3. La potencia n-ésima de un número natural.
    public static String potencia(int n, int exp){
        int potencia = 1;

        for(int i = 0; i < exp; i++){

            potencia = potencia * n;
        }

        return "El resultado de "+ n +" elevado a "+ exp +" es: " + potencia;
    }

    // 4. La suma de los elementos de una lista de números.
    public static String sumaLista(List<Integer> numeros) {
        int suma = 0;

        for (int i : numeros) {

            suma = suma + i;
        }

        return "La suma de los elementos que contiene la lista da como resultado: "+ suma;
    }

    // 5. Media aritmética de una lista de números
    public static String media(List<Integer> numeros) {
        int suma = 0;

        for (int i : numeros) {

            suma = suma + i;
        }

        return "La media aritmetica de los numeros que contiene esta lista es: "+ (double) suma / numeros.size();
    }
    
    // 6. Desviación típica de una lista de números
    public static String desviacionTipica(List<Integer> numeros) {
        int n = numeros.size();

        double suma = 0;
        double sumaCuadrados = 0;

        for (double num : numeros) {

            suma = suma + num;
            sumaCuadrados = sumaCuadrados + num * num;
        }

        double media = suma / n;
        double varianza = (sumaCuadrados / n) - (media * media);
        double desviacion = Math.sqrt(varianza);

        return "La desviacion tipica es : "+ desviacion;
    }

    // 7. Suma de los primeros números pares hasta n
    public static String sumaPares(int n) {
        int suma = 0;

        for (int i = n; i >= 2; i -= 2) {

            suma = suma + i;
        }

        return "La suma de los numeros pares hasta "+ n +" es: "+ suma;
    }

    // 8. Suma de los elementos pares de una lista
    public static String sumaParesLista(List<Integer> numeros) {
        int suma = 0;

        for (int i : numeros) {

            if (i % 2 == 0) {
                suma = suma + i;
            }
        }

        return "La suma de los numeros pares de la lista es: "+ suma;
    }

    // 9. Obtener lista con los números pares de la lista inicial
    public static String listaPares(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();

        for (int i : numeros) {

            if (i % 2 == 0) {
                pares.add(i);
            }
        }

        return "Los numeros pares de la lista son: "+ pares;
    }

    // 10. Lista de los primeros números pares hasta n
    public static String listaPares(int n) {
        List<Integer> pares = new ArrayList<>();
        
        for (int i = n; i >= 0; i--) {

            if (i % 2 == 0){

                pares.add(i);
            } 
        }

        return "La lista de los numeros pares hasta "+ n + " es: "+ pares;
    }

     // 11. Producto escalar de dos listas del mismo tamaño
     public static String productoEscalar(List<Integer> lista1, List<Integer> lista2) {
        int productoEscalar = 0;

        for (int i = 0; i < lista1.size(); i++) {

            productoEscalar = productoEscalar + lista1.get(i) * lista2.get(i);
        }

        return "El producto escalar entre los numeros de las dos listas es: "+ productoEscalar;
    }
}
