/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fctc.controle.postgre;

import fctc.controle.BaixadoDAO;
import fctc.controle.DAOFactory;
import fctc.controle.PendenteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristhian
 */
public class PostgreDAOFactory extends DAOFactory{

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String DBURL = "jdbc:postgresql://localhost:5432/Trabalho_BD";
    private static Connection connect = null;
    
    public static Connection getConection(){
        if(connect == null){
            try {
                Class.forName(DRIVER);
                connect = DriverManager.getConnection(DBURL, "postgres","postgres");
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
            }catch(SQLException e){
                    e.printStackTrace();
                
            }
        }
        return connect;
    }

    @Override
    public BaixadoDAO getBaixadoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PendenteDAO getPendenteDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
