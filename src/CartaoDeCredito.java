import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    // Retorna uma lista de compras ordenadas pelo valor
    public List<Compra> getComprasOrdenadas() {
        List<Compra> comprasOrdenadas = new ArrayList<>(compras);
        Collections.sort(comprasOrdenadas);
        return comprasOrdenadas;
    }

    @Override
    public String toString() {
        return "CartaoDeCredito: limite = " + limite + ", saldo = " + saldo;
    }
}
