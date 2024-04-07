package listaexercicio.programacarro;

public class ProgramaCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro1.cadastrar(12, "Audi", "Azul", "R8", 2022, 4, "Etanol", 50, 500000, true);
        System.out.println("Carro 1:\n");
        carro1.listar();
        carro1.alterar(16, "Audi", "Azul", "R8", 2022, 2, "Etanol", 50, 469000, false);
        carro1.listar();
        
        carro2.cadastrar(368, "Ferrari", "Vermelho", "Ferrari 812", 2024, 4, "Gasolina", 10, 790000, true);
        System.out.println("\nCarro 2:\n");
        carro2.listar();
        carro2.alterar(379, "Ferrari", "Vermelho", "Ferrari 812", 2023, 2, "Gasolina", 9, 790000, true);
        carro2.listar();
    }
}
