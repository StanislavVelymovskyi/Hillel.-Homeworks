import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

   WebDriver driver = new ChromeDriver();

    @Test
   void checkAddToBasketMinPaymentSum(){
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       driver.get("https://next.privat24.ua/money-transfer/card");
       driver
               .findElement(By.xpath("//input[@data-qa-node='numberdebitSource']"))
               .sendKeys("4004159115449003");
       driver
               .findElement(By.xpath("//input[@data-qa-node='expiredebitSource']"))
               .sendKeys("1225");
       driver
               .findElement(By.xpath("//input[@data-qa-node='cvvdebitSource']"))
               .sendKeys("123");
       driver
               .findElement(By.xpath("//input[@data-qa-node='firstNamedebitSource']"))
               .sendKeys("STANISLAV");
       driver
               .findElement(By.xpath("//input[@data-qa-node='lastNamedebitSource']"))
               .sendKeys("VELYMOVSKYI");
       driver
               .findElement(By.xpath("//input[@data-qa-node='numberreceiver']"))
               .sendKeys("4506909324274797");
       driver
               .findElement(By.xpath("//input[@data-qa-node='firstNamereceiver']"))
               .sendKeys("TEST");
       driver
               .findElement(By.xpath("//input[@data-qa-node='lastNamereceiver']"))
               .sendKeys("TESTOVICH");
       driver
               .findElement(By.xpath("//input[@data-qa-node='amount']"))
               .sendKeys("1");
       driver
                .findElement(By.xpath("//button[@data-qa-node='currency']"))
                .click();
       driver
                .findElement(By.xpath("//button[@data-qa-value='UAH'and@data-qa-node='currency-option']"))
                .click();
       driver
               .findElement(By.xpath("//button[@type='submit']")).click();
   }

   @Test
   void checkMaxPaymentSum(){

   }

}
