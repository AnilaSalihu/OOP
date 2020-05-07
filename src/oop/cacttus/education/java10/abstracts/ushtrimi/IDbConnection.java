package oop.cacttus.education.java10.abstracts.ushtrimi;

import java.util.ArrayList;

//fully abstract
public interface IDbConnection {
    //connectionString = "Server=localhost;Database=AdventureWorks;User Id=naim; Password=1234;"
    public void connect(String connectionString) throws SqlConnectionStringException;
    public void open() throws SqlException;
    public void close();
    public void dispose();

    public IDbConnection getConnection();//merr koneskionin qe ju ke qas

    //>=0 success, negative failure
    public int execute(String sqlString);

    //me kthy tabelen
    public ArrayList<Object> executeReader(String sqlString);

}
