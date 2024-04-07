package listaexercicio.programaanimal;

public class ProgramaAnimal {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        
        animal1.cadastrar("Zebra", "15/04/2012", "Lulu", 8755, "Austrália");
        System.out.println("\nAnimal 1:\n");
        animal1.imprimir();
        animal1.alterar("Zebra", "17/04/2012", "Lulu", 6491, "Austrália");
        animal1.imprimir();
        
        animal2.cadastrar("Pantera", "05/03/2015", "Mel", 2645, "Madagascar");
        System.out.println("\nAnimal 2:\n");
        animal2.imprimir();
        animal2.alterar("Pantera", "17/03/2015", "Mel", 7634, "Brasil");
        animal2.imprimir();
    }
}
