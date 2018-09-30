package br.unicamp.ft.m183414_a179870.imoveis_sale;

public class Imovel {

    private String nome;
    private String endereco;
    private String contato;
    private int foto;
    private double valor;

    public Imovel(String nome, String endereco, String contato, int foto, double valor) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.foto = foto;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
