import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/alexa/Desktop/SeleniumTestingFile/chromedriver.exe"); // Specificam calea unde este chrome driver.
        WebDriver driver = new ChromeDriver(); // Declaram o variabila care sa stocheze o instanta a chrome driver.
        driver.get("https://formy-project.herokuapp.com/autocomplete"); //Deschidem website-ul de test.

        Thread.sleep(3000);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        Thread.sleep(3000);
        autocomplete.sendKeys("Strada Victoriei 136");
        Thread.sleep(3000);
        WebElement autocompleteResult = driver.findElement(By.className("dismissButton"));
        Thread.sleep(3000);
        autocompleteResult.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
