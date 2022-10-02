package A101_Case;

import Steps.Steps;
import Utils.BaseStaticDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _01_Case extends Steps {
    public static void main(String[] args) {

     siteyeGit();
     giyimMenu();
     icGiyim();
     dizAltiCorap();
     corapSec();
     assertColor();
     sepeteEkle();
     sepetiGoster();
     sepetiOnayla();
     uyeOlmadanDevamEt();
     eMailGir();
     uyelikIslemineDevamEt();
     adresOlustur();
     adresBilgileriniGir();
     odemeYontemıneGec();
     BekleKapat();
  }
}


