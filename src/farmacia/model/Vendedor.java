package farmacia.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private String codigo;
    private String sexo;
    private String cpf;

    private double totalVenda;
    private List<Produto> venda = new ArrayList<>();

    public double totalVendaImp(){
        return this.venda.stream().mapToDouble(Produto::valorTotal).sum();
    }

    public void cupom(){
        this.venda.forEach(produto -> System.out.println("-> "+produto.getNome()+
                " --- Preco unitario: R$ "+produto.getPreco()+
                " --- Quantidade: "+produto.getQuantidade()+" --- Total: "+produto.valorTotal()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Produto> getVenda() {
        return venda;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cpf='" + cpf + '\'' +
                ", venda=" + venda +
                '}';
    }
}
