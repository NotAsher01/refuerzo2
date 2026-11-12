import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros={1,2,6,17,18,22,35,46,109,143};
        System.out.println("La mediana es: "+mediana(numeros));
    }
    public static double mediana(int[] numeros){
        Arrays.sort(numeros);
        int longitud= numeros.length;
        double mediana=0;
        if(longitud%2==0){
            mediana=numeros[longitud/2];
            mediana=(mediana+numeros[longitud/2-1])/2;
        } else if (longitud%2!=0) {
            mediana=numeros[longitud/2];
        }
        return mediana;
    }
}
