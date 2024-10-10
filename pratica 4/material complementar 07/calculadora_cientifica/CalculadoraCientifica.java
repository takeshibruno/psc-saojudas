package calculadora_cientifica;

public class CalculadoraCientifica {
    
    static double raiz (int numero){
        return Math.sqrt(numero);
    }

    static double raiz (double numero){
        return Math.sqrt(numero);
    }

    static double raiz (String numero){
        return Math.sqrt(Double.parseDouble(numero));
    }

    static double potencia (byte a, byte b){
        return Math.pow(a, b);
    }

    static double potencia (String s1, String s2){
        return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
    }
    
    static double potencia (int a, double b){
        return Math.pow(a,b);
    }
}
