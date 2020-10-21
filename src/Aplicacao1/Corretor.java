/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao1;

/**
 *
 * @author 123
 */
public class Corretor {
    private String nome;
    private String matricula;
    private int metaMensal;
    private int totalVendido;
    private Endereco endereco;

    public Corretor(String nome, String matricula, int metaMensal, int totalVendido, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.metaMensal = metaMensal;
        this.totalVendido = totalVendido;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(int metaMensal) {
        this.metaMensal = metaMensal;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void createVenda(int venda) {
        this.totalVendido += venda;
    }
}
