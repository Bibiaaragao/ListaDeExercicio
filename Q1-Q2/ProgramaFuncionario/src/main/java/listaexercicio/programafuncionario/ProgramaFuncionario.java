package listaexercicio.programafuncionario;

public class ProgramaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        
        funcionario1.cadastrar("Henrique", "28/06/1996", 76429094, 652908722, "Rua das Cerejeiras", "Minas Gerais", 2539.50, "Atendente", "Ensino médio", 434768);
        System.out.println("Funcionário 1:\n");
        funcionario1.imprimir();
        funcionario1.alterar("Henrique", "28/06/1996", 76429094, 652908722, "Rua Estrela Dourada", "Minas Gerais", 2734.50, "Atendente", "Ensino médio", 434768);
        funcionario1.imprimir();
        
        funcionario2.cadastrar("Sandra", "12/11/1994", 48466523, 976365633, "Rua M", "Pernambuco", 4612.10, "Gerente", "Ensino superior", 278645);
        System.out.println("\nFuncionário 2:\n");
        funcionario2.imprimir();
        funcionario2.alterar("Sandra", "12/11/1994", 48466523, 976365633, "Rua B", "Pernambuco", 4812.10, "Gerente", "Ensino superior", 278835);
        funcionario2.imprimir();
    }
}
