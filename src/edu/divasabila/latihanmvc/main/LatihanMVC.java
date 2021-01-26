/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.divasabila.latihanmvc.main;
import edu.divasabila.latihanmvc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
/**
 *
 * @author diky
 * Nama : Diva Sabila Ramadhan 
 * NIM  : 10119039
 * Kelas: IF-1
 */
public class LatihanMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        KingsBarbershopDatabase.getConnection();
    }
    
}
