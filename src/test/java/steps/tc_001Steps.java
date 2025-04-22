package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        this.driver = hooks.Hooks.driver;
        page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("El usuario se encuentra en la página de carga de documentos")
    public void el_usuario_se_encuentra_en_la_pagina_de_carga_de_documentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("Selecciona opción 'cargar documentos'")
    public void selecciona_opcion_cargar_documentos() {
        page.selectLoadDocumentsOption();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_unica_y_carga_multiple() {
        page.verifySingleAndMultipleUploadOptionsDisplayed();
    }

    @When("Elige 'carga en un solo archivo'")
    public void elige_carga_en_un_solo_archivo() {
        page.selectSingleFileUploadOption();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        page.verifySingleUploadBoxEnabled();
    }

    @When("Elige 'cargar documentos por separado'")
    public void elige_cargar_documentos_por_separado() {
        page.selectSeparateFilesUploadOption();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_correspondientes_a_cada_documento_requerido() {
        page.verifyMultipleUploadBoxesDisplayed();
    }
}