package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    WebDriver driver;

    public PrincipalPage(WebDriver driver) {  //Cria construtor que vai receber o drive
        this.driver = driver;
    }
    public String getTitulo() {
        String xpathTitulo = "//section[2]//h4"; // cria o objeto xpathTitulo com o caminho do título da página

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo)); //Objeto que localiza o elemento
        String titulo = txtTitulo.getText(); //Objeto que recebe o valor vindo do elemento
        return titulo;
    }
    public void clickBotao() {
        String xpathBotao = "//section[2]/div[3]//a";

        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao)); //Localiza o botão
        btnTitulo.click();  // Clica no botão
    }
}
