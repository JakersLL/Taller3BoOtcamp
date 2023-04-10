package sumaDeTresNumeros;

public class sumaTresNumeros {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int resultado = sumarTresNumeros(a, b, c);
        System.out.println("La suma de los tres números es: " + resultado);
    }
    public static int sumarTresNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 +num3;
        return suma;
    }
}
