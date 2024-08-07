import java.text.DecimalFormat;
import java.util.Scanner;

public class ex015_DividirContaEm3Pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalformat = new DecimalFormat("#.00");
        DecimalFormat df = new DecimalFormat("#,##");

        System.out.println("Digite o valor da conta: ");
        double conta = scanner.nextDouble();

        double andre = conta / 3;
        int carlos = (int) (conta / 3);
        int felipe  = (int) (conta / 3);

        System.out.println("Andre ira pagar R$"+decimalformat.format(andre));
        System.out.println("Carlos ira pagar R$"+df.format(carlos));
        System.out.println("Felipe ira pagar R$"+df.format(felipe));
    }
}
