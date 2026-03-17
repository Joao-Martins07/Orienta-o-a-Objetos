public class FichaAnimal {

    private String especie;
    private String raca;
    private int idade;
    private String porte;

    // Encapsulamento: atributos privados
    public FichaAnimal(String especie, String raca, int idade, String porte) {
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public String getPorte() {
        return porte;
    }

    public String resumo() {
        return especie + " - " + raca + " (" + idade + " anos, porte " + porte + ")";
    }
}