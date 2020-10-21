package Aplicacao1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Construtora ConstroiSuperRapido = new Construtora("55803365000146");
        Corretor corretor1 = new Corretor("Joselito", "202093761", 20000, 0, endereco);
        Corretor corretor2 = new Corretor("Amanda", "202093762", 15000, 0, endereco);

        corretor1.createVenda(1000);
        corretor2.createVenda(1500);

        ConstroiSuperRapido.setCorretor(corretor1);
        ConstroiSuperRapido.setCorretor(corretor2);

        String cnpj = ConstroiSuperRapido.getCnpj();
        Boolean isCnpj = ConstroiSuperRapido.isCNPJ();
        int totalVendas = ConstroiSuperRapido.getVendas();
        ArrayList<Corretor> corretores = ConstroiSuperRapido.getCorretor();

        System.out.println("------------------------");
        corretores.forEach(corretor -> {
            System.out.println(corretor.getNome());
            System.out.println(corretor.getMatricula());
            System.out.println(corretor.getMetaMensal());
            System.out.println(corretor.getTotalVendido());
            System.out.println("------------------------");
        });

        System.out.println("Empresa");
        System.out.println("Total vendido: " + totalVendas);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("CNPJ válido: " + isCnpj);
        System.out.println("------------------------");
    }
}
