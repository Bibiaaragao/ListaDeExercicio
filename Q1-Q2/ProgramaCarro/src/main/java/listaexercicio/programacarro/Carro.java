package listaexercicio.programacarro;
  
public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private int numeroPortas;
    private String tipoCombustivel;
    private int quantDisponivel;
    private double preco;
    private boolean completo;
    
    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, int quantDisponivel, double preco, boolean completo){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantDisponivel = quantDisponivel;
        this.preco = preco;
        this.completo = completo;
    }
    
    public void alterar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, int quantDisponivel, double preco, boolean completo){
        cadastrar(codigo, marca, cor, modelo, anoFabricacao, numeroPortas, tipoCombustivel, quantDisponivel, preco, completo);
        System.out.println("\nAs informações do carro foram alteradas com sucesso! Confira-as abaixo:\n");
    }
    
    public void listar(){
        System.out.println("--- Informações sobre o carro ---");
        System.out.println("Código: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("Número de portas: " + this.numeroPortas);
        System.out.println("Tipo de combustível: " + this.tipoCombustivel);
        System.out.println("Quantidade disponível: " + this.quantDisponivel);
        System.out.println("Preço: " + this.preco);
        System.out.println("Está completo? " + (this.completo ? "Sim" : "Não"));
        
    }
    
}

