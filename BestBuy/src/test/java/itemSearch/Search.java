package itemSearch;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 5/13/2016.
 */
public class Search extends CommonAPI {
    //@Test
    public void creatingAccount() throws InterruptedException {

        clickByCss(".account");
        clickByXpath(".//*[@id='header']/div[1]/header/div[2]/div[3]/form/div/a[2]");
        typeByCss("#fld-firstName", "Shahida");
        typeByCss("#fld-lastName", "Lucky");
        typeByCss("#fld-e", "shahida_lucky@yahoo.com");
        typeByCss("#fld-p1", "111143lu");
        typeByCss("#fld-p2", "111143lu");
        typeByCss("#fld-phone", "347-405-5427");
        clickByCss(".cia-form__submit-button.js-submit-button");
    }
        @Test
        public void lookingForProducts() throws InterruptedException {

            clickByCss("#gh-search-input");
            typeByCss("#gh-search-input","ipad");
            takeEnterKeys(".search-button");
            sleepFor(2);
            clickByCss(".col-xs-12.apple-grey.ipad-air-two-button.bottom-border");
            sleepFor(1);
            clickByCss(".btn.btn-primary.btn-sm.btn-block");
            sleepFor(1);
        }


}
