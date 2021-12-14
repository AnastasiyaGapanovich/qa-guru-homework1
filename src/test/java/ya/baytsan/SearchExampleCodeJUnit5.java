package ya.baytsan;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchExampleCodeJUnit5 {
    @Test
    void shouldFindExampleCodeForJUnit5InSoftAssertions(){
        //открыть  github
         open("https://github.com/");
        //набрать в поиске selenide, нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        //перейти в раздел wikis проекта, убедиться, что в списке есть страница SoftAssertions
        $(".menu").$("a[href$=wikis]").click();
        $("#wiki_search_results").$(byText("SoftAssertions")).shouldBe(Condition.visible).click();


        //открыть страницу SoftAssertions и проверить наличие кода для JUnit5 в примерах
        //(byText("SoftAssertions")).click();
        $(".markdown-body"). $("ol").shouldHave(Condition.text("Using JUnit5"));


        sleep(5000);
    }
}