package com.choucair.interactions.startsharp;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.ui.startsharp.CreateNewBusinessUnitPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddBusinessUnit {

    public static Performable createBusinessUnit() {
        return Task.where("{0} clicks on create business option",
                WaitUntil.the(CREATE_BUSINESS_UNIT, WebElementStateMatchers.isVisible())
                        .then(Click.on(CREATE_BUSINESS_UNIT))
        );
    }

    public static Performable name(String name) {
        return Task.where("{0} enter password",
                        Enter.theValue(name).into(NAME))
                .withNoReporting();
    }


    public static Performable andParentUnit(String parentUnit) {
        return Task.where("{0} add parent unit #parentUnit",
                        Click.on(PARENT_UNIT)
                                .then(WaitUntil.the(PARENT_UNIT_SELECT.of(parentUnit), isVisible()))
                                .then(Click.on(PARENT_UNIT_SELECT.of(parentUnit))))
                .with("parentUnit").of(parentUnit);
    }

    public static Performable andSave() {
        return Task.where("{0} save business parent unit",
                Click.on(SAVE));
    }

}