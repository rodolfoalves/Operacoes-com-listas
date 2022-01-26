import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Random gerador = new Random();

        Calculadora calculadora = new Calculadora();

        ArrayList<Float> lista1 = new ArrayList<Float>();
        ArrayList<Float> lista2 = new ArrayList<Float>();


        for (int i = 0; i < 5; i++){
            lista1.add(gerador.nextFloat(100));
            lista2.add(gerador.nextFloat(100));
        }

        int menu = 0;

        do{
            System.out.println("1 para apresentar Listas");
            System.out.println("2 para somar listas");
            System.out.println("3 para subtrair listas");
            System.out.println("4 para multiplicar listas");
            System.out.println("5 para dividir listas");
            System.out.println("0 para fechar aplicação");
            menu = scanner.nextInt();
            switch (menu){

                case 1:{
                    System.out.println(lista1);
                    System.out.println(lista2);
                    break;
                }

                case 2:{
                    calculadora.soma(lista1, lista2);
                    break;
                }

                case 3:{
                    calculadora.subtracao(lista1, lista2);
                }

                case 4:{
                    calculadora.multiplicacao(lista1, lista2);
                }

                case 5:{
                    calculadora.divisao(lista1, lista2);
                }
            }
        }while (menu != 0);
    }
}