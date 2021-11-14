package github;

import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class CheckJUnit5CodeExample {

    @Test
    void checkJUnit5CodeExample() {
        // открыть страничку гитхаб
        open("https://github.com");
        // ввести в поле поиска selenide
        // нажать enter
        $("[name=q]").setValue("selenide").pressEnter();

        // Перейдите в раздел Wiki проекта
        $(byText("Wikis")).click();

        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki_search_results").$("[title=SoftAssertions]").shouldBe(visible);


        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#wiki_search_results").$("[title=SoftAssertions]").click();
        $("#wiki-body").shouldHave(text("JUnit5"));

    }

}

