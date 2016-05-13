package util;

import java.util.List;


public class TestDBConnection {

    public static void main(String[] args)throws Exception {
        DBConnect dbConnect = new DBConnect();
       // dbConnect.connectToDataBase();
        List<String> newsList = dbConnect.readDataBase();
    }
}
