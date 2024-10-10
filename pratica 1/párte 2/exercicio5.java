package pratica2;

/*Crie um algoritmo que calcule o valor de uma dívida, submetida a juros
compostos: Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros
(em %) e N representa o número de meses. Responda: se você deve para o cartão de
crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses?
*/

import javax.swing.*;

public class exercicio5 {
    public static void main(String[] args) {
        double resultado = calculaJurosCompostos(100, 10, 8);
        JOptionPane.showMessageDialog(null,"O valor que você deve após 8 meses é: " + resultado);
    }

    public static double calculaJurosCompostos (int valor_inicial, int juros, int meses){
        Double a = Double.valueOf(1 + (juros/100));
        Double b = Double.valueOf(meses);
        
        double resultado = valor_inicial * Math.pow(a, b);
        return resultado;
    }
}
