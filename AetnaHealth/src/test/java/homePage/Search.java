package homePage;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 4/29/2016.
 */
public class Search extends CommonAPI{

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        clickByXpath("html/body/div[3]/div[2]/header/div/div/div/nav/ul/li[4]/a");
        Thread.sleep(3000);
        navigateBack();
        clickByCss("#globalSearch");
        Thread.sleep(3000);

    }
}