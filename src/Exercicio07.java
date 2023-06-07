import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a quantidade de vezes que deseja repetir seu nome: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(nome);
            {sc.close();}}
