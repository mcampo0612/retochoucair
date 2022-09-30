package com.choucair.ui.startsharp;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateNewMeetingPage {

    public static final Target CREATE_MEETING = Target.the("button create meeting")
            .locatedBy("//div/div/span[contains(text(),' New Meeting')]");

    public static final Target NAME = Target.the("input from name meeting")
            .locatedBy("//div/input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");

    public static final Target MEETING_TYPE = Target.the("list from item meeting type")
            .located(By.id("select2-chosen-6"));

    public static final Target MEETING_TYPE_SELECT = Target.the("input select meeting type")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");

    public static final Target START_DATE = Target.the("input start date")
            .locatedBy("//div/input[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']");

    public static final Target LOCATION = Target.the("list from item location")
            .located(By.id("select2-chosen-7"));

    public static final Target LOCATION_SELECT = Target.the("location select list")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");

    public static final Target ORGANIZED_BY = Target.the("list from item organized by")
            .located(By.id("select2-chosen-9"));

    public static final Target ORGANIZED_SELECT = Target.the("organized by select list")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");

    public static final Target MEETING_NUMBER = Target.the("input meeting number")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));

    public static final Target END_DATE = Target.the("input end date")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));

    public static final Target UNIT = Target.the("input unit")
            .located(By.id("select2-chosen-8"));

    public static final Target UNIT_SELECT = Target.the("unit select list")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");

    public static final Target REPORTER = Target.the("input reporter")
            .located(By.id("select2-chosen-10"));

    public static final Target REPORTER_SELECT = Target.the("reporter select list")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");

    public static final Target ATTENDEE_LIST = Target.the("attendee list")
            .located(By.id("select2-chosen-12"));

    public static final Target ATTENDEE_SELECT = Target.the("attendee list")
            .locatedBy("//div/ul/li/div[contains(text(),'{0}')]");
}
