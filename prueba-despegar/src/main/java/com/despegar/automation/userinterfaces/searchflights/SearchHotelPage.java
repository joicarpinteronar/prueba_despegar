package com.despegar.automation.userinterfaces.searchflights;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchHotelPage extends PageObject {

    public static final Target BTN_ACCOMODATION = Target.the("Boton Alojamiento").located(By.xpath("//body/nav/div[2]/div/div[3]/ul/li[1]/a/div/div"));
    public static final Target TXT_CITY = Target.the("Buscar Ciudad").located(By.xpath("//*[@id='searchbox-sbox-box-hotels']/div/div/div/div/div[3]/div[1]/div/div/div/input"));
    public static final Target BTN_DATE = Target.the("Seleccionar Fechas").located(By.xpath("//*[@id='searchbox-sbox-box-hotels']/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input"));

    public static final Target DATE_SELECT = Target.the("Seleccionar Dia").locatedBy("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div/div[text()='{0}']");

    public static final Target BTN_DATE_IN = Target.the("Seleccionar Fecha Inicial").located(By.xpath("//div[@id='component-modals']/div[4]/div/div[2]/div/div[3]/div[24]/div"));

    public static final Target BTN_DATE_END = Target.the("Seleccionar Fecha Final").located(By.xpath("//div[@id='component-modals']/div[4]/div/div[2]/div/div[3]/div[27]/div"));

    public static final Target BTN_APLICAR = Target.the("Boton Aplicar").located(By.cssSelector(".sbox5-floating-tooltip-opened .btn-text"));

    public static final Target BTN_BUSCAR = Target.the("Boton Buscar").located(By.xpath("//div[@id='searchbox-sbox-box-hotels']/div/div/div/div/div[3]/button/em"));

    public static final Target LIST_HOTEL = Target.the("Lista Hotel").located(By.xpath("/html/body/aloha-app-root/aloha-results/div/div/div/div[2]/div[2]"));

}
