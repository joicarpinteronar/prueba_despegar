package com.despegar.automation.interactions.waits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Present implements Task {
  Target elemento;

  public Present(Target elemento) {
    this.elemento = elemento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(elemento, isPresent()).forNoMoreThan(20).seconds());
  }
}
