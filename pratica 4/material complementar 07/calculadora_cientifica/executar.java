package calculadora_cientifica;

/**
 * executar
 */
public class executar {
    public static void main(String[] args) {
        
        System.out.println("Raiz de um inteiro: " + CalculadoraCientifica.raiz(4));
        System.out.println("Raiz de um double: " + CalculadoraCientifica.raiz(4.0));
        System.out.println("Raiz de uma String: " + CalculadoraCientifica.raiz("4"));

        System.out.println("Potencia de doys bytes: " + CalculadoraCientifica.potencia(1, 0));
        System.out.println("Potencia de duas Strings: " + CalculadoraCientifica.potencia("1", "2"));
        System.out.println("Potencia de dois inteiros: " + CalculadoraCientifica.potencia(1, 2));


    }
    
}