package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class MainTest extends BaseTest
{
    @Test
    public void enterAccountTest()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.LoginToAccount();
    }
}
