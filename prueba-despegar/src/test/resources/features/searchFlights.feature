#language: es
#Author: Ivan Carpintero

Característica: Como Usuario Viajero de la Aplicacion
                Quiero poder buscar vuelos, paquetes y hoteles de diferentes formas
                Para ir a los destinos que quiero.

  Esquema del escenario: Validar la busqueda de vuelos de ida y regreso de manera exitosa y almacenarlos en un excel
    Dado que un Viajero ingresa al portal de Despegar
    Y el viajero selecciona el menu de Vuelos y selecciona la opcion de Ida y Vuelta
    Cuando ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente
       | origin   | destination   |
       | <origin> | <destination> |
    Entonces se validan los precios mas baratos <precio>
    Y se alamcenan los precios mas baratos en un Excel marcando el mas barato
    Ejemplos:
      | origin           | destination | precio  |
      | Bogotá, Colombia | Medellín    | 500.000 |

  Esquema del escenario: Validar la busqueda de hoteles de entrada y salida seleccionar el mas economico
    Dado que un Viajero ingresa al portal de Despegar
    Y el viajero selecciona la opcion de Alojamiento
    Cuando ingresa la ciudad a buscar el hotel
      | origin   |
      | <origin> |
    Entonces se validan la lista de hoteles disponibles

    Ejemplos:
      | origin           |
      | Bogotá, Colombia |

