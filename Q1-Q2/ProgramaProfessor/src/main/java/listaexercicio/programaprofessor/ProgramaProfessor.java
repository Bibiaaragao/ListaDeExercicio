package listaexercicio.programaprofessor;

public class ProgramaProfessor {

    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        
        professor1.cadastrar("Luiz", "Mestre", "UFBA", 200, 5789.89, "Portugues e espanhol");
        System.out.println("Professor 1: \n");
        professor1.imprimir();
        professor1.alterar("Luiz", "Mestre", "UFBA", 210, 6349.89);
        professor1.alterarDisciplinas("Ingles e espanhol");
        professor1.imprimir();
        
        professor2.cadastrar("Bruna", "Doutora", "Oxford", 150, 7723.20, "Matemática");
        System.out.println("\nProfessor 2:\n");
        professor2.imprimir();
        professor2.alterar("Bruna", "Doutora", "Oxford", 160, 8123.20);
        professor2.alterarDisciplinas("Matemáica e física");
        professor2.imprimir();
    }
}
