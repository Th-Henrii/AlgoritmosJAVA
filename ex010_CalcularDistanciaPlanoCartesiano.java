import java.util.Scanner;

public class ex010_CalcularDistanciaPlanoCartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto A:");
        System.out.println("================================");
        System.out.println("Digite x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Digite x2:");
        double x2 = scanner.nextDouble();
        System.out.println("================================");
        System.out.println("Digite as coordenadas do ponto B:");
        System.out.println("================================");
        System.out.println("Digite y1:");
        double y1 = scanner.nextDouble();
        System.out.println("Digite y2:");
        double y2 = scanner.nextDouble();


        double distAB = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);

        System.out.println("A distancia entre A e B é igual a  "+distAB);

    }
}
