package com.choucair.tasks.navigate;

import com.choucair.models.actor.ChoucairActor;
import com.choucair.tasks.login.LoginWith;
import com.choucair.ui.components.UserMenu;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.tasks.navigate.NavigateTo.loginPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToCreate {

    public static Performable organization(ChoucairActor choucairActor) {
        return Task.where("{0} navigate to organization",
                loginPage(),
                LoginWith
                        .username(choucairActor.getCredentials().getUsername())
                        .andPassword(choucairActor.getCredentials().getPassword()),
                WaitUntil.the(UserMenu.MENU, isVisible()),
                Click.on(UserMenu.ORGANIZATION),
                WaitUntil.the(UserMenu.BUSINESS_UNITS, isVisible()),
                Click.on(UserMenu.BUSINESS_UNITS)
        );
    }

    public static Performable meeting() {
        return Task.where("{0} navigates to meeting",
                Click.on(UserMenu.MEETING),
                WaitUntil.the(UserMenu.MEETINGS, isVisible()),
                Click.on(UserMenu.MEETINGS)
        );
    }
}
