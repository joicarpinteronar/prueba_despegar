package com.despegar.automation.userinterfaces.searchflights;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchFlightsPage extends PageObject {
    public static final Target TXT_ORIGIN = Target.the("Ingresar Origen").located(By.xpath("//input[@type='text']"));
    public static final Target TXT_DESTINATION = Target.the("Ingresar Destino").located(By.xpath("//div[@id='searchbox-sbox-box-flights']/div/div/div/div[3]/div/div/div/div/div[2]/div/div/input"));
    public static final Target DATE_SELECT = Target.the("Seleccionar Dia").locatedBy("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div/div[text()='{0}']");
    public static final Target SELECT_DATE_SPECIFIC = Target.the("Seleccionar Fecha Especifica").located(By.xpath("//ul[@data-stid='location-field-leg1-destination-results']//li"));
    public static final Target BTN_DONE_CALENDAR = Target.the("Boton Listo Fecha").located(By.xpath("//em[contains(.,'Aplicar')]"));
    public static final Target BTN_SEARCH = Target.the("Boton Buscar vuelo").located(By.xpath("//em[contains(.,'Buscar')]"));
    public static final Target BTN_DATE_DEPARTING = Target.the("Boton Fecha Ida").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input"));
    public static final Target NEXT_MONTH = Target.the("Botón para pasar al siguiente mes calendario").locatedBy("//*[@id='component-modals']/div[1]/div[1]/div[2]/a[2]");
    public static final Target TOTAL_FINAL_PRICE = Target.the("Boton Seleccionar Primer Vuelo").located(By.xpath("//button[@data-testid='select-link']"));
    public static final Target ALERT_ERROR = Target.the("Alerta de Error campos vacios").located(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[1]/div/h3"));
    public static Target CLUSTERS = Target.the("List of search results").locatedBy("//div[@id='clusters']//span[@class='cluster-wrapper']//span[@class='amount price-amount']");


}


