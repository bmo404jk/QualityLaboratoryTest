package Tests;
import Base.BaseTest;
import Pages.LoginPage;
import Pages.SendMailPage;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
public class MainTest extends BaseTest
{
    @Test
    @Description("Заходим на сайт под уже созданной четной записью")
    public void enterAccountTest()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.LoginToAccount();
    }
    @Test
    @Description("Нажимаем на кнопку 'Написать письмо' и создаем сообщение без темы," +
            " в котором указываем 'тело' письма, затем отправляем на почту")
    public void writeLetter()
    {
        Lorem lorem = LoremIpsum.getInstance();
        SendMailPage sendMailPage = new SendMailPage();
        sendMailPage.creatingLetterText(lorem.getWords(5, 10));
        sendMailPage.sendMessage("buffo404@gmail.com");
    }
}
