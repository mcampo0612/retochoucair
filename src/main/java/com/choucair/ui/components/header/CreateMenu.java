package com.choucair.ui.components.header;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMenu {

    public static Target WOMEN = Target
            .the("menu women").located(By.xpath("//li[@class='sfHoverForce']"));

    public static Target OPTION = Target.the("Option {0}")
            .locatedBy("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a[contains(text(), '{0}')]");
}
