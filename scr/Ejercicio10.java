public class Ejercicio10 {
    public static void main(String[] args) {
        int compartimentos=3, maxlitros=500, diferencia=30;

        System.out.println(litros(compartimentos,maxlitros,diferencia));
    }
    public static int litros(int compartimentos, int maxLitros, int diferencia){
        int suma=0;
        for(int i=1;i<=compartimentos;i++){
            suma=suma+maxLitros;
            maxLitros= maxLitros-diferencia;
        }
        return suma;
    }
}
