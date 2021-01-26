/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.divasabila.latihanmvc.database;
import com.mysql.cj.jdbc.MysqlDataSource;
import edu.divasabila.latihanmvc.impl.PelangganDaoImpl;
import edu.divasabila.latihanmvc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author diky
 * Nama : Diva Sabila Ramadhan
 * NIM  : 10119039
 * Kelas: IF-1
 */
public class KingsBarbershopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
    if (connection==null){
        
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
        dataSource.setUser("root");
        dataSource.setPassword("");
        connection = dataSource.getConnection();
    }    
        return connection;
    }         
    
    public static PelangganDao getpelangganDao() throws SQLException{
        if(pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        
        return pelangganDao;
    }
}
