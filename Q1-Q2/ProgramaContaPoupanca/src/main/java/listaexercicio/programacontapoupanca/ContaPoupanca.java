package listaexercicio.programacontapoupanca;

public class ContaPoupanca {
    private String nomeCorrentista;
    private int rg;
    private long cpf;
    private double saldo;
    private int numero;
    private String agencia;
    
    public void cadastrar(String nomeCorrentista, int rg, long cpf, double saldo, int numero, String agencia){
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }
    
    public void alterar(String nomeCorrentista, int rg, long cpf, double saldo, int numero, String agencia){
        cadastrar(nomeCorrentista, rg, cpf, saldo, numero, agencia);
        System.out.println("\nInformações alteradas com sucesso! Confira-as abaixo: \n");
    }
    
    public void imprimir(){
        System.out.println("--- Informações sobre a conta ---");
        System.out.println("Nome do correntista: " + this.nomeCorrentista);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo atual: R$" + this.saldo);
        System.out.println("Número: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        
    }
}

