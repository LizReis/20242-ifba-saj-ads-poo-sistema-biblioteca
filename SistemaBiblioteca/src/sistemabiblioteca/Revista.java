/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author LIZANDRA
 */
public class Revista extends Item implements Emprestavel{
    private int edicao, numeroPaginas;
    private boolean emprestado;

    public Revista(String titulo, String autor, String diretor, int anoPublicacao, int anoLancamento, int edicao, int numeroPaginas) {
        super(titulo, autor, diretor, anoPublicacao, anoLancamento);
        
        this.setEdicao(edicao);
        this.setNumeroPaginas(numeroPaginas);
    }

    public int getEdicao() {
        return edicao;
    }
    private void setEdicao(int edicao) {
        this.edicao = edicao;
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
           return "Empréstimo concedido para a Revista: " + this.getTitulo();
       }
       
       return "Empréstimo não concedido";
    }

    @Override
    public String devolucao(int diasAtraso) {
        if(this.isEmprestado()){
            float multa = this.multaDiasAtraso(diasAtraso);
            this.setEmprestado(false);
            return "Multa de: " + multa + "\nRevista: " + this.getTitulo() + " DEVOLVIDA";
        }
        
        return "A revista não foi emprestada";
    }

    @Override
    public float multaDiasAtraso(int diasAtraso) {
        return (float) (diasAtraso * 0.25);
    }
    
    
    @Override
    public String toString(){
        return "\nRevista: \n" + super.toString() + "\nISBN: " + this.getEdicao() + "\nN° de Páginas: " + this.getNumeroPaginas(); 
    }
}
