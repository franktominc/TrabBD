/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle;

import fctc.modelo.Baixado;
import fctc.modelo.Pendente;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Cristhian
 */
public interface PendenteDAO {
    public boolean incluir(Pendente pendente);
    public Pendente buscar(Long id);
    public List<Pendente> listar ();
}
