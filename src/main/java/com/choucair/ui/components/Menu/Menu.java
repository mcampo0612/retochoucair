package com.choucair.ui.components.Menu;

import net.serenitybdd.screenplay.targets.Target;


public class Menu {

    public static Target MENU = Target.the("Option {0}")
            .locatedBy("//div[@id='mySidenav']//a[contains(text(), '{0}')]");


    public static Target SUB_MENU = Target.the("SubMenu {0}")
            .locatedBy("//ul[contains(@class,'subMenu')]/li/a[contains(.,'{0}')]");

}