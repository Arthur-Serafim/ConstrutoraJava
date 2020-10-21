/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao1;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author 123
 */
public class Construtora {
    private String cnpj;
    private ArrayList<Corretor> corretores = new ArrayList<Corretor>();
    private int totalVendas = 0;

    public Construtora(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Corretor> getCorretor() {
        return this.corretores;
    }

    public void setCorretor(Corretor corretor) {
        this.corretores.add(corretor);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getVendas() {
        this.corretores.forEach(corretor -> {
            this.totalVendas += corretor.getTotalVendido();
        });

        return this.totalVendas;
    }

    public boolean isCNPJ() {
        String CNPJ = this.cnpj;

        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222")
                || CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888")
                || CNPJ.equals("99999999999999") || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 2;

            for (i = 11; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;

                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;

            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

            sm = 0;
            peso = 2;

            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;

                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;

            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
}
