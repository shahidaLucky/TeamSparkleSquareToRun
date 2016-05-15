package HomePage;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 5/14/2016.
 */
public class Uploading extends CommonAPI {
    @Test
    public void testFileUpload() throws InterruptedException {
        typeByCss("#email", "shahidalus@yahoo.com");
        typeByCss("#pass", "111143lu");
        clickByCss("#u_0_y");
        Thread.sleep(2000);
        clickByCss("._2s25>span");
        sleepFor(2);
        //clickByCss("._5qtp");
        //clickByCss("#js_11");
       // clickByXpath(".//*[@id='u_jsonp_2_2']/div/a[3]");
        //navigateBack();
       // sleepFor(2);
        clickById("js_19");
        sleepFor(2);
       // clickByCss("._5qtp");
        //clickByXpath(".//*[@id='js_11']/span/span[1]");
        //upLoadFile(".//*[@id='js_1k']","\"F:\\1275454_4915710271150_1772511224_o[1].png\"");

    }
}
