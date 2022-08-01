package farmacia.model;

import java.time.LocalDate;

public class Remedio extends Produto{
    private boolean tarjaPreta;
    private String generico;
    private String lote;
    private LocalDate validade;

    public boolean isTarjaPreta() {
        return tarjaPreta;
    }

    public void setTarjaPreta(boolean tarjaPreta) {
        this.tarjaPreta = tarjaPreta;
    }

    public String getGenerico() {
        return generico;
    }

    public void setGenerico(String generico) {
        this.generico = generico;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Remedio{" +
                "Descricao = '" + getNome() + '\'' +
                ", Preco = '" + getPreco() + '\'' +
                ", Quantidade = '" + getQuantidade() + '\'' +
                ", Fornecedor = '" + getFornecedor() + '\'' +
                ", validade = '" + validade + '\'' +
                ", tarjaPreta = '" + tarjaPreta +
                ", generico = '" + generico + '\'' +
                ", lote = '" + lote + '\'' +
                ", validade = '" + validade + '\'' +
                '}';
    }
}
