package com.choucair.ui.components;

import net.serenitybdd.screenplay.targets.Target;

public class ModalMessage {

    public static Target ALERT =
            Target.the("alert dialog")
                    .locatedBy("//div[@role='alertdialog']");

}
