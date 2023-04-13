package com.despegar.automation.interactions.waits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Clickable implements Interaction {

  Target elemento;

  public Clickable(Target elemento) {
    this.elemento = elemento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(elemento, isClickable()).forNoMoreThan(20).seconds());
  }
}
