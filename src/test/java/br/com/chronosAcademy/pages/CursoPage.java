package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.maps.CursoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoMap cursoMap; //criação do objeto do tipo CursoMap

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap(); // inicializa o objeto cursoMap
        PageFactory.initElements(driver,cursoMap); //inicializa os elementos
    }
    public String getTitulo2() {
       return   cursoMap.txtTitulo.getText();
    }
}
