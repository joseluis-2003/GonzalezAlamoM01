## Ejercicio 3

Modifica el proyecto de manera que el segundo activity ya no sea simplemente un contador, sino que se convierta en un activity con un FrameLayout que mostrará diversos fragments, siendo al menos estos tres: "Home", "Contador" y "Salir". Asimismo, incorpora una barra de navegación que permita transitar entre los diferentes fragments.
Incluyo capturas de pantalla de los tres fragments:

## Home
![Captura 1](img/home.png)

## Info
![Captura 2](img/info.png)

## Contador
![Captura 3](img/contador.png)

En esta actividad, he implementado un FrameLayout que alberga cuatro fragments, entre los cuales se puede navegar mediante una barra de navegación. El primer fragment es una pantalla básica de inicio ("Home") con una imagen, el segundo corresponde a la actividad previa (contador), el tercero contiene información acerca de todas las actividades realizadas, y el cuarto, denominado "Salir", cierra la sesión y retorna a la pantalla de inicio de sesión al ser pulsado.

Adicionalmente, se han creado nuevos directorios, como "MENU" (donde se ha diseñado un menú con cuatro botones para acceder a todos los fragments), el repositorio "NAVIGATION" que almacena todos los fragments creados, así como nuevos elementos como la imagen de portada y diversos iconos en el directorio "DRAWABLE".

## Ejercicio 4

Añade un Fragment mas que se llame API y sigue el tutorial (para la parte del consumo de la API) proporcionado para consumir un API con android(en esta entrega no tendrás que reflejar los resultado en la interfaz gráfica, solo en el log). Por otro lado crea un microservicio con una sola entidad.

## Implementacion

Para que la interfaz funcione, necesitas implementar algunas librerias para que se pueda consumir la api.

![Captura 4](img/implementacion.png)

## Interfaz 

Lo primero para poder hacer el ejecicio es crearse una interfaz para poder hacer el GET en el Postman.

![Captura 5](img/Product.png)

![Captura 6](img/api.png)

![Captura 7](img/consola.png)

## Postman 

![Captura 8](img/postman.png)





