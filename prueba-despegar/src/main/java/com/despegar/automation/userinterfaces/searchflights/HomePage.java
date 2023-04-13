package com.despegar.automation.userinterfaces.searchflights;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BTN_TRAVELERS = Target.the("Boton Viajeros").located(By.xpath("//button[@data-testid='travelers-field']"));
    public static final Target BTN_ADD = Target.the("Boton Viajeros").located(By.xpath("//button[@data-testid='travelers-field']"));
    public static final Target BTN_ADD_ADULTS = Target.the("Agregar Adultos").located(By.xpath("(//div[@data-testid='room-1']//button)[2]"));
    public static final Target BTN_ADD_CHILDREN = Target.the("Agregar Ninos").located(By.xpath("(//div[@data-testid='room-1']//button)[4]"));

    //Nuevos Localizadores
    public static final Target CLOSE_MODAL_SESION = Target.the("Boton Cerrar Modal").located(By.cssSelector("body > nav > div.login-incentive.login-wrapper.shifu-3-card.-shifu-3-shadow-static.-one-loyalty.login-branch-new-design.-show > div.login-incentive--content > span"));
    public static final Target BTN_COOKIES = Target.the("Boton Aceptar Cookies").located(By.xpath("//*[@id='lgpd-banner']/div/a[2]"));

    public static final Target BTN_X = Target.the("Boton X Modal").located(By.xpath("//body/nav/div[4]/div[1]/i"));




}
