package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    By loadDocumentsButton = By.id("loadDocumentsButton");
    By singleFileOption = By.id("singleFileOption");
    By multipleFileOption = By.id("multipleFileOption");
    By singleUploadBox = By.id("singleUploadBox");
    By multipleUploadBoxes = By.className("multipleUploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("https://example.com/document-upload");
    }

    public void selectLoadDocumentsOption() {
        driver.findElement(loadDocumentsButton).click();
    }

    public void verifySingleAndMultipleUploadOptionsDisplayed() {
        WebElement singleOption = driver.findElement(singleFileOption);
        WebElement multipleOption = driver.findElement(multipleFileOption);
        if (!singleOption.isDisplayed() || !multipleOption.isDisplayed()) {
            throw new AssertionError("Upload options not displayed correctly");
        }
    }

    public void selectSingleFileUploadOption() {
        driver.findElement(singleFileOption).click();
    }

    public void verifySingleUploadBoxEnabled() {
        WebElement uploadBox = driver.findElement(singleUploadBox);
        if (!uploadBox.isDisplayed()) {
            throw new AssertionError("Single upload box is not enabled");
        }
    }

    public void selectSeparateFilesUploadOption() {
        driver.findElement(multipleFileOption).click();
    }

    public void verifyMultipleUploadBoxesDisplayed() {
        if (driver.findElements(multipleUploadBoxes).isEmpty()) {
            throw new AssertionError("Multiple upload boxes are not displayed");
        }
    }
}