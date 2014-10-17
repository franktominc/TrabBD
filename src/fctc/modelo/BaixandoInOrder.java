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
public class BaixandoInOrder implements Comparator<Baixado> {

    @Override
    public int compare(Baixado a, Baixado b) {
        return a.getId().compareTo(b.getId());
    }
}
