package ya.baytsan;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FirstHmTest {

     @BeforeAll

     static void beforeAll() {Configuration.headless = true;}

        @Test

    void fillFormTestHm (){

            open("https://demoqa.com/automation-practice-form");
            $("#firstName").setValue("some name");
            $("#lastName").setValue("some lastName");
            $("#userEmail").setValue("some userEmail");
           // $("#submit").scrollTo().click();
            //$("modal-body #Student Name").shouldHave(text("some name some lastname"));
            $(".custom-control-input").click();
          //  $("#output #lastName").shouldHave(text("some lastName"));
              $("#output #email").shouldHave(text("aaa@aa.aa"));

        }

}
