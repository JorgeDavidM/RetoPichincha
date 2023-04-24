Elaborado por Jorge David Muñoz.

*) Para resolver este ejercicio, se creó un framework con las siguientes herramientas:
	-Eclipse IDE versión 4.27.0
	-Selenium versión 4.8.3
	-TestNG versión 7.6.1
	-Maven versión 3.9.1
	-Cucumber versión 7.9.0
	-Java versión 11.0.18

*) Se implementó PageFactory como patrón de diseño

*) Se crea una clase tipo BaseTest para declarar el driver, en este caso "chrome" y se emplean las anotaciones de TestNG para inicializar el driver antes de ejecutar los métodos de prueba y tumbarlo después de finalizar las pruebas.

*) De acuerdo a la metología PageFactory, se crean dos páginas que son las utilizadas para llevar el proceso de compra, (HomePage y CartPage), aquí se crean los elementos web con sus respectivos locators, y los métodos a utilizar en su debida página.

*) Se crea una clase de componentes Abstractos para poder ser reutilizados en los distintos métodos y sus páginas.

*) PARA EJECUTAR EL TEST, nos dirigimos a la carpeta src/test/java ingresamos al paquete demoblaze.test y aquí encontraremos el Test case "PurchaseTwoProducts". Para ejecutarlo, nos podremos apoyar con las anotaciones de TestNG dando click en "Run". Al final podremos ver en la pestaña TestNG, si nuestra prueba fue exitosa o no.

*) En la carpeta test-ouput encontraremos el archivo "emailable-report.html" aquí podremos visualizar en un HTML, el resultado de la prueba.

*) En la carpeta src/test/java encontraremos el package "cucumber". Aquí se redactó el escenario en Gherkin con el objetivo de la prueba.