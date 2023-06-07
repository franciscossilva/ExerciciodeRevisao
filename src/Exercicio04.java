import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int soma = 0;
        int idade;

        // criar o laço para repetir e ler as 20 idades
        for (int i=1; i<=20; i++){
            System.out.println("Digite a idade da pessoa numero "+ i +": ");
            idade=scanner.nextInt();
            soma=soma+idade;}
        //calcular a media das idades das pessoas
        double media = (double) soma/20;

        System.out.println("A media das idades é: "+media);}}