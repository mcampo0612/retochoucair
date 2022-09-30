package com.choucair.tasks.startsharp;

import com.choucair.interactions.startsharp.AddMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewMeeting implements Task {

    private final List<Performable> itemsCreateMeeting;

    public CreateNewMeeting() {
        itemsCreateMeeting = new ArrayList<>();
    }

    public static CreateNewMeeting with() {
        return instrumented(CreateNewMeeting.class);
    }

    public CreateNewMeeting name(String name) {
        this.itemsCreateMeeting.add(AddMeeting.name(name));
        return this;
    }

    public CreateNewMeeting andMeetingType(String meetingType) {
        this.itemsCreateMeeting.add(AddMeeting.meetingType(meetingType));
        return this;
    }

    public CreateNewMeeting andStartDate(String startDate) {
        this.itemsCreateMeeting.add(AddMeeting.startDate(startDate));
        return this;
    }

    public CreateNewMeeting andLocation(String location) {
        this.itemsCreateMeeting.add(AddMeeting.location(location));
        return this;
    }

    public CreateNewMeeting andOrganizedBy(String organizedBy) {
        this.itemsCreateMeeting.add(AddMeeting.organizedBy(organizedBy));
        return this;
    }

    public CreateNewMeeting andMeetingNumber(String meetingNumber) {
        this.itemsCreateMeeting.add(AddMeeting.meetingNumber(meetingNumber));
        return this;
    }

    public CreateNewMeeting andEndDate(String endDate) {
        this.itemsCreateMeeting.add(AddMeeting.endDate(endDate));
        return this;
    }

    public CreateNewMeeting andUnit(String unit) {
        this.itemsCreateMeeting.add(AddMeeting.unit(unit));
        return this;
    }

    public CreateNewMeeting andReporter(String reporter) {
        this.itemsCreateMeeting.add(AddMeeting.reporter(reporter));
        return this;
    }

    public CreateNewMeeting andAttendee(String attendee) {
        this.itemsCreateMeeting.add(AddMeeting.attendee(attendee));
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                AddMeeting.createMeeting()
        );

        actor.attemptsTo(
                dataForMeetingActions()
        );
    }

    private Performable[] dataForMeetingActions() {
        this.itemsCreateMeeting.add(AddMeeting.andSaveMeeting());
        return this.itemsCreateMeeting.toArray(new Performable[this.itemsCreateMeeting.size()]);
    }
}
