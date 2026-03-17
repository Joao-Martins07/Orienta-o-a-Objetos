import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Criando animal
        FichaAnimal animal = new FichaAnimal("Cachorro", "Labrador", 5, "Grande");

        // Criando tutor
        Tutor tutor = new Tutor(1, "Carlos Silva", "12345678900", animal);

        // Criando serviços
        Servico banho = new Servico(1, "Banho", 50, true, Arrays.asList("Cachorro", "Gato"));
        Servico consulta = new Servico(2, "Consulta", 120, true, Arrays.asList("Cachorro", "Gato"));

        // Criando medicamento
        Medicamento remedio = new Medicamento(1, "Antibiótico", 80, 10, Arrays.asList("Cachorro"));

        // Abrindo atendimento
        Atendimento atendimento = new Atendimento(1001, tutor);

        // Adicionando itens
        atendimento.adicionarItem(banho, 1, banho.getPreco(), 10);
        atendimento.adicionarItem(consulta, 1, consulta.getPreco(), 0);
        atendimento.adicionarItem(remedio, 2, remedio.getPreco(), 5);

        // Aplicando desconto geral
        atendimento.aplicarDescontoAtendimento(5);

        // Finalizando atendimento
        atendimento.finalizar();

        // Exibindo resumo
        atendimento.resumo();
    }
}