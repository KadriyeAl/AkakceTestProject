package src.Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseDriverSafari {
    public static WebDriver driverSafari;

    //bunun sarti extends olmasi ve basta yer almasi
    static // tearStart()
    {
        driverSafari=new SafariDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driverSafari.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühleti
        driverSafari.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
    }


    public static void tearDown() // tearDown()
    {
        MyFunc.wait(3);
        driverSafari.quit();
    }

}
