# UNIVERSIDAD DE COSTA RICA 
# Proyecto-Redes-I-FTP
# Estudiantes: Jonathan Castro - María Orocú.

En este apartado se detallará el software que se debe instalar para ejecutar este proyecto y cuales son los pasos a seguir. 

# Software a instalar:

- El IDE de Netbeans que permite crear y ejecutar proyectos en el lenguaje de programación java. 
  Para desarrollar este proyecto se utilizó la versión 12.0. Este se puede instalar desde su página oficial, en el siguiente enlace:                                               https://netbeans.apache.org/download/index.html
  
- Herramientas de desarrollo para JAVA (JDK) como su nombre lo dice son herramientas que permiten la creación de proyectos en este lenguaje de programación. El cual fue elegido   para la creación de este proyecto. Se puede descargar en: https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
  
- Motor de base de datos, para crear la base de datos se utilizó MySQL Workbench esta herramienta permite generar, diseñar y administrar bases de datos. El cual se puede           descargar   en este enlace: https://dev.mysql.com/downloads/workbench/
  
- El archivo tipo JAR que permite realizar la conexión de MYSQL con JAVA. Este proyecto se creó con el conector versión 5.1.49. Se encuentra disponible para descargarse en la     página oficial de MySQL https://dev.mysql.com/downloads/connector/j/5.1.html 

- También, contar con la librería java.io la cual se encarga de gestionar las funciones de entrada/salida del sistema por medio de flujos de datos, serialización y el sistema de   archivos. Además, la librería java.net que permite realizar conexiones a través de la red comunicando de este modo dos o más computadoras. 

A continuación por medio de una serie de capturas de pantalla se detallarán los pasos a seguir para clonar el proyecto y ejecutarlo. 

# Clonación del proyecto

1. Se debe abrir el IDE de Netbeans.
2. Seleccionar la opción Team/ Equipo en la barra principal. 
![Captura de pantalla (417)](https://user-images.githubusercontent.com/28690419/86803156-f89a9700-c032-11ea-9b4a-5f505487ff96.png)
3. Luego de seleccionar Team/Equipo se despliegan una serie de opciones, de las cuales se elegirá Git y seguidamente Clone.
![Captura de pantalla (411)](https://user-images.githubusercontent.com/28690419/86814230-5a143300-c03e-11ea-8728-37b471a8f03e.png)
4. Se desplegará una ventana "Clone Repository" en la que se solicita el enlace del repositorio, las credenciales de la cuenta en GitHub y la ruta deseada para clonar el proyecto. Luego de esto dar click en Next. 
![Captura de pantalla (412)](https://user-images.githubusercontent.com/28690419/86814693-ffc7a200-c03e-11ea-88be-c5fd638cbc79.png)
El enlace del repositorio se puede copiar desde la sección de code como se muestra en la siguiente imagen.
![Captura de pantalla (418)](https://user-images.githubusercontent.com/28690419/86815060-7795cc80-c03f-11ea-9315-711ce90145ad.png)
5. Se mostrará la siguiente ventana y es necesario seleccionar el botón de Next.
![Captura de pantalla (413)](https://user-images.githubusercontent.com/28690419/86815636-1cb0a500-c040-11ea-917a-74a1ff948452.png)
6. Finalmente es necesario presionar el botón de Finish y el proyecto quedará clonado correctamente. 
![Captura de pantalla (414)](https://user-images.githubusercontent.com/28690419/86816613-45856a00-c041-11ea-9965-86fc0c9d4436.png)

*En el codigo de este proyecto ya se encuentra el conector de MySQL con JAVA. En caso de no encontrarse se agrega de la siguiente manera. 
1. Con el proyecto ya clonado en Netbeans, es necesario buscar la carpeta de Libraries dentro del proyecto. 






Se requiere correr primero el server en la carpeta server del src

Si quiere ingresar como administrador las credenciales son: Admin para nombre de usuario y contraseña
