package homePage;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 4/28/2016.
 */
public class Search extends CommonAPI {

    @Test
    public void test() throws InterruptedException {

        System.out.println("Test has started");
        typeByCss("#search", "ipad");
        Thread.sleep(2000);
        clickOnCss(".searchbar-submit.js-searchbar-submit");
        navigateBack();
        Thread.sleep(2000);
        clickOnCss(".js-flyout-toggle.dropdown");
        typeByCss("#search", "baby dolls");
        clickOnCss(".searchbar-submit.js-searchbar-submit");
        Thread.sleep(2000);
        navigateBack();
        clickOnCss(".dropdown-link.js-flyout-toggle.flyout-toggle");
        Thread.sleep(2000);
        clickOnCss(".js-account-flyout-logged-out.active>li>a");
        Thread.sleep(2000);
//        clickOnCss(".dropdown-link js-flyout-toggle flyout-toggle");
//        Thread.sleep(2000);
        //clickByXpath(".//*[@id='flyout15']/ul/span[2]/li[1]");

        clickByXpath("html/body/div[2]/section/section[4]/div/div/div/div/div/div/form/div/button");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test has ended");
    }
}
