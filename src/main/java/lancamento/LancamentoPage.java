package lancamento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LancamentoPage {
    protected WebDriver driver;
    public LancamentoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}
