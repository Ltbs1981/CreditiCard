public class Main {
    public static void main(String[] args) {
        // Criando um cartão de crédito com limite de 1000.00
        CartaoDeCredito cartao = new CartaoDeCredito(1000.00);

        // Criando compras
        Compra compra1 = new Compra("Cafeteira", 150.00);
        Compra compra2 = new Compra("Livro de Java", 200.00);
        Compra compra3 = new Compra("Fone de Ouvido", 100.00); // Alterado para 100.00
        Compra compra4 = new Compra("Mouse Gamer", 200.00);

        // Tentando lançar as compras no cartão
        System.out.println("Lançando compras:");
        System.out.println("Compra 1: " + (cartao.lancaCompra(compra1) ? "Aprovada" : "Rejeitada"));
        System.out.println("Compra 2: " + (cartao.lancaCompra(compra2) ? "Aprovada" : "Rejeitada"));
        System.out.println("Compra 3: " + (cartao.lancaCompra(compra3) ? "Aprovada" : "Rejeitada"));
        System.out.println("Compra 4: " + (cartao.lancaCompra(compra4) ? "Aprovada" : "Rejeitada"));

        // Exibindo o saldo do cartão
        System.out.println("\n" + cartao);

        // Exibindo as compras aprovadas, ordenadas por valor
        System.out.println("\nCompras aprovadas (ordenadas por valor):");
        for (Compra compra : cartao.getComprasOrdenadas()) {
            System.out.println(compra);
        }
    }
}
