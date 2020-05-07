package oop.cacttus.education.java10.abstracts.ushtrimi;

import java.util.ArrayList;

public class MySqlConnection implements IDbConnection {
    @Override
    public void connect(String connectionString) {
        System.out.println("U konektua ne:");
        System.out.println(connectionString);
    }

    @Override
    public void open() {
        System.out.println("Koneksioni u hap me sukses");
    }

    @Override
    public void close() {
        System.out.println("Koneksioni u mbyll");
    }

    @Override
    public void dispose() {
        System.out.println("referenca e koneksionit u shkatrua nga memoria");
    }

    @Override
    public IDbConnection getConnection() {
        return new MySqlConnection();
    }

    @Override
    public int execute(String sqlString) {
        return 0;
    }

    @Override
    public ArrayList<Object> executeReader(String sqlString) {
        return null;
    }
}
