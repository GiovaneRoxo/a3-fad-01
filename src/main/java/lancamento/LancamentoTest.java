package lancamento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LancamentoTest {
    public String driverPath;
    public String url;
    public WebDriver driver;


    @BeforeMethod
    public void preCond() {
        url = "";
        driver = new ChromeDriver();
        driver.get( url );
        driver.manage().window().maximize();
    }
    protected WebDriver getDriver(){
        return driver;
    }
}
