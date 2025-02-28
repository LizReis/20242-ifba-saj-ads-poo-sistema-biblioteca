/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemabiblioteca;

public interface Emprestavel {
    public String emprestimo();
    public String devolucao(int diasAtraso);
    public float multaDiasAtraso(int diasAtraso);
}
