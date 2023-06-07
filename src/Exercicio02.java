import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Por favor inserir um numero: " );
int valoruser = input.nextInt();
//calcular se o valor digitado é par ou impar
if (valoruser%2 ==0)
{valoruser+=5;} else {valoruser+=8;}

System.out.println("O resultado do calculo foi : "+valoruser);}}