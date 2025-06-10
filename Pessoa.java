/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public abstract class Pessoa {
    protected String Nome;
    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    private int Idade;
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    private int Telefone;
    public int getTelefone() {
        return Telefone;
    }
    public void setTelefone(int Telefone){
        this.Telefone = Telefone;
    }
    
    
    
    
    private Pessoa(String Nome, int Idade, int Telefone) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Telefone = Telefone;
        
    }
    
    
    
    public Pessoa(){
        Nome = "Vazio";
        
    }
    
    protected abstract void correr();
    
    public void criar(){
        JOptionPane.showMessageDialog(null, Nome + " Foi Criado");
    }
    
    public void andar(){
        JOptionPane.showMessageDialog(null, Nome + " Comecou a andar");
    }
    
}
