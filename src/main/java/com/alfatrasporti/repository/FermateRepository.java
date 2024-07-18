package com.alfatrasporti.repository;

import com.alfatrasporti.constants.DBConfig;
import com.alfatrasporti.model.Fermata;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FermateRepository {

    public static List<Fermata> selezionaTutteFermate()
    {
        List<Fermata> fermateList = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM fermate";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Fermata b = new Fermata(
                        rs.getInt("idFermata"),
                        rs.getString("nomeFermata"),
                        rs.getString("tipoFermata"),
                        rs.getString("zonaFermata")
                );
                fermateList.add(b);
                System.out.println();
            }
            return fermateList;

        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();
    }

}
