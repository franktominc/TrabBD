/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle.memoria;

import fctc.modelo.Baixado;
import fctc.modelo.Pendente;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cristhian
 */
public class MemoriaPendenteDAO {
    private List<Pendente> pendentes;
    
    public MemoriaPendenteDAO(){
        pendentes = new LinkedList<>();   
    }
    
    public boolean incluir(Pendente pendente){
        if (buscar(pendente.getId()) == null) {
            pendentes.add(pendente);
            return true;
            
        }
        return false;
    }

    public Pendente buscar(Long id) {
        for (Pendente p: pendentes) {
            if (p.getId()==id) {
                return p;
            }
        }
        return null;
    }
    
    public List<Pendente> listar() {
        //Collections.sort(pendentes);
        return pendentes;
    }
}
