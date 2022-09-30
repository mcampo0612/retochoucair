package com.choucair.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME = Target
            .the("username txt")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));

    public static final Target PASSWORD = Target
            .the("password txt")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));

    public static final Target BTN_SING_IN = Target
            .the("Click btn")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
