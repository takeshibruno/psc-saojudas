package impressora;

public class Impressora { 
    static void exibir (float numero){
        System.out.println(numero);
    }

    static void exibir (float numero1, float numero2){
        //System.out.printf("%d, %d", numero1, numero2);
        System.out.println(numero1 + ", " + numero2);
    }

    static void exibir (float numero, String input){
        //System.out.printf("%d, %s", numero, input);
        System.out.println(numero + ", " + input);
    }

    static void exibir (String input, float numero){
        //System.out.printf("%s, %d", input, numero);
        System.out.println(input + ", " + numero);
    }

    static void exibir (String input1, String input2, String input3){
        //System.out.printf("%s, %s, %s", input1, input2, input3);
        System.out.println(input1 + ", " + input2 + ", " + input3);
    }

    static void exibir (int numero1, int numero2, String input){
        //System.out.printf("%d, %d, %s", numero1, numero2, input);
        System.out.println(numero1 + ", " + numero2 + ", " + input);
    }
}