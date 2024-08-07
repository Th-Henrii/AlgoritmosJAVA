import java.util.Scanner;
import java.text.DecimalFormat;

public class ex014_CalculoAreaPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Informe o raio: ");
        double raio = scanner.nextDouble();

        double PI = 3.14;

        double area = PI * (raio * raio);

        System.out.println("Area: "+ df.format(area));
    }
}
