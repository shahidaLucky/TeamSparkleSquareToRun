package news;

import base.CommonAPI;
import org.testng.annotations.Test;
import reader.ReadNewsData;

import java.io.IOException;


public class Search extends CommonAPI {
    ReadNewsData readNewsData = new ReadNewsData();
    @Test
    public void searchNews() throws InterruptedException,IOException{
            String [] data = readNewsData.getDataFromExcelFile();
            clickByCss("#search-button");
            Thread.sleep(1000);
            int counter = 0;
            for(String st:data){
                if(counter==0) {
                    typeByCss("#search-input-field", st);
                    takeEnterKeys("#search-input-field");
                    clearInputField("#searchInputTop");
                    Thread.sleep(1000);
                    counter++;
                } else {
                    typeByCss("#searchInputTop", st);
                    takeEnterKeys("#searchInputTop");
                    Thread.sleep(1000);
                    clearInputField("#searchInputTop");
                }

        }
    }
}
