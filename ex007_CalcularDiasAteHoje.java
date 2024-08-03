import java.util.Scanner;

public class ex007_CalcularDiasAteHoje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia de hoje: ");
        int dia = scanner.nextInt();
        System.out.println("Informe o mês: ");
        int mes = scanner.nextInt();

        int diasPass = ((mes*30)-30) + dia;

        System.out.println("Se passaram "+diasPass+" dias desde o inicio do ano.");

    }
}
