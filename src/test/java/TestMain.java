import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {

    @Test
   public void TestUntitled2() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.linkText("Войти")).click();
    driver.findElement(By.linkText("Войти")).click();
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("Selenium");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("123456");
    driver.findElement(By.xpath("//*[@id='form']/a[1]")).click();
    driver.findElement(By.linkText("Пополнить счёт")).click();
    driver.findElement(By.id("amount")).clear();
    driver.findElement(By.id("amount")).sendKeys("10");
    driver.findElement(By.linkText("Электронные деньги")).click();
    driver.findElement(By.id("mode_type_10")).click();
    driver.findElement(By.id("send_message")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    Assert.assertTrue(isElementPresent(By.id("auth")));
    
    }
}
