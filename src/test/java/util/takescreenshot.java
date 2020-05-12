package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class takescreenshot {

    public static void screenshot1 (WebDriver driver, String nombre) throws IOException {
        System.out.println("evidencia capturada");
        TakesScreenshot src = (TakesScreenshot) driver;
        File source = src.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("D:\\evidencia\\" + nombre));
    }
}
