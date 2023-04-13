package com.despegar.automation.stepdefinitions;

import com.despegar.automation.models.searchflights.SearchFlightsModel;
import com.despegar.automation.questions.TheBestPrice;
import com.despegar.automation.questions.ValidateInformationText;
import com.despegar.automation.questions.VerifyListFlights;
import com.despegar.automation.tasks.searchflights.*;
import com.despegar.automation.userinterfaces.searchflights.SearchFlightsPage;
import com.despegar.automation.utils.Constants;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import java.util.List;
import static com.despegar.automation.userinterfaces.searchflights.SearchHotelPage.LIST_HOTEL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SearchFlightsStepDefinitions {

    DespegarResultsPage despegarResultsPage;

    @Cuando("^ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente$")
    public void goToSearchFlights(List<SearchFlightsModel> flights) {
        theActorInTheSpotlight().attemptsTo(SearchFlights.searchFlights(flights.get(0)));
    }
    @Entonces("se debe mostrar la lista de vuelos disponibles")
    public void mustSelectedFlights() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerifyListFlights.selected())
        );
    }
    @Entonces("se debe mostrar el mensaje de error que faltan campos por llenar")
    public void mustSelectedFlightsClean() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateInformationText.validateInformationText(SearchFlightsPage.ALERT_ERROR),equalTo(Constants.ERROR_FIELD_CLEAN)));
    }

    @Y("agrega (.*) Adultos y (.*) ninos para la reserva del viaje")
    public void selectAdultsAndChildrenToReserveRoom(Integer numberAdults, Integer numberChildren) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTravelers.addTravelers(numberAdults, numberChildren));
    }

    @Entonces("^se validan los precios mas baratos (.*)$")
    public void validate_prize(String cheaperPrice) throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheBestPrice.is(), Matchers.equalTo(cheaperPrice)));

    }

    @Y("se alamcenan los precios mas baratos en un Excel marcando el mas barato")
    public void addPrizeExcel() throws InterruptedException {
        despegarResultsPage.visualizarVuelos();
    }

    @Y("el viajero selecciona la opcion de Alojamiento")
    public void selectedHotel() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(SearchHotel.goHotel());
    }

    @Cuando("^ingresa la ciudad a buscar el hotel$")
    public void goToSearchHotel(List<SearchFlightsModel> flights) {
        theActorInTheSpotlight().attemptsTo(SearchAccomoding.searchHotel(flights.get(0)));
    }

    @Entonces("^se validan la lista de hoteles disponibles$")
    public void validate_list_hotels(String hotels) throws Throwable {
        theActorInTheSpotlight().should(seeThat(ValidateInformationText.validateInformationText(LIST_HOTEL), Matchers.equalTo(hotels)));

    }
}
