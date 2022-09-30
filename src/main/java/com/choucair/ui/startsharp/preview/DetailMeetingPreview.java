package com.choucair.ui.startsharp.preview;

import net.serenitybdd.screenplay.targets.Target;

public class DetailMeetingPreview {

    public static final Target DETAIL_MEETING = Target
            .the("Detail {0}")
            .locatedBy("//div/div/a[contains(text(),'{0}')]/../../div[contains(text(),'{1}')]/../div[contains(text(),'{2}')]");

}
