package com.choucair.interactions.startsharp;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.ui.startsharp.CreateNewBusinessUnitPage.SAVE;
import static com.choucair.ui.startsharp.CreateNewMeetingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddMeeting {

    public static Performable createMeeting() {
        return Task.where("{0} clicks on create business option",
                WaitUntil.the(CREATE_MEETING, WebElementStateMatchers.isVisible())
                        .then(Click.on(CREATE_MEETING))
        );
    }

    public static Performable name(String name) {
        return Task.where("{0} enter name #name",
                        Enter.theValue(name).into(NAME))
                .with("name").of(name);
    }

    public static Performable meetingType(String meetingType) {
        return Task.where("{0} add meeting type #meetingType",
                        Click.on(MEETING_TYPE)
                                .then(WaitUntil.the(MEETING_TYPE_SELECT.of(meetingType), isVisible()))
                                .then(Click.on(MEETING_TYPE_SELECT.of(meetingType))))
                .with("meetingType").of(meetingType);
    }

    public static Performable startDate(String startDate) {
        return Task.where("{0} enter start Date #startDate",
                        Enter.theValue(startDate).into(START_DATE))
                .with("startDate").of(startDate);
    }

    public static Performable location(String location) {
        return Task.where("{0} add location #location",
                        Click.on(LOCATION)
                                .then(WaitUntil.the(LOCATION_SELECT.of(location), isVisible()))
                                .then(Click.on(LOCATION_SELECT.of(location))))
                .with("location").of(location);
    }

    public static Performable organizedBy(String organizedBy) {
        return Task.where("{0} add organized by #organizedBy",
                        Click.on(ORGANIZED_BY)
                                .then(WaitUntil.the(ORGANIZED_SELECT.of(organizedBy), isVisible()))
                                .then(Click.on(ORGANIZED_SELECT.of(organizedBy))))
                .with("organizedBy").of(organizedBy);
    }

    public static Performable meetingNumber(String meetingNumber) {
        return Task.where("{0} enter meeting number #meetingNumber",
                        Enter.theValue(meetingNumber).into(MEETING_NUMBER))
                .with("meetingNumber").of(meetingNumber);
    }

    public static Performable endDate(String endDate) {
        return Task.where("{0} enter end Date #endDate",
                        Enter.theValue(endDate).into(END_DATE))
                .with("endDate").of(endDate);
    }

    public static Performable unit(String unit) {
        return Task.where("{0} add unit #unit",
                        Click.on(UNIT)
                                .then(WaitUntil.the(UNIT_SELECT.of(unit), isVisible()))
                                .then(Click.on(UNIT_SELECT.of(unit))))
                .with("unit").of(unit);
    }

    public static Performable reporter(String reporter) {
        return Task.where("{0} add reporter #reporter",
                        Click.on(REPORTER)
                                .then(WaitUntil.the(REPORTER_SELECT.of(reporter), isVisible()))
                                .then(Click.on(REPORTER_SELECT.of(reporter))))
                .with("reporter").of(reporter);
    }

    public static Performable attendee(String attendee) {
        return Task.where("{0} add attendee #attendee",
                        Click.on(ATTENDEE_LIST)
                                .then(WaitUntil.the(ATTENDEE_SELECT.of(attendee), isVisible()))
                                .then(Click.on(ATTENDEE_SELECT.of(attendee))))
                .with("attendee").of(attendee);
    }

    public static Performable andSaveMeeting() {
        return Task.where("{0} save meeting",
                Click.on(SAVE));
    }

}