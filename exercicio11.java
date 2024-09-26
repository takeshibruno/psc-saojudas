package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio11 {
    public static void main(String[] args) {
        double totalResidencial = 0; double totalComercial = 0; double totalIndustrial = 0;
        int contadorResidencial = 0; int contadorComercial = 0;

        while (true) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (ou 0 para sair):"));
            if (codigo == 0) {
                break;
            }
            double consumoKWh = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos durante o mês:"));
            int tipoConsumidor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1 - residencial, 2 - comercial, 3 - industrial):"));

            double precoKWh;
            switch (tipoConsumidor) {
                case 1:
                    precoKWh = 0.3;
                    totalResidencial += consumoKWh * precoKWh;
                    contadorResidencial++;
                    break;
                case 2:
                    precoKWh = 0.5;
                    totalComercial += consumoKWh * precoKWh;
                    contadorComercial++;
                    break;
                case 3:
                    precoKWh = 0.7;
                    totalIndustrial += consumoKWh * precoKWh;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de consumidor inválido. Tente novamente.");
            }
        }

        double mediaConsumoResidencial = contadorResidencial > 0 ? totalResidencial / contadorResidencial : 0;
        double mediaConsumoComercial = contadorComercial > 0 ? totalComercial / contadorComercial : 0;

        JOptionPane.showMessageDialog(null, "Custo total para cada consumidor:\n" +
                "Residencial: R$" + totalResidencial + "\n" +
                "Comercial: R$" + totalComercial + "\n" +
                "Industrial: R$" + totalIndustrial + "\n" +
                "Média de consumo (Residencial): " + mediaConsumoResidencial + " kWh\n" +
                "Média de consumo (Comercial): " + mediaConsumoComercial + " kWh");
    }
}


