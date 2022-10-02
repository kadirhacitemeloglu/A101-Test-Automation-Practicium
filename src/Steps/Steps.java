package Steps;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Steps extends BaseStaticDriver {

        public static void siteyeGit(){
                driver.get("https://www.a101.com.tr");
                WebElement acceptCookie = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
                acceptCookie.click();
        }
        public static void giyimMenu (){
        WebElement giyimAksesuar = driver.findElement(By.xpath("//a[contains(text(),'Giyim & aksesuar')]"));
        giyimAksesuar.click();}
        public static void icGiyim (){
         WebElement icGiyim = driver.findElement(By.xpath("(//a[contains(text(),'Kadın İç Giyim')])[2]"));
         wait.until(ExpectedConditions.elementToBeClickable(icGiyim)).click();}
        public static void dizAltiCorap (){
        WebElement dizAltiCorap= driver.findElement(By.xpath("(//a[contains(text(),'Dizaltı Çorap')])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(dizAltiCorap)).click();}
        public static void corapSec (){
        WebElement siyahCorap = driver.findElement(By.xpath("(//a[@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[1]"));
        siyahCorap.click();}
        public static void assertColor (){
        WebElement renkDogrulama = driver.findElement(By.xpath("//div[@class='product-heading']/h1"));
        Assert.assertTrue(renkDogrulama.getText().toLowerCase().contains("siyah"));}
        public static void sepeteEkle (){
        WebElement addToBasket = driver.findElement(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']"));
        addToBasket.click();}
        public static void sepetiGoster (){
        WebElement showBasket = driver.findElement(By.xpath("(//a[contains(text(),'Sepeti Görüntüle')])[2]"));
        wait.until(ExpectedConditions.visibilityOf(showBasket)).click();}
        public static void sepetiOnayla (){
                WebElement acceptBasket = driver.findElement(By.xpath("//a[@class='button green checkout-button block js-checkout-button']"));
                wait.until(ExpectedConditions.elementToBeClickable(acceptBasket)).click();}
        public static void uyeOlmadanDevamEt (){
                WebElement ContinueWithoutLogin = driver.findElement(By.xpath("(//a[contains(text(),'ÜYE OLMADAN DEVAM ET')])"));
                wait.until(ExpectedConditions.elementToBeClickable(ContinueWithoutLogin)).click();}
        public static void eMailGir (){
                WebElement eMail = driver.findElement(By.xpath("//input[@name='user_email']"));
                randomMail(eMail);}
        public static void uyelikIslemineDevamEt (){
                WebElement continueWithMail = driver.findElement(By.xpath("//button[contains(text(),'DEVAM ET')]"));
                wait.until(ExpectedConditions.elementToBeClickable(continueWithMail)).click();}
        public static void adresOlustur (){
                WebElement newAddress = driver.findElement(By.xpath("(//a[@class='new-address js-new-address']/em)[1]"));
                wait.until(ExpectedConditions.elementToBeClickable(newAddress)).click();}
        public static void adresBilgileriniGir (){
        Actions action = new Actions(driver);
                WebElement adresBasligi = driver.findElement(By.xpath("//input[@name='title']"));
                adresBasligi.sendKeys("MyHome");
                WebElement ad = driver.findElement(By.xpath("//input[@name='first_name']"));
                ad.sendKeys("Ramazan");
                WebElement soyad = driver.findElement(By.xpath("//input[@name='last_name']"));
                soyad.sendKeys("Demir");
                WebElement cepTel = driver.findElement(By.xpath("//input[@name='phone_number']"));
                cepTel.sendKeys("1456435578");

                WebElement il = driver.findElement(By.name("city"));
                action.moveToElement(il).click().build().perform();
                Select dropdownMenu = new Select(il);
                dropdownMenu.selectByVisibleText("İSTANBUL");
                action.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build().perform();

                WebElement ilce= driver.findElement(By.name("township"));
                action.moveToElement(ilce).click().build().perform();
                Select dropdownMenu2 = new Select(ilce);
                dropdownMenu2.selectByVisibleText("ÜSKÜDAR");
                action.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build().perform();


                WebElement mahalle= driver.findElement(By.name("district"));
                action.moveToElement(mahalle).click().build().perform();
                Select dropdownMenu3 = new Select(mahalle);
                dropdownMenu3.selectByVisibleText("SULTANTEPE MAH");
                action.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build().perform();

                WebElement address = driver.findElement(By.xpath("//textarea[@class='js-address-textarea']"));
                address.sendKeys("Sultantepe mah.Elmascıali sok.karga zarife cad.");
                WebElement save = driver.findElement(By.xpath("//button[contains(text(),'KAYDET')]"));
                save.click();

                WebElement kaydetVeDevamEt= driver.findElement(By.xpath("//button[@class='button block green js-proceed-button']"));
                wait.until(ExpectedConditions.elementToBeClickable(kaydetVeDevamEt)).click();
        }
        public static void odemeYontemıneGec(){

                Actions aksyn = new Actions(driver);
                WebElement odemeSekli = driver.findElement(By.xpath("//div[@data-pk='2']"));
                odemeSekli.click();

                WebElement radioButton = driver.findElement(By.xpath("(//input[@class='checkout__contract__checkbox js-checkout-agreement'])[1]"));
                radioButton.click();

                WebElement payIleOde = driver.findElement(By.xpath("//a[@class='button green js-gpay-payment']"));
                wait.until(ExpectedConditions.elementToBeClickable(payIleOde)).click();

        }
}
