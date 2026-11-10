public class Ejercicio2 {
    public static void main(String[] args) {
        int dia=20;
        int mes=12;

        System.out.println(diasHastaNochevieja(dia,mes));
    }
    public static int diasHastaNochevieja(int dia, int mes){
        int[] dias={31,28,31,30,31,30,31,31,30,31,30,31};
        int res=dias[mes-1]-dia;
        for(int i=mes;i<12;i++){
            res=res+dias[i];
        }
        return res;
    }
}
