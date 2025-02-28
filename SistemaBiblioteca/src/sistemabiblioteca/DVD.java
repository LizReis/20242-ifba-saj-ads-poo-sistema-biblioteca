/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author LIZANDRA
 */
public class DVD extends Item implements Emprestavel{
    private String genero;
    private int duracao;
    private boolean emprestado;

    public DVD(String titulo, String autor, String diretor, int anoPublicacao, int anoLancamento, String genero, int duracao) {
        super(titulo, autor, diretor, anoPublicacao, anoLancamento);
        
        this.setGenero(genero);
        this.setDuracao(duracao);
    }

    public String getGenero() {
        return genero;
    }
    private void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }
    private void setDuracao(int duracao) {
        this.duracao = duracao;
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
           return "Empréstimo concedido para o DVD: " + this.getTitulo();
       }
       
       return "Empréstimo não concedido";
    }

    @Override
    public String devolucao(int diasAtraso) {
        if(this.isEmprestado()){
            float multa = this.multaDiasAtraso(diasAtraso);
            this.setEmprestado(false);
            return "Multa de: " + multa + "\nDVD: " + this.getTitulo() + " DEVOLVIDO";
        }
        
        return "O DVD não foi emprestado";
    }

    @Override
    public float multaDiasAtraso(int diasAtraso) {
        return (float)(diasAtraso * 1.00);
    }
    
    @Override
    public String toString(){
        return "\nDVD: \n" + super.toString() + "\nGênero: " + this.getGenero() + "\nDuração(min.): " + this.getDuracao(); 
    }
}
