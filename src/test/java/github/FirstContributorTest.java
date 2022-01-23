package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstContributorTest {
    @Test
    void firstContributerShouldBeAndreiSolntsev(){
        open("https://github.com/selenide/selenide");
      //  $$("ul.list-style-none.d-flex.flex-wrap.mb-n2 li").first().hover();
   // $$(".Popover-message").findBy(Condition.visible).shouldHave(Condition.text("Andrei Solntsev"));
$(".Layout-sidebar").$$("ul li").first().hover();
$$(".Popover-message").findBy(Condition.visible).shouldHave(Condition.text("Andrei Solntsev"));
        sleep(5000);

    }
}
