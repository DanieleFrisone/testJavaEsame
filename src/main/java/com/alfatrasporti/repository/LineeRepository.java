package com.alfatrasporti.repository;

import com.alfatrasporti.constants.DBConfig;
import com.alfatrasporti.model.Fermata;
import com.alfatrasporti.model.Linee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LineeRepository {

    public static List<Linee> selezionaTutteLinee()
    {
        List<Linee> lineeList = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM Linee";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Linee b = new Linee(
                        rs.getInt("idLinea"),
                        rs.getString("nomeLinea")
                );
                lineeList.add(b);
                System.out.println();
            }
            return lineeList;

        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();
    }

}
