/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carl
 */
public class DBHand {
    
    static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/MyNewDB";
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement ps = null;
    private ResultSet resultSet = null;
    
    public DBHand(){
         
    }
    
    public boolean setConnection(String user, String password){
        boolean isConnectionOK = false;
        
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, user, password);
            isConnectionOK = true;
        }
        catch(SQLException sqlException){
            System.err.println("Driver loaded, but something went wrong somewhere else!");
            sqlException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFound){
            System.err.println("Couldnt find driver.");
            classNotFound.printStackTrace();
        }
        
        return isConnectionOK;
    }
    
    public List getNumbers(String query){
        List list = new ArrayList();
        
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            
            int i = numberOfColumns;
            while(resultSet.next()){
                int num = resultSet.getInt(i);
                list.add(num);
            }
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
            System.out.println("Error: Something went wrong");
        }
        finally{
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch(Exception exception){
                exception.printStackTrace();
            }
        }
        return list;
    }
    
    public String getAllData(String query){
        String results = null;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            results = "Authors Table of Books Database:\n";
            
            for (int i =1; i <=numberOfColumns; i++){
                results += metaData.getColumnName(i) + '\t';
            }
            results += '\n';
            
            while(resultSet.next()){
                for(int i =1; i <=numberOfColumns; i++){
                    results += resultSet.getObject(i).toString() + '\t';
                }
                results += '\n';
            }
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
            results = "Error: Something went wrong.";
        }
        finally{
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch(Exception exception){
                exception.printStackTrace();
            }
        }
        return results;
    }
    
    public int insert(String sql){
        int value = 0;
        try{
            statement = connection.createStatement();
            value = statement.executeUpdate(sql);
        }
        catch(SQLException excep){
            Logger.getLogger(DBHand.class.getName()).log(Level.SEVERE, null, excep);
        }
        return value;
    }

    public Connection getConnection() {
        return connection;
    }
    
}
