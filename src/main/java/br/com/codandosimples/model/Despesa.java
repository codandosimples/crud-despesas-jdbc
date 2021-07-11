package br.com.codandosimples.model;

import java.time.LocalDate;

public class Despesa {

    private Long id;
    private String descricao;
    private LocalDate data;
    private double valor;
    private Categoria categoria;

    public Despesa(Long id, String descricao, LocalDate data, double valor, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Despesa(String descricao, LocalDate data, double valor, Categoria categoria) {
        this(null, descricao, data, valor, categoria);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
