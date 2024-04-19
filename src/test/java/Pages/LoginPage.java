package Pages;
import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BasePage
{
    private final String URL = "https://mail.ru/";
    private final String LOGIN = "testivanovivan2024";
    private final String PASSWORD = "F5gh78@e90";
    @FindBy(xpath = "//button[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big aqjlcbn__1jdtl7f']")
    private WebElement firstEnterButton;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement accountNameInput;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement accountPasswordInput;
    @FindBy(xpath = "//button[@data-test-id='next-button']")
    private WebElement accountPasswordInputButton;
    @FindBy(xpath = "//button[@data-test-id='submit-button']")
    private WebElement secondEnterButton;
    @FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
    private WebElement iframe;
    public void LoginToAccount()
    {
        firstEnterButton.click();
        driver.switchTo().frame(iframe);
        accountNameInput.click();
        accountNameInput.sendKeys(LOGIN);
        accountPasswordInputButton.click();
        accountPasswordInput.click();
        accountPasswordInput.sendKeys(PASSWORD);
        secondEnterButton.click();
    }
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
        driver.get(URL);
    }
}
