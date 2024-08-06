import java.util.Scanner;

public class ex011_CalcularDiasSemAcidentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias_por_ano = 365;
        int dias_por_mes = 30;

        System.out.println("Informe quantos dias estão sem acidentes: ");
        int totalDias = scanner.nextInt();

        int Dias = totalDias % dias_por_ano;
        int meses = totalDias / dias_por_mes;
        int ano = (totalDias / dias_por_ano);


        System.out.println(+Dias+" dias "+meses+" meses "+ano+" anos ");


    }
}
