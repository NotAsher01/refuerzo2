import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros={2,3,4,5,6};
        System.out.println(cualFalta(numeros));
    }
    public static int cualFalta(int[] numeros){
        Arrays.sort(numeros);
        for(int i=0;i<numeros.length-1;i++){
            if(numeros[i+1]!=numeros[i]+1){
                return numeros[i]+1;
            }
        }
        return -1;
    }
}
