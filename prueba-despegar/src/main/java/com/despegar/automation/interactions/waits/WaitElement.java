package com.despegar.automation.interactions.waits;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitElement {

  private WaitElement() {}

  public static Clickable esClickable(Target elemento) {
    return instrumented(Clickable.class, elemento);
  }

  public static Visible esVisible(Target elemento) {
    return instrumented(Visible.class, elemento);
  }

  public static Present esPresente(Target elemento) {
    return instrumented(Present.class, elemento);
  }
}
