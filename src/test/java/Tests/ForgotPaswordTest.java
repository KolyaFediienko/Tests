package Tests;


import Pages.ForgotPaswordPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ForgotPaswordTest extends ForgotPaswordPage
{
    private SoftAssert softAssert = new SoftAssert();

    @Test(enabled = false)
    public void terbtst1() throws InterruptedException {
        open();
        clickMyRoom();
        ForgotPaswordbutton();
        TextEmail();
        ClickSend();
        GetEmail();
        EnterEmail();
        Message();
   //     Password();
    }
}
