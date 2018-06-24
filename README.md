# Monopolio Redes 1


## Instalación del proyecto:

1. Descargar la aplicación Virtual Serial Port Driver para emular los puertos serial
  [Virtual Serial Port Driver](URL "https://www.eltima.com/es/products/vspdxp/") "Descarguenlo como versión standard"
  
2. Descargar Hyperterminal para emular una maquina virtual.
  [HyperTerminal Windows](URL "https://www.hilgraeve.com/hyperterminal-trial/")
  
3. Clonar el proyecto del repositorio e instalar las librerías como se explica a continuación:
  * Les dejare en Google Drive una carpeta donde se encuentran 3 archivos para hacer funcionar la librería RXTX serial de manera correcta,
  dichos archivos son rxtxParallel.dll, rxtxSerial.dll y RXTXcomm.jar.
  
  * Los 2 archivos .dll (rxtxParallel y rxtxSerial) iran colocados en la ruta **C:\Program Files\Java\jre1.8.0_111\bin** 
  * El archivo faltante (RXTXcomm.jar) ira colocado en la ruta **C:\Program Files\Java\jre1.8.0_111\lib\ext**
  
4. Por último hacer `git pull origin master` en la consola para bajarse los cambios actualizados del repo.

### Nota importante:

* Todos los cambios que vayan a realizar haganlo en una rama aparte, *NO EN MASTER!* para evitar conflictos a futuro.
  El comando que van a colocar para crear un nuevo branch es: `git branch NOMBRE_DE_LA_RAMA` y luego `git checkout NOMBRE_DE_LA_RAMA`
* Suban todos sus cambios en sus ramas respectivas y yo me encargo de hacer el merge de ellas.


  
  
