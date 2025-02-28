/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabiblioteca;


public class SistemaBiblioteca {

    public static void main(String[] args) {
        Livro livro01 = new Livro("Game of Thrones", "George R. R. Martin", " ", 1996, 1996, "23hd2h38e", 592);
        
        Revista revista01 = new Revista("Veja", "sei la", " ", 2024, 2025, 1, 45);
        
        DVD dvd01 = new DVD("Shrek", "William Steig", "Andrew e Vicky", 2001, 2010, "Animação", 120);
        
        Quadro quadro01 = new Quadro("O grito", "Edvard Munch", " ", 1893, 1893, "Expressionista");
        
        System.out.println(livro01.toString());
        System.out.println(livro01.emprestimo());
        System.out.println(livro01.emprestimo());
        System.out.println(livro01.devolucao(10));
        //-----------------------------------------------------------------
        
        Biblioteca bb01 = new Biblioteca();
        
        System.out.println(bb01.adicionarItem(dvd01));
        System.out.println(bb01.devolucaoItem(dvd01));
        System.out.println(bb01.emprestarItem(dvd01));
        System.out.println(bb01.devolucaoItem(dvd01));
    }
    
}
