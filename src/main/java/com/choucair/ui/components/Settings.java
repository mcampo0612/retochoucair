package com.choucair.ui.components;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Settings {

    public static Target SETTINGS_BUTTON = Target
            .the("settings").located(By.xpath("//div[@id='divBtnItem']/a/button"));

    public static Target SETTINGS_TAB = Target
            .the("tab {0}").locatedBy("//div[@id='dvTabAdvanced']/ul/li/a[contains(.,'{0}')]");

    public static Target OPTION = Target.the("Option {0}")
            .locatedBy("//div[contains(text(),'{0}')]");
}
