package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private WebDriver driver;

    public Driver(String navegador) {  //Construtor para utilização do Driver
        switch (navegador){  //comando condicional para configuração do navegador com as opções
            case "chrome":
                WebDriverManager.chromedriver().setup(); //Configura o ambiente como versão, etc através da biblioteca Boni Garcia
                driver = new ChromeDriver();  // Instaciando o objeto para ser usado. Abre o navegador
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize(); // Maximiza a tela do Navegador
    }

    public WebDriver getDriver() {  //método que retornará o objeto driver
        return driver;


    }
}
