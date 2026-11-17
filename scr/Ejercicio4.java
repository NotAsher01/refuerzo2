public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros= {1,3,1,8,3,1};

        System.out.println("La moda es: " + moda(numeros));
    }
    public static int moda(int[] numeros){
        int moda= numeros[0];
        int maxfrec=0;
        for(int i=0;i<numeros.length;i++){
            int freq=0;
            for(int j=0;j<numeros.length;j++){
                if(numeros[i]==numeros[j]){
                    freq++;
                }
            }
            if(freq>maxfrec){
                maxfrec=freq;
                moda=numeros[i];
            }
        }
        return moda;
    }
}
