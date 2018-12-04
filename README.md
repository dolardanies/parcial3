##Parcial 3 Conversion de Temperatura

##Daniel Esteban Castiblanco

Link a Heroku: https://parcial-3.herokuapp.com/

Descripcion de la arquitectura:

Desde una pagina web se muestra un formulario donde el usuario digita el valor de la temperatura
y el tipo de conversion, celsius a fahrenheit o viceversa, por debajo un cliente javascript toma dichos datos
y mediante comunicacion asincrona utilizando axios se conecta a un Api REST, el cual me ejecuta dichas conversiones y me retorna el 
valor adecuado de acuerdo al tipo de conversion que el usuario haya elegido, el formulario web se encuentra montando en heroku,
que a su vez esta conectado a github donde se tiene todo el codigo y el modelo MVC del proyecto.




