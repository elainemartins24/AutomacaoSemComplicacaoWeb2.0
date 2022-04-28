package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class testeWeb {
       WebDriver driver;  // cria um objeto que será o driver. Criado com o nome driver
       Driver driverWeb;  //objeto do tipo driver que referencia a classe Driver
       PrincipalPage principalPage; //cria um objeto p/ instanciar o método que está na outra classe
       CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");  // Instanciando o objeto
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");  //Abre a página da URL informada
        principalPage = new PrincipalPage(driver); // Instancia o objeto no @before porque será usado em todos os testes
    }

    @Test
    public void primeiroTeste(){  //Criação do Método
       assertEquals("Porque Tempo É Conhecimento", principalPage.getTitulo()); //Valida o texto com o valor encontrado
    }

    @Test
    public void segundoTeste(){
        cursoPage = new CursoPage(driver);  // Instancia o objeto apenas no método onde será usado
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());
    }

    @After
    public void finalizaTeste(){
    driver.quit(); // Fecha o browser e finaliza o driver
}

}
