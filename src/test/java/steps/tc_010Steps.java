package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("completa la carga y procesamiento de documentos")
    public void completaLaCargaYProcesamientoDeDocumentos() {
        page.uploadAndProcessDocuments();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void elSistemaGeneraElSlipDeSalida() {
        Assert.assertTrue(page.isSlipGenerated());
    }

    @Then("guarda los documentos originales y datos extraídos en el historial de la solicitud")
    public void guardaLosDocumentosOriginalesYDatosExtraidosEnElHistorialDeLaSolicitud() {
        Assert.assertTrue(page.isDataStoredInHistory());
    }
}