package com.choucair.ui.components;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserMenu {

    public static Target MENU =
            Target.the("menu")
                    .located(By.xpath("//section/section/h1"));

    public static Target ORGANIZATION =
            Target.the("organization")
                    .located(By.xpath("//ul/li/a/span[contains(text(),'Organization')]"));


    public static Target BUSINESS_UNITS =
            Target.the("business units")
                    .located(By.xpath("//ul/li/a/span[contains(text(),'Business Units')]"));

    public static Target MEETING =
            Target.the("meeting")
                    .located(By.xpath("(//ul/li/a/span[contains(text(),'Meeting')])[1]"));

    public static Target MEETINGS =
            Target.the("meetings")
                    .located(By.xpath("//ul/li/a/span[contains(text(),'Meetings')]"));


}
