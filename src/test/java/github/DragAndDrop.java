package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void dragAndDrop() {
        //Открыть https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Перенести прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");

        //Проверить, что прямоугольники действительно поменялись
        $("#column-b").shouldHave(Condition.text("A"));
        $("#column-a").shouldHave(Condition.text("B"));

    }


}
