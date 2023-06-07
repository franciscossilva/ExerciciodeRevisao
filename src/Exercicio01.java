import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("DIgite o valor de A :  ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B : ");
        int b = scanner.nextInt();
        //declarando a variavel c:
        int c;

        if (a==b){
        c= a+b;}
        else {
            c=a*b;}
        //Usando o conceito de que valores iguais soma e valores difentes multiplique o 1 pelo 2.

        System.out.println("O resultado atribuido a C é: "+c);
        }}
