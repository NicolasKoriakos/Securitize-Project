import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class MainPageTest extends BaseTest{

    @Test
    public void do1ButtonTest() {
        MainPage mainPage = loginPage.login("admin", "admin");
        if (mainPage.isDo1Disabled()){
            mainPage.clickDo2();
        }
        mainPage.clickDo1();
        Assert.assertTrue(mainPage.isDo1Disabled(), "The Do 1 button is not disabled");
    }

    @Test
    public void changeTextSizeButtonsTest(){
        MainPage mainPage = loginPage.login("admin", "admin");
        int startingFontSize = mainPage.getFontSize();
        mainPage.clickButtonIncreaseFont();
        Assert.assertTrue(mainPage.getFontSize() > startingFontSize, "The font size has not increased.");
        startingFontSize = mainPage.getFontSize();
        mainPage.clickButtonDecreaseFont();
        Assert.assertTrue(mainPage.getFontSize() < startingFontSize, "The font size has not decreased.");
    }

    @Test
    public void changeBackgroundColorText() throws InterruptedException {
        MainPage mainPage = loginPage.login("admin", "admin");
        String backgroundColor = mainPage.getBgColor();
        mainPage.changeBackgroundColor("red");
        Assert.assertTrue(backgroundColor != mainPage.getBgColor());
    }
}
