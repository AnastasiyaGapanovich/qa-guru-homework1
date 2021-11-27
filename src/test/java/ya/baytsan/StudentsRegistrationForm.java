package ya.baytsan;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class StudentsRegistrationForm {

    @Test

    void demoTest(){
     open("https://demoqa.com/automation-practice-form");
       $("# firstName").setValue("Alex");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("alex@egorov.com");

        $("#userEmail").setValue("alex@egorov.com");









    }
}
