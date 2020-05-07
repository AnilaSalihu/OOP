package oop.cacttus.education.java10.abstracts.ushtrimi;

import java.util.ArrayList;

public class MsSqlConnection implements IDbConnection{
    @Override
    public void connect(String connectionString) throws SqlConnectionStringException{
        //microsoft e implementon qasjen per MSSQL
        //kontrollo se a jane 4 parametra ndaj me pike presje (;),
        //pastaj secilen gna ndaje me barazim (=) dhe kontrollo se a jane
        //Server, Database, User Id, Password
        throw  new SqlConnectionStringException("Nuk jane specifikuar te gjitha parameterat");
    }

    @Override
    public void open() throws  SqlException{
        throw  new SqlException("Firewall block the connection");
    }

    @Override
    public void close() {
        //ketu e mbyll session e databazes
    }

    @Override
    public void dispose() {
                //shkateron objektin nga memoria
    }

    @Override
    public IDbConnection getConnection() {
        //kthen koneksionin active
        return null;
    }

    @Override
    public int execute(String sqlString) {
        //"INSERT INTO tbl(Id) VALUES(1)"
        return 0;
    }

    @Override
    public ArrayList<Object> executeReader(String sqlString) {
        // SELECT * FROM Products;
        return null;
    }
}
