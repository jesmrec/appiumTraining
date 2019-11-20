package android;

import org.openqa.selenium.By;

public class SharePage extends CommonPage {

    private String addshareebutton_id = "addUserButton";
    private String addPublicLinkButton_id = "addPublicLinkButton";

    public SharePage() {
        super();
    }

    public boolean isHeader() {
        return driver.findElementsByAndroidUIAutomator("new UiSelector().text(\"Share\");").size() > 0;
    }

    public void addPrivateShare(){
        driver.findElement(By.id(addshareebutton_id)).click();
    }

    public void addPublicLink(){
        driver.findElement(By.id(addPublicLinkButton_id)).click();
    }

    public boolean isUserInList(String username) {
        return driver.findElementsByAndroidUIAutomator("new UiSelector().text(\""+username+"\");").size() > 0;
    }

    public boolean isItemInList(String item) {
        return driver.findElementsByAndroidUIAutomator("new UiSelector().text(\""+item+"\");").size() > 0;
    }

    public boolean isPublicLinkNameInList(String name) {
        return driver.findElementsByAndroidUIAutomator("new UiSelector().text(\""+name+"\");").size() > 0;
    }

}
