import java.util.Scanner;

public class casting {

    public static void main(String[] args) {
        final Double CONST = 0.23;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de idade: ");
        Integer idade = scan.nextInt();
        Double soma = idade.doubleValue() + CONST;
        System.out.println("O numero da sorte é: "+ soma);
    }
}
