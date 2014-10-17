/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.modelo;

import java.util.Date;

/**
 *
 * @author Cristhian
 */
public abstract class Movimentacao {
    protected String tipo;
    protected Long id;
    protected Date data;
    protected Double valor;
  

    public Movimentacao(String tipo, Long id, Date data, Double valor) {
        this.tipo = tipo;
        this.id = id;
        this.data = data;
        this.valor = valor;
    }
    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }    
}
