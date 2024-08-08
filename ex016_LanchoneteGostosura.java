import java.text.DecimalFormat;
import java.util.Scanner;

public class ex016_LanchoneteGostosura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalformat = new DecimalFormat("0,00");


        System.out.println("Informe a quantidade de sanduiches a serem feitos: ");
        double qtdSanduiches = scanner.nextDouble();

        double queijo = (qtdSanduiches  * 5000.00) / 1000;
        double presunto = (qtdSanduiches * 5000.00) / 1000;
        double hambuerguer = (qtdSanduiches * 10000.00) / 1000;

        System.out.println("Presunto: "+decimalformat.format(presunto)+"kg");
        System.out.println("Queijo: "+decimalformat.format(queijo)+"kg");
        System.out.println("Hambuerguer: "+decimalformat.format(hambuerguer)+"kg");
    }
}
