/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle.memoria;

import fctc.controle.BaixadoDAO;
import fctc.modelo.Baixado;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cristhian
 */
class MemoriaBaixadoDAO implements BaixadoDAO {
    private List<Baixado> baixados;
    
    public MemoriaBaixadoDAO() {
        baixados = new LinkedList<>();
    }

    @Override
    public boolean incluir(Baixado baixado) {
        if (buscar(baixado.getId()) == null ) {
            baixados.add(baixado);
            return true;
        }
        return false;
    }

    @Override
    public Baixado buscar(Long id) {
        for (Baixado b : baixados) {
            if (b.getId()==id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Baixado> listar(Comparator<Baixado> cmp) {
        Collections.sort(baixados, cmp);
        return baixados;
    }
}
