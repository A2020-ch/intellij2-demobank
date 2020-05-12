package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.datadriver;

import java.io.IOException;
import java.util.ArrayList;

public class data {
    public static void main(String[] args) throws IOException {
        datadriver d = new datadriver();
        ArrayList datos = d.getData("Purchase");
        System.out.println(datos.get(0));
        System.out.println(datos.get(1));
        System.out.println(datos.get(2));
        System.out.println(datos.get(3));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com.pe/");
        driver.findElement(By.name("q")).sendKeys(datos.get(2).toString());
    }
}
