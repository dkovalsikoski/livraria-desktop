package model;

import java.util.Date;

public class Livro {

    private int id;
    private String titulo;
    private Date data_lacamento;
    private int quantidade;
    private float preco;
    private Editora editora_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData_lacamento() {
        return data_lacamento;
    }

    public void setData_lacamento(Date data_lacamento) {
        this.data_lacamento = data_lacamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Editora getEditora_id() {
        return editora_id;
    }

    public void setEditora_id(Editora editora_id) {
        this.editora_id = editora_id;
    }

}
