package reader;

import util.DBConnect;
import util.DataReader;

import java.io.IOException;
import java.util.List;


public class ReadNewsData {

    DataReader dataReader = new DataReader();
    DBConnect dbConnect = new DBConnect();

    public String[] getDataFromExcelFile()throws IOException{
        String path = System.getProperty("user.dir")+"\\data\\searchData.xls";
        String [] news = dataReader.fileReader(path);
        return news;
    }
    public List<String> getDataFromDB()throws IOException, Exception{
        List<String> newsList = dbConnect.readDataBase();
        return newsList;
    }
}
