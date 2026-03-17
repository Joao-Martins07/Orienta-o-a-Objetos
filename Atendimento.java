import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private int numero;
    private Tutor tutor;
    private List<ItemAtendimento> itens;
    private String status;
    private double descontoAtendimentoPercent;

    // Agregação: Atendimento agrega vários ItemAtendimento
    public Atendimento(int numero, Tutor tutor) {
        this.numero = numero;
        this.tutor = tutor;
        this.itens = new ArrayList<>();
        this.status = "ABERTO";
    }

    public void adicionarItem(AplicavelAoAnimal item, int qtd, double preco, double desconto) {

        if (!status.equals("ABERTO")) {
            System.out.println("Atendimento não está aberto.");
            return;
        }

        if (qtd <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }

        if (desconto > 20) {
            System.out.println("Desconto máximo do item é 20%");
            return;
        }

        if (!item.aplicavel(tutor.getAnimal())) {
            System.out.println("Item não aplicável ao animal.");
            return;
        }

        ItemAtendimento novo = new ItemAtendimento(item, qtd, preco, desconto);
        itens.add(novo);
    }

    public void aplicarDescontoAtendimento(double desconto) {

        if (desconto > 10) {
            System.out.println("Desconto máximo do atendimento é 10%");
            return;
        }

        descontoAtendimentoPercent = desconto;
    }

    public double totalBruto() {
        double total = 0;
        for (ItemAtendimento i : itens) {
            total += i.subtotalBruto();
        }
        return total;
    }

    public double totalComDescontoItens() {
        double total = 0;
        for (ItemAtendimento i : itens) {
            total += i.subtotalComDesconto();
        }
        return total;
    }

    public double totalFinal() {
        double total = totalComDescontoItens();
        return total - (total * descontoAtendimentoPercent / 100);
    }

    public void finalizar() {

        if (itens.isEmpty()) {
            System.out.println("Não é possível finalizar atendimento sem itens.");
            return;
        }

        status = "FINALIZADO";
    }

    public void resumo() {

        System.out.println("Tutor: " + tutor.getNome());
        System.out.println("Animal: " + tutor.getAnimal().resumo());

        for (ItemAtendimento i : itens) {
            System.out.println("Item: " + i.getItem().getDescricao() + " - Qtd: " + i.getQuantidade());
        }

        System.out.println("Total bruto: R$" + totalBruto());
        System.out.println("Total com desconto itens: R$" + totalComDescontoItens());
        System.out.println("Total final: R$" + totalFinal());
    }
}