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
public class Aluno extends Pessoa {
    private int Escolaridade;
    public int getEscolaridade(){
        return Escolaridade;
    }
    public void setEscolaridade(){
        this.Escolaridade = Escolaridade;
    }
    
    private String email;
    public String getemail(){
        return email;
    }
    public void setemail(){
        this.email = email;
    }
   
 
    @Override
    protected void correr(){
        JOptionPane.showMessageDialog(null, "Comecou a correr o " );
    }

    @Override
    public void andar(){
        super.andar();
        JOptionPane.showMessageDialog(null, " Agora esta andando");
    }
   
}
