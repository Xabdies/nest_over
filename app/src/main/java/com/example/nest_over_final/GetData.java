package com.example.nest_over_final;

import java.sql.ClientInfoStatus;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.Result;

public class GetData {


    Connection connect;
    String ConnectionResult="";
    Boolean isSuccess=false;

    public List<Map<String,String>> getdata (){
        List<Map<String,String>> data=null;
        data=new ArrayList<Map<String,String>>();

        try {
            Connection connection = new Connection();
            connect= connection.connections();
            if (connect==null){
                ConnectionResult="Check Your Internet Access!";
            }else {
                String query="select * from countries";
                Statement stmt=connect.createStatement();
                ResultSet rs=stmt.executeQuery(query);

                while (rs.next()) {
                    Map<String,String> datanum=new HashMap<String, String>();
                    datanum.put("ID",rs.getString("IdNo"));
                    datanum.put("UniversityId",rs.getString("IdNo"));
                    datanum.put("FacultyId",rs.getString("IdNo"));
                    data.add(datanum);
                }
                ConnectionResult="Successful";
                isSuccess=true;
                connect.close();
            }
        }catch (Exception ex) {
            isSuccess=false;
            ConnectionResult=ex.getMessage();
        }
        return data;
    }
}
