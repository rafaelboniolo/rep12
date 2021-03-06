/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author User
 */
@Entity
public class Paciente extends Pessoa{
    //@Column(nullable=false)
    private String laudo;
    
    //@Column(nullable=false)
    @ManyToOne
    private Responsavel responsavel;
    
  
    public Paciente() {
    }
    
    public Paciente(String laudo, Responsavel responsavel, String nome, int idade, String tel, String cel, String cpf, String rg, Date nascimento, Endereco endereco) {
        super(nome, idade, tel, cel, cpf, rg, nascimento, endereco);
        this.laudo = laudo;
        this.responsavel = responsavel;
       
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

}
