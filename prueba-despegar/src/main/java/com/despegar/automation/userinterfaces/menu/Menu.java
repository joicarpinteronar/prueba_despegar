package com.despegar.automation.userinterfaces.menu;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class Menu {

  public static final Target MENU_BUTTON = Target.the("Menu Vuelos").located(By.xpath("//nav/div[2]/div/div[3]/ul/li[2]/a/div/div"));

  public static final Target MENU_OPTIONS = Target.the("Opciones de Vuelo").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div/div/div[2]/div/div[1]/span/label/i"));

  public static final Target OPTION2 = Target.the("Opciones de Vuelo").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div/div/div[2]/div/div[1]/button/em"));

  private Menu() {}
}
