package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MainPage {

    private SelenideElement titleMain = $$(".desktop-title-vTYAX")
            .findBy(Condition.text("Ваш экологический вклад"));
    private ElementsCollection counts = Selenide.$$(".desktop-disabled-kdOve");
    private SelenideElement afterBlock = Selenide.$$(".desktop-wrapper-OutiE")
            .findBy(Condition.text("Ваш экологический вклад"));
    private SelenideElement firstCount = counts.findBy(Condition.text("не попало в атмосферу"));
    private SelenideElement secondCount = counts.findBy(Condition.text("было сохранено"));
    private SelenideElement thirdCount = counts.findBy(Condition.text("было сэкономлено"));

    public MainPage() {
        titleMain.shouldBe(visible);
    }

    public void screen(String s){
        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(afterBlock).build().perform();
        screenshot(s);
    }

}
