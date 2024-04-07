package listaexercicio.programacontapoupanca;

public class ProgramaContaPoupanca {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ContaPoupanca contaPoupanca2 =new ContaPoupanca();
        
        contaPoupanca1.cadastrar("Ana", 27698658, 124549672, 2678.90, 1567, "Banco Brasil");
        System.out.println("\nPessoa 1:\n");
        contaPoupanca1.imprimir();
        contaPoupanca1.alterar("Ana", 27697458, 673946189, 3589.69, 8456, "Banco Brasil");
        contaPoupanca1.imprimir();
        
        contaPoupanca1.cadastrar("Maria", 754321860, 876753429, 4675.70, 5389, "Banco Nordeste");
        System.out.println("\nPessoa 2:\n");
        contaPoupanca1.imprimir();
        contaPoupanca1.alterar("Maria", 754321860, 876752749, 3148.72, 9219, "Banco Brasil");
        contaPoupanca1.imprimir();
    }
}
