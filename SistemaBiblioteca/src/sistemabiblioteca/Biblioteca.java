/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private ArrayList<Item> disponiveis;
    private ArrayList<Item> emprestados;
    
    public Biblioteca(){
        this.disponiveis = new ArrayList<>();
        this.emprestados = new ArrayList<>();
    }

    public List<Item> getDisponiveis() {
        return emprestados;
    }

    public List<Item> getEmprestados() {
        return emprestados;
    }
    
    public String adicionarItem(Item item){
        if(!disponiveis.contains(item)){
            this.disponiveis.add(item);
            
            return "Item adicionado";
        }
        return "Esse item já existe na biblioteca";
        
    }
    
    public String removerItem(Item item){
        if(disponiveis.contains(item)){
            this.disponiveis.remove(item);
            return "Item removido";
        }
        return "Item não encontrado na biblioteca";
    }
    
    public String emprestarItem(Item item){
        if(disponiveis.contains(item)){
            disponiveis.remove(item);
            emprestados.add(item);
            
            return "Item emprestado: " + item.getTitulo();
        }
        return "Item não disponivel para emprestimo";
    }
    
    public String devolucaoItem(Item item){
        if(emprestados.contains(item)){
            emprestados.remove(item);
            disponiveis.add(item);
            
            return "Item devolvido: " + item.getTitulo();
        }
        return "O item está disponivel";
    }
}
