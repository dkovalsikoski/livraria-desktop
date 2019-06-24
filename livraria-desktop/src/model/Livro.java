package model;

import java.time.LocalDate;
public class Livro {

    private int id;
    private String titulo;
    private LocalDate data_lacamento;
    private int quantidade;
    private float preco;
    private Editora editora_id;

    public LocalDate getData_lacamento() {
        return data_lacamento;
    }

    public void setData_lacamento(LocalDate data_lacamento) {
        this.data_lacamento = data_lacamento;
    }

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

    public void setEditora_id(Editora editora_id)
    {
        this.editora_id = editora_id;
    }

}
