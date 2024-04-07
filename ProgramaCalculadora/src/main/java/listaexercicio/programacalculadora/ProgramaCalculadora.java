package listaexercicio.programacalculadora;

import java.util.Scanner;

public class ProgramaCalculadora {

    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        
        Calculadora calculo = new Calculadora();
        
        System.out.println("Informe o primeiro número: ");
        calculo.num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        calculo.num2 = scanner.nextDouble();
        
        calculo.operacoes();
        
        scanner.close();
    }
}
