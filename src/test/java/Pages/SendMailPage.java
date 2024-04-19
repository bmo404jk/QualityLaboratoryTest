package Pages;
import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SendMailPage extends BasePage
{
    @FindBy(xpath = "//a[@href='/compose/']")
    private WebElement writeButton;
    @FindBy(xpath = "//div[@role='textbox']/div[1]")
    private WebElement inputTextAreaForLetter;
    @FindBy(xpath = "//div[@class='container--ItIg4']/div/input")
    private WebElement toWhomInputArea;
    @FindBy(xpath = "//button[@data-test-id='send']")
    private WebElement sendLetterButton;
    @FindBy(xpath = "//body[@class='page vkui__root g-pony-mode default-font vkui--vkBase--light theme-t6000']")
    private WebElement container;
    public void creatingLetterText(String letterText)
    {
        writeButton.click();
        inputTextAreaForLetter.click();
        inputTextAreaForLetter.sendKeys(letterText);
    }
    public void sendMessage(String mail)
    {
        toWhomInputArea.click();
        toWhomInputArea.sendKeys(mail);
        sendLetterButton.click();
    }
    public SendMailPage()
    {
        PageFactory.initElements(driver,this);
    }
}
