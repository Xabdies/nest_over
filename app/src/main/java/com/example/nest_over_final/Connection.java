package com.example.nest_over_final;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.renderscript.Script;
import android.util.Log;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Connection {

    String IP,DB,DBUserName,DBPassword;
    @SuppressLint("NewApi")
    public Connection connections (){
        IP="127.0.0.1";
        DB="Project";
        DBUserName="DESKTOP-O439JCP";
        DBPassword="";

        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        java.sql.Connection connection=null;
        String ConnectionURL =null;
        try {
            Class.forName("net.sourceforce.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlserver://" + IP +";databaseName="+ DB + ";user=" + DBUserName+ ";password=" + DBPassword + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        }catch (SQLException se) {
            Log.e("error Fom SQL", se.getMessage());}
        catch (ClassNotFoundException e) {Log.e("Error from Class", e.getMessage());}
        catch (Exception ex) {Log.e("Error from Exception",ex.getMessage());}
        return (Connection) connection;
    }

    public Statement createStatement() {
        return null;
    }

    public void close() {

    }
}
