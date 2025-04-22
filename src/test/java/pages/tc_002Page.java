package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;
    
    By fileInput = By.id("file-upload");
    By uploadButton = By.id("upload-btn");
    By preview = By.id("file-preview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isFileUploaded() {
        return driver.findElement(preview).isDisplayed();
    }

    public boolean isPreviewDisplayed() {
        // Assume the preview contains elements to display name, size, and type
        By name = By.id("file-name");
        By size = By.id("file-size");
        By type = By.id("file-type");
        return driver.findElement(name).isDisplayed() &&
               driver.findElement(size).isDisplayed() &&
               driver.findElement(type).isDisplayed();
    }
}