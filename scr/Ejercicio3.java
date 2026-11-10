public class Ejercicio3 {
    public static void main(String[] args) {
        String digitos="1111";
        System.out.println(sumaDigitos(digitos));
    }
    public static String sumaDigitos(String digitos){
        int suma=0;
        String resultado="";
        for(int i=0;i<digitos.length();i++){
            suma = suma+ Integer.parseInt(digitos.charAt(i)+"");
            resultado= resultado+ digitos.charAt(i);
            if(i<digitos.length()-1){
                resultado=resultado+" + ";
            }
            else {
                resultado=resultado+ " = " + suma;
            }
        }
        return resultado;
    }
}
