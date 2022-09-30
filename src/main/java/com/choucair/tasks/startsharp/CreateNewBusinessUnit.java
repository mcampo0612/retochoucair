package com.choucair.tasks.startsharp;

import com.choucair.interactions.startsharp.AddBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewBusinessUnit implements Task {

    private final List<Performable> itemsCreateBusinessUnit;

    public CreateNewBusinessUnit() {
        itemsCreateBusinessUnit = new ArrayList<>();
    }

    public static CreateNewBusinessUnit with() {
        return instrumented(CreateNewBusinessUnit.class);
    }

    public CreateNewBusinessUnit name(String name) {
        this.itemsCreateBusinessUnit.add(AddBusinessUnit.name(name));
        return this;
    }

    public CreateNewBusinessUnit andParentUnit(String parentUnit) {
        this.itemsCreateBusinessUnit.add(AddBusinessUnit.andParentUnit(parentUnit));
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                AddBusinessUnit.createBusinessUnit()
        );

        actor.attemptsTo(
                dataForBusinessUnitActions()
        );
    }

    private Performable[] dataForBusinessUnitActions() {
        this.itemsCreateBusinessUnit.add(AddBusinessUnit.andSave());
        return this.itemsCreateBusinessUnit.toArray(new Performable[this.itemsCreateBusinessUnit.size()]);
    }
}
