package listaexercicio.programaanimal;

public class Animal {
    private String especie;
    private String dataNascimento;
    private String nome;
    private int numeroRegistro;
    private String localNascimento;
    
    public void cadastrar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento){
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }
    
    public void alterar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento){
        cadastrar(especie, dataNascimento, nome, numeroRegistro, localNascimento);
        System.out.println("\nInformações alteradas com sucesso! Confira-as abaixo: \n");
    }
    
    public void imprimir(){
        System.out.println("--- Informações sobre o animal ---");
        System.out.println("Espécie: " + this.especie);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de registro: " + this.numeroRegistro);
        System.out.println("Local de nascimento: " + this.localNascimento);
    }
}