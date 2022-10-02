package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStaticDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    static
    {
        KalanOncekileriKapat();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        wait=new WebDriverWait(driver,Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli
    }

     public static void BekleKapat()
     {
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         driver.quit();
     }

    public static void Bekle(int saniye)
    {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
    public static void cookiesKapat(WebElement escapeFrom){
        if(escapeFrom.isDisplayed()){
            wait.until(ExpectedConditions.visibilityOf(escapeFrom));
            escapeFrom.click();}
        else;
    }
    public  static void randomMail(WebElement mail){
        mail.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        mail.sendKeys("Username" + randomInt + "@" + "gmail.com");
    }

}

