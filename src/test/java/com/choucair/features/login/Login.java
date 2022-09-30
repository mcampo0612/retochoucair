package com.choucair.features.login;

import com.choucair.conf.BaseConf;
import com.choucair.enums.ActorName;
import com.choucair.models.actor.ChoucairActor;
import com.choucair.tasks.login.LoginWith;
import com.choucair.tasks.navigate.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;

import static com.choucair.data.factories.ActorFactory.getActorById;

@RunWith(SerenityRunner.class)

@WithTag("login")
public class Login extends BaseConf {

    ChoucairActor miguel;

    @Before
    public void navigate() {
        choucairActor.attemptsTo(
                NavigateTo.loginPage());
    }

    @Test
    @WithTagValuesOf({"smoke"})
    public void should_UserLoginSuccessfully_When_HeSendsValidCredentials() throws FileNotFoundException {
        miguel = getActorById(ActorName.MIGUEL.id());
        choucairActor.attemptsTo(
                LoginWith.username(miguel.getCredentials().getUsername())
                        .andPassword(miguel.getCredentials().getPassword())
        );
    }
}