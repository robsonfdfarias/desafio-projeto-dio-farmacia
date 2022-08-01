package farmacia.model;

public class Equipamento extends Produto{
    private int garantiaMes;

    public int getGarantiaMes() {
        return garantiaMes;
    }

    public void setGarantiaMes(int garantiaMes) {
        this.garantiaMes = garantiaMes;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "Nome = '" + getNome() +"\'"+
                ", Fornecedor = '" + getFornecedor() +"\'"+
                ", Preco = '" + getPreco() +"\'"+
                ", Quantidade = '" + getQuantidade() +"\'"+
                ", Codigo = '" + getCodeRef() +"\'"+
                ", garantiaMes = '" + garantiaMes +"\'"+
                '}';
    }
}
