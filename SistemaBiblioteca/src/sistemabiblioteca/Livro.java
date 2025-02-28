/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author LIZANDRA
 */
public class Livro extends Item implements Emprestavel{
    private String ISBN;
    private int numeroPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, String diretor, int anoPublicacao, int anoLancamento, String ISBN, int numeroPaginas) {
        super(titulo, autor, diretor, anoPublicacao, anoLancamento);
        
        this.setISBN(ISBN);
        this.setNumeroPaginas(numeroPaginas);
    }

    public String getISBN() {
        return ISBN;
    }
    private void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    private void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    
    
    @Override
    public String emprestimo() {
       if(!this.isEmprestado()){
           this.setEmprestado(true);
           return "Empréstimo concedido para o Livro: " + this.getTitulo();
       }
       
       return "Empréstimo não concedido";
    }

    @Override
    public String devolucao(int diasAtraso) {
        if(this.isEmprestado()){
            float multa = this.multaDiasAtraso(diasAtraso);
            this.setEmprestado(false);
            return "Multa de: " + multa + "\nLivro: " + this.getTitulo() + " DEVOLVIDO";
        }
        
        return "O livro não foi emprestado";
    }

    @Override
    public float multaDiasAtraso(int diasAtraso) {
        return (float) (diasAtraso * 0.50);
    }
    
    @Override
    public String toString(){
        return "Livro: \n" + super.toString() + "\nISBN: " + this.getISBN() + "\nN° de Páginas: " + this.getNumeroPaginas();
    }
}
