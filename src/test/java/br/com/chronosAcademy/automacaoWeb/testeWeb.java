package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class testeWeb {

    WebDriver driver;  // cria um objeto que será o driver. Criado com o nome driver.
    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();  //Configura o ambiente como versão, etc
        driver = new ChromeDriver();  // Instaciando o objeto para ser usado. Abre o navegador
        driver.manage().window().maximize(); // Maximiza a tela do Navegador

        driver.get("https://www.chronosacademy.com.br");  //Abre a página da URL informada

    }

    @Test
    public void primeiroTeste(){  //Criação do Método

         String xpathTitulo = "//section[2]//h4";
          //"/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4"; Caminho antes da redução
          // cria o objeto xpathTitulo com o caminho do título da página

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo)); //Objeto que localiza o elemento
        String titulo = txtTitulo.getText(); //Objeto que recebe o valor vindo do valor do elemento
        assertEquals("Porque Tempo É Conhecimento", titulo); //Valida o texto com o valor encontrado
    }

/*
@Test
    public void segundoTeste(){

        String xpathBotao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";
        WebElement txtBotao = driver.findElement(By.xpath(xpathBotao)); //Localiza o botão
        txtBotao.click();  // Clica no botão

        String xpathTitulo2 = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";  // Cria objeto com o caminho do título da pagina seguinte
        WebElement txtTitulo2 = driver.findElement(By.linkText(xpathBotao)); //Localiza titulo pagina seguinte
        assertEquals("Conheça todos os nossos cursos", txtTitulo2);

    }

 */
@After
    public void finalizaTeste(){
    driver.quit(); // Fecha o browser e finaliza o driver
}

}
