## Proyecto: Automatizacion Aplicacion Despegar
#Tipo Aplicacion: Web
#Ambiente Productivo
#Modulo: Vuelos, Hoteles

En la siguiente sección se describen los módulos que abarca el proyecto de automatización web para la aplicacion de Despegar, modulo de vuelos y hoteles, la mayoría de los cuales forman parte de la arquitectura propuesta por el patrón Screenplay:

* ```src/main/java```

``` 
+ com.despegar.automation.exceptions
    Clases que detectan excepciones personalizadas cuando falla la automatización.

+ com.despegar.automation.interactions
    
Clases que realizan las acciones adicionales que el usuario realiza sobre la interfaz o el servicio, y que el framework SerenityBDD no tiene.
	
+ com.despegar.automation.models
    Clases que definen objetos de negocio abstraídos en una entidad real, modelados por atributos y métodos.

+ com.despegar.automation.questions
    Clases con las que se hacen preguntas al sistema para luego ser verificadas en las definiciones de pasos (asserts).

+ com.despegar.automation.tasks
    
Clases que representan las tareas realizadas por el actor a nivel de proceso de negocio.   

+ com.despegar.automation.userinterfaces
    Clases donde se mapean los elementos de la interfaz de usuario y a su vez para la interacción con cada uno de estos elementos.

+ com.despegar.automation.utils
   
Clases que contienen utilidades o funcionalidades comunes, enums, constantes manejadas en el proyecto, conexión a la base de datos, etc.
``` 

* ```src/test/java```

``` 
+ com.despegar.automation.runners
    Clases que representan a los runners para ejecutar la automatización con los escenarios indicados en la función.
    
+ com.despegar.automation.stepdefinitions
    
Clases que son el punto de entrada de la característica para la ejecución de la automatización.
``` 

* ```src/test/resources```

``` 
+ 
+ features
     Representación de los escenarios de prueba en lenguaje Gherkin a través de archivos escritos en Cucumber.
    
+ webdriver
     Carpeta donde se almacenan los drivers, agrupados por Sistema Operativo
``` 

* ```Herramientas```

+ Framework: Serenity
+ Metodologia de desarrollo: BDD
+ Patron de Diseño: ScreenPlay
+ Lenguaje de Programacion: Java 1.8
+ Gestor de Dependencias: Gradle
+ Runner: JUnit
+ Cucumber

* ```Desarrollo```
El desarrollo de la automatizacion se llevo a cabo con las herramientas y framework ya mecionados, para interactuar con los elementos web de la aplicacion y gestionar los escenarios de pruebas escritos en lenguaje Gherkin de los ya diseñados para esta prueba.
*  Nota: Como es un ambiente productivo la automatizacion puede ser inestable


* ```Ejecucion```
Se puede ejecutar desde un IDE de desarrollo, compilando con Gradle o JUnit

Tambien se puede ejecutar desde el achivos raiz ejecutando el comando:

gradle clean test aggregate

* ```Reporte```

Una vez Ejecutado los test se genera un reporte en la ruta: target/site/serenity --> archivo index.html


* ```Criterios Tecnicos```
* 
La prueba se desarrollo en una maquina con Sistema Operativo Windows 10