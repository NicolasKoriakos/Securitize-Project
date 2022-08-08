import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver;
    By do1Button = By.id("do1");
    By do2Button = By.id("do2");
    By buttonIncreaseFont = By.id("btnIncreaseFont");
    By buttonDecreaseFont = By.id("btnDecreaseFont");
    By textFontSize = By.id("textFontSize");
    By inputBgColor = By.id("bgColor");
    By btnSetBgColor = By.id("btnSetBgColor");
    By background = By.id("formToColorize");

    public MainPage(WebDriver driver){ this.driver =driver; }

    public void clickDo1(){
        WebElement element = driver.findElement(do1Button);
        element.click();
    }

    public void clickDo2(){
        WebElement element = driver.findElement(do2Button);
        element.click();
    }

    public void clickButtonIncreaseFont(){
        WebElement element = driver.findElement(buttonIncreaseFont);
        element.click();
    }

    public void clickButtonDecreaseFont(){
        WebElement element = driver.findElement(buttonDecreaseFont);
        element.click();
    }

    public boolean isDo1Disabled(){
        WebElement element = driver.findElement(do1Button);
        System.out.println(element.isEnabled());
        return !element.isEnabled(); // this method will return True if the Element is disabled
    }

    public int getFontSize(){
        WebElement element = driver.findElement(textFontSize);
        return Integer.parseInt(element.getCssValue("font-size").replace("px", ""));
    }

    public void changeBackgroundColor(String color){
        driver.findElement(inputBgColor).sendKeys(color);
        WebElement element = driver.findElement(btnSetBgColor);
        element.click();
    }

    public String getBgColor(){
        return driver.findElement(background).getCssValue("background-color");
    }

}
