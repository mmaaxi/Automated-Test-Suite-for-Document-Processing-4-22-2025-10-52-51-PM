package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_010Page {
    WebDriver driver;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "processButton")
    private WebElement processButton;

    @FindBy(id = "slipNotification")
    private WebElement slipNotification;

    @FindBy(id = "historySection")
    private WebElement historySection;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadAndProcessDocuments() {
        uploadButton.click();
        processButton.click();
    }

    public boolean isSlipGenerated() {
        return slipNotification.isDisplayed();
    }

    public boolean isDataStoredInHistory() {
        return historySection.isDisplayed();
    }
}