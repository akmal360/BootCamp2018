package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchMenu extends CommonAPI {
    public void serchInputBox(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books", Keys.ENTER);
        driver.getTitle();
    }
}
