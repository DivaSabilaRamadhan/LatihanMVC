/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.divasabila.latihanmvc.impl;

import edu.divasabila.latihanmvc.entity.Pelanggan;
import edu.divasabila.latihanmvc.error.PelangganException;
import edu.divasabila.latihanmvc.service.PelangganDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author diky
 * Nama  : Diva Sabila Ramadhan 
 * NIM   : 10119039
 * Kelas : IF-1
 */
public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;
    
    private final String insertpelanggan = "INSERT INTO PELANGGAN(NAMA,ALAMAT,TELEPON,EMAIL) VALUES(?,?,?,?)";

    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insertpelanggan);
            statement.setString(1,pelanggan.getNama());
            statement.setString(2,pelanggan.getAlamat());
            statement.setString(3,pelanggan.getTelepon());
            statement.setString(4,pelanggan.getEmail());
            statement.executeUpdate();
            
        } catch (SQLException e){
            throw new PelangganException(e.getMessage());
        }finally{
            try {
                sata
            } 
        }
    }

    @Override
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePelanggan(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan getPelanggan(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan getPelanggan(String email) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pelanggan> selectAllPelanggan() throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
