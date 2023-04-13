package com.despegar.automation.interactions.menu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.despegar.automation.userinterfaces.menu.Menu.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectMenuOption implements Interaction {

  private final String menuOption;
  private String submenuOption;

  public SelectMenuOption(String menuOption) {
    this.menuOption = menuOption;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(MENU_BUTTON, isPresent()),
        Click.on(MENU_BUTTON),
        Click.on(MENU_OPTIONS)

    );
  }

  public static SelectMenuOption selectMenu(String menuOption) {
    return instrumented(SelectMenuOption.class, menuOption);
  }

  public SelectMenuOption andSubmenu(String submenuOption) {
    this.submenuOption = submenuOption;
    return this;
  }

}
