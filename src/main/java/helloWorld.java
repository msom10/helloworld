import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ms392556 on 22/11/2016.
 */



public class helloWorld {

    public static void main(String [ ] args)
    {
        System.setProperty("webdriver.chrome.driver", "H:\\Auto\\SetUps\\chrome2.20\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crownbet.com.au/");

        //Something Changed
        System.out.println("This is branch 2");


    }


}
