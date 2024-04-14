package test;


import com.codeborne.selenide.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import page.MainPage;

import java.awt.*;

import static com.codeborne.selenide.Screenshots.takeScreenShot;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ScreenTest {


    @BeforeEach
    void setup() {
        Configuration.holdBrowserOpen = true;
        Configuration.reportsFolder = "output";
        open("https://www.avito.ru/avito-care/eco-impact");

    }

    @Test
    void firstScreen() {
        var mainPage = new MainPage();
        mainPage.screen("1");
    }
    @Test
    void secondtScreen() {
        var mainPage = new MainPage();
        mainPage.screen("2");
    }
    @Test
    void thirdScreen() {
        var mainPage = new MainPage();
        mainPage.screen("3");
    }
}
