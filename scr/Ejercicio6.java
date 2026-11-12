public class Ejercicio6 {
    public static void main(String[] args) {
        int num=4618;
        if(esHyperpar(num)==true){
            System.out.println("Lo es");
        }
        else{
            System.out.println("No lo es");
        }
    }
    public static boolean esHyperpar(int num){
        String palabra = Integer.toString(num);
        for (int i=0;i<palabra.length();i++){
            if(!(palabra.charAt(i) %2==0)){
                return false;
            }
        }
        return true;
    }
}
