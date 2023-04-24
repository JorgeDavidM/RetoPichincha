Elaborado por Jorge David Muñoz.

*) Para resolver este ejercicio, se utilizó la versión 10.13 de Postman

*) Se creó el ambiente de pruebas llamado "demoblaze_api", y se crean las variables "signup_url" y "login_url", con los valores indicados en el ejericio "https://api.demoblaze.com/signup" y "https://api.demoblaze.com/login".

*) La colección Demoblaze API, contiene 4 POST requests para ejecutar la prueba, se puede dirigir a la pestaña Runner y ejecutarlas en secuencia, allí podra verificar las validaciones de cada request, como lo son: Validar el codigo de respuesta (200 OK), validar la respuesta en JSON, validar el token al loggearse y validar la respuesta al hacer un inicio de sesión inválido.

*) En el request "SignUp" podrá verificar en la pestaña Pre-request Script, que se genera al azar mediante el metodo {{randomInt}} el usuario y la contraseña, para que pueda ser iterada la colección n-veces. Estos mismos valores son seteados para utilizarlos en los demás requests.