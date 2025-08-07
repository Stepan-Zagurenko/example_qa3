import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 60000;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

        @Test
        void FirstTest1() {

            open("/text-box");
            $("#userName").setValue("Alesha");
            $("#userEmail").setValue("Popov@gmail.com");
            $("#currentAddress").setValue("Yaroslavskiy 95");
            $("#permanentAddress").setValue("Yaroslavskiy 90i");
            $("#submit").click();

            $("#output").$("#name").shouldHave(text("Alesha"));
            $("#output").$("#email").shouldHave(text("Popov@gmail.com"));
            $("#output").$("#currentAddress").shouldHave(text("Yaroslavskiy 95"));
            $("#output").$("#permanentAddress").shouldHave(text("Yaroslavskiy 90i"));


        }
    }





