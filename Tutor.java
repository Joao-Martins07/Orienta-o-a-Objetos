public class Tutor {

    private int id;
    private String nome;
    private String cpf;
    private FichaAnimal animal;

    // Agregação: Tutor possui um objeto FichaAnimal
    public Tutor(int id, String nome, String cpf, FichaAnimal animal) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }

    public FichaAnimal getAnimal() {
        return animal;
    }
}