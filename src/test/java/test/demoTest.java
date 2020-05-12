package test;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.registrandousuario;
import page.registro;
import util.takescreenshot;

import java.io.IOException;

public class demoTest {

    private static WebDriver driver;
    private static registro test1;
    private static registrandousuario test2;
    takescreenshot smile;

    @BeforeMethod
    public void setUp() {

        test1 = new registro(driver);
        test2 = new registrandousuario(driver);
        driver = test1.chromeDriverConnection();
        test1.visit("http://dbankdemo.com/login");
        driver.manage().window().maximize();
    }
    @Test
    public void ingresando() {
        test1.clickRegistro();
        }
    @Test (dependsOnMethods = {"ingresando"})
    public void registrando() throws IOException {
        test2.paso();
        test2.selct();
        test2.firstName();
        test2.lastName();
        test2.Genero();
        test2.fechaNac();
        test2.telf();
        test2.correo();
        test2.password();
        test2.confirmarpassword();
        test2.finalizarregistro();
        smile = new takescreenshot();
        smile.screenshot1(driver,"iniciar.jpg");
    }
}
