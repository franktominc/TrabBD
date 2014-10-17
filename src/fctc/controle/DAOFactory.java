/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fctc.controle;

import fctc.controle.postgre.PostgreDAOFactory;

/**
 *
 * @author Cristhian
 */
public abstract class DAOFactory {
    
    
    public abstract BaixadoDAO getBaixadoDAO();
    public abstract PendenteDAO getPendenteDAO();
    public static DAOFactory getDAOFactory(){
        return new PostgreDAOFactory();
    }
}
