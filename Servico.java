import java.util.List;

public class Servico implements AplicavelAoAnimal {

    private int codigo;
    private String nome;
    private double preco;
    private boolean ativo;
    private List<String> especiesPermitidas;
    private String porteMinimo;
    private String porteMaximo;

    public Servico(int codigo, String nome, double preco, boolean ativo, List<String> especiesPermitidas) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.ativo = ativo;
        this.especiesPermitidas = especiesPermitidas;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isAtivo() {
        return ativo;
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