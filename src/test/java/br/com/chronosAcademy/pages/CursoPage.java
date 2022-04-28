package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitulo2() {
        String cssTitulo = "div.text-center > div.large-h1";  // Cria objeto com o caminho CSS do título da pagina seguinte
        WebElement txtTitulo = driver.findElement(By.cssSelector(cssTitulo)); //Localiza titulo pagina seguinte
        String titulo = txtTitulo.getText();
        return titulo;
    }
}
