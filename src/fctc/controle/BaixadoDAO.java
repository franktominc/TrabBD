/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle;

import fctc.modelo.Baixado;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Cristhian
 */
public interface BaixadoDAO {
    public boolean incluir(Baixado baixado);
    public Baixado buscar(Long id);
    public List<Baixado> listar(Comparator<Baixado> cmp);
}
