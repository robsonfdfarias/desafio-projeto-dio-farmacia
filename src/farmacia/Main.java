package farmacia;

import farmacia.model.Equipamento;
import farmacia.model.Remedio;
import farmacia.model.Vendedor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Remedio dipirona = new Remedio();
        dipirona.setNome("Dipirona");
        dipirona.setFornecedor("Spharmus");
        dipirona.setGenerico("true");
        dipirona.setTarjaPreta(false);
        dipirona.setLote("120023652");
        dipirona.setValidade(LocalDate.of(2023, 11, 15));
        dipirona.setPreco(15.50);
        dipirona.setQuantidade(10);
        dipirona.setCodeRef("000012225");
        System.out.println(dipirona);

        Remedio paracetamol = new Remedio();
        paracetamol.setNome("Paracetamol 500mg");
        paracetamol.setFornecedor("Spharmus");
        paracetamol.setGenerico("Laboratorio Globo");
        paracetamol.setTarjaPreta(false);
        paracetamol.setLote("120322652");
        paracetamol.setValidade(LocalDate.of(2023, 11, 15));
        paracetamol.setPreco(20.50);
        paracetamol.setQuantidade(20);
        paracetamol.setCodeRef("000012255");
        System.out.println(paracetamol);

        Equipamento inalador = new Equipamento();
        inalador.setNome("Inalador");
        inalador.setFornecedor("Equip LTDA");
        inalador.setPreco(150.50);
        inalador.setQuantidade(5);
        inalador.setCodeRef("52240012");
        inalador.setGarantiaMes(12);
        System.out.println(inalador);

        System.out.println("---------------------------------------");
        Vendedor robson = new Vendedor();
        robson.setNome("Robson Farias");
        robson.setCpf("145.256.985-00");
        robson.setCodigo("22153");
        robson.getVenda().add(dipirona);
        robson.getVenda().add(paracetamol);
        robson.getVenda().add(inalador);
        System.out.println(robson);
        System.out.println("---------------------------");
        robson.cupom();
        System.out.println("Total: "+robson.totalVendaImp());

        //
    }
}
