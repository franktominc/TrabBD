/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle.memoria;

import fctc.controle.BaixadoDAO;
import fctc.controle.DAOFactory;
import fctc.controle.PendenteDAO;

/**
 *
 * @author Cristhian
 */
public class MemoriaDAOFactory extends DAOFactory{

    @Override
    public BaixadoDAO getBaixadoDAO() {
        return new MemoriaBaixadoDAO();
    }

    @Override
    public PendenteDAO getPendenteDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
