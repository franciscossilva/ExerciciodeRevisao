import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args){
    // declarando variavieis
    int  quantidade=0;
    int  numerosentre =0;
    ArrayList<Integer> numeroslancados = new ArrayList<Integer>();
    Scanner teclado = new Scanner(System.in);

    //Lendo 20 numeros aleatorios
    for (int i = 1; 1 <= 20; i++){
    System.out.print("Digite o  valor do # "+ i + "numero: ");
    int  numero = teclado.nextInt();

    //Verificando se o numero esta entre 0 e 100
        if (numero>=0 && numero<=100){
            numerosentre++;}

        quantidade++;
        numeroslancados.add(numero);
    }
    teclado.close();

        //Mostrando os valores dos resultados
    System.out.println("Valor de numeros lidos: "+quantidade);
    System.out.println("Numero sorteados foram: "+numeroslancados);
    System.out.println("Quantidade de numero entre 0 e 100: "+ numerosentre);}}

