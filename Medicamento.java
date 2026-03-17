import java.util.List;

public class Medicamento implements AplicavelAoAnimal {
    
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;
    private List<String> especiesPermitidas;
    private int idadeMinima;
    private int idadeMaxima;

    public Medicamento(int codigo, String nome, double preco, int estoque, List<String> especiesPermitidas) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.especiesPermitidas = especiesPermitidas;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void reduzirEstoque(int qtd) {
        estoque -= qtd;
    }

    public void devolverEstoque(int qtd) {
        estoque += qtd;
    }

    @Override
    public boolean aplicavel(FichaAnimal a) {
        return especiesPermitidas.contains(a.getEspecie());
    }

    @Override
    public String getDescricao() {
        return nome;
    }
}