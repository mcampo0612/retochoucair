package com.choucair.ui.startsharp;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateNewBusinessUnitPage {

    public static final Target CREATE_BUSINESS_UNIT = Target.the("button create business unit")
            .locatedBy("//div/span[contains(text(),' New Business Unit')]");

    public static final Target NAME = Target.the("input from name")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));

    public static final Target PARENT_UNIT = Target.the("list from item parent unit")
            .located(By.id("select2-chosen-1"));

    public static final Target PARENT_UNIT_SELECT = Target.the("input select parent unit")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");

    public static final Target SAVE = Target.the("button save new business unit")
            .locatedBy("//div/div/span[contains(text(),'Save')]");


}
