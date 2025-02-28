/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author LIZANDRA
 */
public class Quadro extends Item{
    private String estilo;

    public Quadro(String titulo, String autor, String diretor, int anoPublicacao, int anoLancamento, String estilo) {
        super(titulo, autor, diretor, anoPublicacao, anoLancamento);
        
        this.setEstilo(estilo);
    }

    public String getEstilo() {
        return estilo;
    }
    private void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    @Override
    public String toString(){
        return "\nQuadro: \n" + super.toString() + "\nEstilo: " + this.getEstilo(); 
    }
    
}
