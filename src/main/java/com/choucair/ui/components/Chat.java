package com.choucair.ui.components;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Chat {

    public static Target CLOSE_CHAT =
            Target.the("close chat")
                    .located(By.xpath("//div[@id='five9-maximize-button']/div[contains(@class,'close-five9')]"));
}
