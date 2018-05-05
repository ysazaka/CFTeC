/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



/**
 *
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfTeste {

    /**
     * Creates a new instance of JsfTeste
     */
    public JsfTeste() {
    }
    
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void persist(){
        
    }
    
    public java.util.List<br.data.entity.Teste> getAll(){
        return new br.data.crud.CrudTeste().getAll();
    }
    
    
    public java.util.List<br.data.entity.Teste> getSelect(){
        return new br.data.crud.CrudTeste().getAll();
    }
    
    public void remove(br.data.entity.Teste teste){
        
    }
    
    public void update(br.data.entity.Teste teste){
        
    }
}
