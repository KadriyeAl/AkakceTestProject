package src.Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseDriverEdge {
    public static WebDriver driverEdge;

    //bunun sarti extends olmasi ve basta yer almasi
    static // tearStart()
    {
        driverEdge=new EdgeDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driverEdge.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühleti
        driverEdge.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
    }


    public static void tearDown() // tearDown()
    {
        MyFunc.wait(3);
        driverEdge.quit();
    }

}
