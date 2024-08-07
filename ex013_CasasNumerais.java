import java.util.Scanner;
import java.text.DecimalFormat;

public class ex013_CasasNumerais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scanner.nextInt();

        int centena = num / 100 ;
        int dezena = (num /100) % 10 ;
        int unidade = num  % 10;

        System.out.println("CENTENA: "+centena);
        System.out.println("DEZENA: "+dezena);
        System.out.println("UNIDADE: "+unidade);



    }
}
