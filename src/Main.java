
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        WebDriver driver = new ChromeDriver();



        driver.get("https://mish.sheygam.com/#/wellcome");

        WebElement button = driver.findElement(By.className("mat-stroked-button"));
        System.out.println("Text of button:"+button.getText());
        WebElement button1 = driver.findElement(By.xpath("//button[@class='mat-stroked-button']"));
        System.out.println("Text of button:"+button1.getText());
        WebElement button3 = driver.findElement(By.cssSelector("#innerPicture > div:nth-child(6) > button > span"));
        System.out.println("Text of button:"+button3.getText());
        WebElement button4 = driver.findElement(By.cssSelector("button[class='mat-stroked-button']"));
        System.out.println("Text of button:"+button4.getText());

        WebElement button_par = driver.findElement(By.xpath("//div[@class='row justify-content-center']//button"));
        System.out.println("Text of button:"+button_par.getText());
        WebElement button_par_css = driver.findElement(By.cssSelector("div[class='row justify-content-center']button"));
        System.out.println("Text of button:"+button_par_css.getText());
        driver.quit();

    }
}
