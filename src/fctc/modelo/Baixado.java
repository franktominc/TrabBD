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
public class Baixado extends Movimentacao{
    protected Date dataLancamento;
    protected Double valorCorrigido;

    public Baixado(String tipo, Long id, Date data, Double valor) {
        super(tipo, id, data, valor);
    }
    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getValorCorrigido() {
        return valorCorrigido;
    }

    public void setValorCorrigido(Double valorCorrigido) {
        this.valorCorrigido = valorCorrigido;
    } 
    
    
    
}
