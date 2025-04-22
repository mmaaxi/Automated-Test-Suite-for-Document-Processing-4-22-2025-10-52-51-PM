package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver = new ChromeDriver();
    tc_002Page uploadPage = new tc_002Page(driver);

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        driver.get("http://example.com/upload");
    }

    @When("the user selects a valid PDF/DOCX file within 50 MB size")
    public void the_user_selects_a_valid_pdf_docx_file_within_50_mb_size() {
        uploadPage.uploadFile("path/to/validFile.pdf");
    }

    @Then("the file should be uploaded successfully")
    public void the_file_should_be_uploaded_successfully() {
        Assert.assertTrue(uploadPage.isFileUploaded());
    }

    @Then("the file preview should display the name, size, and type of the file")
    public void the_file_preview_should_display_the_name_size_and_type_of_the_file() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
    }
}