public class Ejercicio7 {
    public static void main(String[] args) {
        int desde=50;
        int hasta=99;
        System.out.println(canales(hasta,desde) + " veces");
    }
    public static int canales(int desde, int hasta){
        int delante, atras;
        if(hasta>=desde){
            delante=hasta-desde;
        }
        else {
            delante=(99-desde)+hasta;
        }
        if(desde>=hasta){
            atras=desde-hasta;
        }
        else {
            atras=desde+(99-hasta);
        }
        if(delante<atras){
            return delante;
        }
        else{
            return atras;
        }
    }
}
