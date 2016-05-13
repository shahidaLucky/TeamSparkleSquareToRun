package HomePage;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 5/3/2016.
 */
public class LoginOnFb extends CommonAPI {

    @Test
    public void testFb() throws InterruptedException {

        typeByCss("#email", "shahidalus@yahoo.com");
        typeByCss("#pass", "111143lu");
        Thread.sleep(2000);
        clickByCss("#u_0_y");
        Thread.sleep(6000);
        clickByCss("._2s25>span");
        Thread.sleep(2000);
        clickByCss("#userNavigationLabel");
        clickByCss("._54nh");
        sleepFor(3);
        clickByCss("._2n_9");
        //clickByXpath(".//*[@id='u_jsonp_2_2j']/div/div[1]/div/div[1]/div/div/div[2]/a/span");
        //Thread.sleep(6000);
        navigateBack();
        clickByCss(".UFILikeLink._4x9-._4x9_._48-k");
        sleepFor(2);
    }
    //@Test
    public void testLogOut() throws InterruptedException {
        typeByCss("#email", "shahidalus@yahoo.com");
        typeByCss("#pass", "111143lu");
        clickByCss("#u_0_y");
        Thread.sleep(2000);
        clickByCss("#userNavigationLabel");
        sleepFor(2);
        clickByCss("._54nh");
        sleepFor(3);
        clickByCss("#userNavigationLabel");
        sleepFor(3);
        clickByCss("._54nh");


    }
}
