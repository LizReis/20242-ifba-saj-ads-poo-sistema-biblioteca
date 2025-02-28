/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author LIZANDRA
 */
public abstract class Item {
    private String titulo, autor, diretor;
    private int anoPublicacao, anoLancamento;
    
    public Item(String titulo, String autor, String diretor, int anoPublicacao, int anoLancamento){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setDiretor(diretor);
        this.setAnoPublicacao(anoPublicacao);
        this.setAnoLancamento(anoLancamento);
    }

    public String getTitulo() {
        return titulo;
    }
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    private void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDiretor() {
        return diretor;
    }
    private void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    private void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    private void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    
    public String toString(){
        return "Titulo: " + this.getTitulo() + "\n" + "Autor(a): " + this.getAutor() + "\n" + "Diretor(a): " + this.getDiretor() + "\n" + "Lançamento: " + this.getAnoLancamento() + "\n" + "Publicação: " + this.getAnoPublicacao();
    }
}
