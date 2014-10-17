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
public class Pendente extends Movimentacao {
    private Date dataAgendada;
    private Double txJuros;
    private Double mora;

    public Pendente(Date dataAgendada, Double txJuros, Double mora, String tipo, Long id, Date data, Double valor) {
        super(tipo, id, data, valor);
        this.dataAgendada = dataAgendada;
        this.txJuros = txJuros;
        this.mora = mora;
    }
    
    public Double getMora() {
        return mora;
    }

    public void setMora(Double mora) {
        this.mora = mora;
    }

    public Double getTxJuros() {
        return txJuros;
    }

    public void setTxJuros(Double txJuros) {
        this.txJuros = txJuros;
    }

    public Date getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(Date dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
    
}
