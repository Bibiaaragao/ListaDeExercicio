package listaexercicio.programaprofessor;

public class Professor {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargaHoraria;
    private double salario;
    private String descricaoDisciplinas;
    
    public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }
    
    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario){
        cadastrar(nome, titulacao, formacao, cargaHoraria, salario, descricaoDisciplinas);
        System.out.println("\nInformações alteradas com sucesso!\n");
    }
    
    public void alterarDisciplinas(String descricaoDisciplinas){
        this.descricaoDisciplinas = descricaoDisciplinas;
        System.out.println("Descrição das disciplinas alteradas com sucesso! Confira as alerações abaixo: \n");
    }
    
    public void imprimir(){
        System.out.println("---Informações sobre o professor---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Formação: " + this.formacao);
        System.out.println("Carga Horária: " + this.cargaHoraria + "h");
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Descrição das disciplinas: " + this.descricaoDisciplinas);
    }
}

