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
public class Funcionario extends Pessoa {
    private int cpf;
    public int getcpf(){
        return cpf;
    }
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public String Setor;
   
    @Override
    protected void correr(){
        JOptionPane.showMessageDialog(null, "Estava atrasado entao comecou a correr o ");
    }
    
    @Override
    public void andar(){
        super.andar();
        JOptionPane.showMessageDialog(null, " Agora esta andando");
    }
    
}
