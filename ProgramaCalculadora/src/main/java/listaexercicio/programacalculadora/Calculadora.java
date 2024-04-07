package listaexercicio.programacalculadora;

import java.util.Scanner;

public class Calculadora {
    public double num1, num2, soma, multiplicacao, subtracao, divisao;
    
    public void somar(){
        soma = num1+num2;
        System.out.println("O valor da soma é: " + soma);
    }
    
    public void subtracao(){
        subtracao = num1 - num2;
        System.out.println("O valor da subtração é " + subtracao);
    }
    
    public void multiplicacao(){
        multiplicacao = num1 * num2;
        System.out.println("O valor da multiplicação é " + multiplicacao);
    }
    
    public void divisao(){
        divisao = num1 / num2;
        System.out.println("O valor da divisão é " + divisao);
    }
    
    public void operacoes(){
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do{
            System.out.println("\n---Qual operação você deseja realizar?---");
            System.out.println("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão\n5 - Sair");
            System.out.println("Informe a operação: ");
            escolha = scanner.nextInt();
            
            switch (escolha){
                case 1: 
                    somar();
                    break;
                case 2:
                    subtracao();
                    break;
                case 3:
                    multiplicacao();
                    break;
                case 4:
                    divisao();
                    break;
                case 5: 
                    System.out.println("\nSaindo da calculadora.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);
        
        scanner.close();
    }
}
