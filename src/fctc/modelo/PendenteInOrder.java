/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.modelo;

import java.util.Comparator;

/**
 *
 * @author Cristhian
 */
public class PendenteInOrder implements Comparator<Pendente>{

    @Override
    public int compare(Pendente a, Pendente b) {
        return a.getId().compareTo(b.getId());
    }
    
}
