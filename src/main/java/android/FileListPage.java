package android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileListPage extends CommonPage{

    private String headertext_xpath = "//*[@text='ownCloud']";
    private String documentstext_description = "LinearLayout-";
    private String sharebutton_id = "com.owncloud.android:id/action_share_file";

    public FileListPage() {
        super();
    }

    public void shareAction (String itemName) throws InterruptedException {
        //Actions needed to longpress
        WebElement itemInList =
                driver.findElementByAndroidUIAutomator("new UiSelector().description(\""+documentstext_description+itemName+"\");");
        actions.clickAndHold(itemInList).perform();
        WebElement shareAction =
                driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\""+sharebutton_id+"\");");
        actions.click(shareAction).perform();;
    }

    public boolean isHeader(){
        return driver.findElements(By.xpath(headertext_xpath)).size() > 0;
    }

}
