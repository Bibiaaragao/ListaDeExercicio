package listaexercicio.programafuncionario;

public class Funcionario {
    private String nome;
    private String dataNascimento;
    private int rg;
    private int cpf;
    private String endereco;
    private String naturalidade;
    private double salario;
    private String profissao;
    private String grauInstrucao;
    private int matricula;
    
    public void cadastrar(String nome, String dataNascimento, int rg, int cpf, String endereco, String naturalidade, double salario, String profissao, String grauInstrucao, int matricula){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }
    
    public void alterar(String nome, String dataNascimento, int rg, int cpf, String endereco, String naturalidade, double salario, String profissao, String grauInstrucao, int matricula){
        cadastrar(nome, dataNascimento, rg, cpf, endereco, naturalidade, salario, profissao, grauInstrucao, matricula);
        System.out.println("\nInformações alteradas com sucesso! Confira-as abaixo:\n");
    }
    
    public void imprimir(){
        System.out.println("---Informações sobre o funcionário---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Grau de instrução: "+ this.grauInstrucao);
        System.out.println("Matrícula: " + this.matricula);
    }
}
