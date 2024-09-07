package src.Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriverFireFox {
    public static WebDriver driverFireFox;

    //bunun sarti extends olmasi ve basta yer almasi
    static // tearStart()
    {
        driverFireFox=new ChromeDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driverFireFox.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühleti
        driverFireFox.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
    }


    public static void tearDown() // tearDown()
    {
        MyFunc.wait(3);
        driverFireFox.quit();
    }

}
