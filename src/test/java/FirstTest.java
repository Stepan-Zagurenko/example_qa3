import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 60000;
        Configuration.baseUrl = "https://demoqa.com";
    }

        @Test
        void FirstTest1() {

            open("/text-box");
            $("#userName").setValue("Alesha");
            $("#userEmail").setValue("Popov@gmail.com");
            $("#currentAddress").setValue("Yaroslavskiy 95");
            $("#permanentAddress").setValue("Yaroslavskiy 9000");
            $("#submit").click();

        }
    }





