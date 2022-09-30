package com.choucair.features.startsharp;

import com.choucair.conf.BaseConf;
import com.choucair.data.factories.DataFactory;
import com.choucair.models.actor.ChoucairActor;
import com.choucair.models.startsharp.DataStartSharp;
import com.choucair.tasks.startsharp.CreateNewMeeting;
import com.choucair.tasks.navigate.NavigateToCreate;
import com.choucair.tasks.startsharp.CreateNewBusinessUnit;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.time.Duration;

import static com.choucair.data.factories.ActorFactory.getActorById;
import static com.choucair.enums.ActorName.MIGUEL;
import static com.choucair.ui.startsharp.preview.DetailMeetingPreview.DETAIL_MEETING;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

@RunWith(SerenityRunner.class)

@WithTagValuesOf({"qa/startsharp"})
public class StartSharp extends BaseConf {

    ChoucairActor miguel;

    @Before
    public void navigate() throws FileNotFoundException {
        miguel = getActorById(MIGUEL.id());
        choucairActor.attemptsTo(
                NavigateToCreate.organization(miguel)
        );
    }

    @Test
    public void should_MeetingAndOrganizationBeCreated_When_SubmitTheCompleteRegistrationData(){

         DataStartSharp data = DataFactory.getDataByKey("data-complete");

        choucairActor.attemptsTo(
                CreateNewBusinessUnit.with()
                        .name(data.getName())
                        .andParentUnit(data.getUnit())
        );

        choucairActor.attemptsTo(
                NavigateToCreate
                        .meeting(),
                CreateNewMeeting
                        .with().name(data.getName())
                        .andMeetingType(data.getMeetingType())
                        .andStartDate(data.getStartDate())
                        .andLocation(data.getLocation())
                        .andOrganizedBy(data.getOrganizedBy())
                        .andMeetingNumber(data.getMeetingNumber())
                        .andEndDate(data.getEndDate())
                        .andUnit(data.getUnit())
                        .andReporter(data.getReporter())
                        .andAttendee(data.getAttendee())

        );

        choucairActor.should(
                seeThat(the(DETAIL_MEETING.of(data.getName(),
                                        data.getMeetingNumber(),
                                        data.getMeetingType())
                                .waitingForNoMoreThan(Duration.ofSeconds(60))),
                        isVisible())
        );
    }
}
