package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.maps.PrincipalMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    //classe criada especificamente para as ações
    WebDriver driver;
    PrincipalMap principalMap;  // para poder utilizar os elementos definidos na classe PrincipalMap


    public PrincipalPage(WebDriver driver) {  //Cria construtor que vai receber o drive

        this.driver = driver;
        principalMap = new PrincipalMap(); // para instanciar
        PageFactory.initElements(driver, principalMap); // inicializa os objetos que estão na classe principalMap
    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText(); //Objeto que recebe o valor vindo do elemento
    }

    public void clickBotao() {
        principalMap.btnTitulo.click();  // Clica no botão
    }

    public PrincipalMap getPrincipalMap() {
        return principalMap;
    }

    public void setPrincipalMap(PrincipalMap principalMap) {
        this.principalMap = principalMap;
    }
}
