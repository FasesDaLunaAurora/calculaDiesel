package operacao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Rota {

    public void planejarDia() {
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Quantas rotas serão feitas no dia?"));

        double somaKm = 0;
        double somaLitros = 0;

        for (int i = 1; i <= quantidadeRotas; i++) {
            double kmRota = Double.parseDouble(JOptionPane.showInputDialog("Qual a extenção em Km da " + i + "° rota?"));
            somaKm += kmRota;
            somaLitros += kmRota / 2.5; 
        }

        double valorLitroDiesel = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por litro do diesel:"));
        double custoTotal = somaLitros * valorLitroDiesel;

        DecimalFormat df = new DecimalFormat("#.##"); 

        JOptionPane.showMessageDialog(null, "Total de km: " + df.format(somaKm) + " km\n" +
                                          "Litros de combustível necessários: " + df.format(somaLitros) + " litros\n" +
                                          "Custo total: R$" + df.format(custoTotal));
    }
}
