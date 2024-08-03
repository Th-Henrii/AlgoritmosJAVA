import java.util.Scanner;

public class ex008_MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Informe o peso da primeira nota: ");
        int peso1 = scanner.nextInt();
        System.out.println("Informe a segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Informe o peso da segunda nota: ");
        int peso2 = scanner.nextInt();
        System.out.println("Informe a terceira nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Informe o peso da terceira nota: ");
        int peso3 = scanner.nextInt();

        int c1 = nota1*peso1;
        int c2 = nota2*peso2;
        int c3 = nota3*peso3;
        int pesototal = peso1+peso2+peso3;
        int mediaPonderada = (c1+c2+c3)/pesototal;

        System.out.println("A media ponderada corresponde a "+mediaPonderada);
    }
}
