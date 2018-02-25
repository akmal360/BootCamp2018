package Keyword;

import Authentication.LogInPage;
import Search.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Feature extends CommonAPI {
    public void siggnin() {
        LogInPage logInPage=PageFactory.initElements(driver,LogInPage.class);
        typeByCss("", "userName");
        typeByCss("", "passCode");
        clickByCss("");

    }

    public void registration() {
        typeByCss("", "email");
        clickByCss("");

    }

    public void search() throws IOException, InterruptedException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

    public void select(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "siggnin":
                siggnin();
                break;
            case "registration":
                registration();
                break;
            case "search":
                search();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");

        }
    }

    public void selectFeature() throws IOException, InterruptedException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String[] steps = itemsToBeSearched.getDataFromExcelFileForFeatures();
        for (int i=0;i<steps.length;i++){
            select(steps[i]);
        }
    }

}
