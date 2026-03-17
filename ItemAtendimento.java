public class ItemAtendimento {

    private AplicavelAoAnimal item;
    private int quantidade;
    private double precoUnitarioSnapshot;
    private double descontoPercent;

    public ItemAtendimento(AplicavelAoAnimal item, int quantidade, double precoUnitarioSnapshot, double descontoPercent) {
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitarioSnapshot = precoUnitarioSnapshot;
        this.descontoPercent = descontoPercent;
    }

    public double subtotalBruto() {
        return quantidade * precoUnitarioSnapshot;
    }

    public double subtotalComDesconto() {
        double bruto = subtotalBruto();
        return bruto - (bruto * descontoPercent / 100);
    }

    public AplicavelAoAnimal getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }
}