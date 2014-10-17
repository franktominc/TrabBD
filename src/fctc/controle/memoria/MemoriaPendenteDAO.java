/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle.memoria;

import fctc.modelo.Baixado;
import fctc.modelo.Pendente;
import java.util.Collections;
import java.util.Comparator;
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

        Collections.sort(pendentes, new Comparator<Pendente>() {
            @Override
            public int compare(Pendente o1, Pendente o2) {
                if(o1.getId() < o2.getId())
                    return -1;
                if(o1.getId() == o2.getId())
                    return 0;
                return 1;
            }
        });
        return pendentes;
    }
}
