package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrandousuario extends Base {

    static final  String PASSCONFIRM = "C@l1d4d2020!";

    By pase = By.id( "title" ) ;
    By seleccion = By.xpath("//option[contains(text(),'Mr.')]");
    By Fname = By.id("firstName");
    By Lname =By.id("lastName");
    By genero = By.cssSelector("input[value = 'M']");
    By Fnacimiento = By.id("dob");
    By telefono = By.id("ssn");
    By email = By.id("emailAddress");
    By passwd = By.id("password");
    By confirmpasswd =By.id("confirmPassword");
    By finalregistro =By.cssSelector("button[class='btn btn-primary btn-flat m-b-30 m-t-30']");

    public registrandousuario(WebDriver driver) {
        super(driver);
    }

    public void paso(){
        click(pase);
    }
    public void selct(){
        click(seleccion);
    }
    public void firstName(){
        type("axel",Fname);
    }
    public void lastName() {
        type("chacaliaza",Lname);
    }
    public void Genero() {
        click(genero);
    }
    public void fechaNac() {
        type("27/04/1994",Fnacimiento);
    }
    public void telf() {
        type("123-45-6789",telefono);
    }
    public void correo(){
        type("axel_12_34@hotmail.com",email);
    }
    public void password(){
        type(PASSCONFIRM,passwd);
    }
    public void confirmarpassword(){
        type(PASSCONFIRM,confirmpasswd);
    }
    public void finalizarregistro() {
        click(finalregistro);
    }
}
