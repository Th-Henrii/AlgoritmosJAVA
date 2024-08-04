import java.util.Scanner;

public class ex009_FabricaDeCamisetas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas camisetas P foram vendidas: ");
        int cmtP = scanner.nextInt();
        System.out.println("Informe quantas camisetas M foram vendidas: ");
        int cmtM = scanner.nextInt();
        System.out.println("Informe quantas camisetas G foram vendidas: ");
        int cmtG = scanner.nextInt();

        double vlrP = 10.00;
        double vlrM = 12.00;
        double vlrG = 15.00;

        double totalArrcd = (cmtP * vlrP) + (cmtM * vlrM) + (cmtG + vlrG);
        int totalqtd = cmtP + cmtM + cmtG;

        System.out.println("Foram vendidos um total de "+totalqtd+" camisetas.");
        System.out.println("O equivalente a R$"+totalArrcd+" reais");
    }
}
