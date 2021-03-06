package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {
    @Test
    void shouldFindSelenideRepoInGithub () {
open("https://github.com/");
$("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
$$("ul.repo-list li").first().$("a").click();
$("h1").shouldHave(Condition.text("selenide / selenide"));
    }
}
