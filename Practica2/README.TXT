------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Práctica Numero 01. 
PURPOSE OF PROJECT: Orientar a los traders amateurs y profesionales en la verificacion de acciones
de la bolsa de chicago.
VERSION or DATE:2020/05/25 y 2020/06/4
HOW TO START THIS PROJECT: Ejecutar el método main de la clase Principal.
Click derecho esta clase y click en void main(String args[]){} o desde la terminal con el tipo 
de archivo en este caso java y el nombre en este caso Principal
AUTHORS: Jacobo Rave Londoño
USER INSTRUCTIONS: Al ejecutar el método main se despliega un menú con 9 opciones y la 10 para salir
("1) Leer Fichero");
("2) Ver Datos");
("3) Cargar mis Velas");
("4) Crear Velas Minuto");
("5) Crear Velas Hora");
("6) Ver Velas");
("7) Guardar mis velas");
("8) Filtrar mis Velas");
("9) Backtesting");
("00) Salir");

si se da 1 hay que ingresar la ruta del archivo Linux: ../archivo.txt  Windows: ..\archivo.txt

si se da 2 se pueden ver los datos adjuntados y se dicen cuantos hay

si se da 3 hay que ingresar la ruta del archivo personal Linux: ../archivo.txt  Windows: ..\archivo.txt

si se da 4 o 5 se crea velas de 1 min o 1 hora respectivamente y se despliga otro menú

si se da 6 se visualizan las velas creadas.

si se da 7 se guarda la vela adjuntada

si se da 8 aparece un menú para filtrar las velas

1) Filtrar por Hora y Fecha
2) Filtrar por Color
3) Ordenar por tamanio
4) Ordenar por extension
5) Realizar filtrado
6) Grabar velas filtradas
00) Volver a principal

1 = si se quiere filtrar por hora y fecha. Se ingresa la fecha con el formato yyyyMMDD sin diagonal o backslah
2 = para filtrar con color se ingresa verde o rojo
3 = tamaño se organiza de mayor a menor
4 = ordenar por extension de las mechas
5 = si ya se pidió alguna de las anteriores el 5 la ejecuta. 
Si se pide ordenar por color despues se da 5 para que la filtre
6 = grabar la vela filtrada para despues descargarla
0 = para volver al menú principal

si se da 9 aparece una lista de estrategias.

1) Crear mis estrategias
2) Probar mis estrategias

  si se da 1 aparece este  menú

  1) Estrategia Sencilla
  2) Estrategia Compuesta de Cruce
  3) Estrategia Booleana

    si da 1 en sencilla nos piden nombre de la estrategia 

    1) Regresion Lineal
    2) Promedio Movil

       si se da 1 pide la longitud y el threshold
       si se da 2 pide la longitud y el threshold

       
---------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------
Implementacion de las estrategias = Jacobo Rave Londoño

Estrategia Sencilla
regresion lineal

n = 5   threshold = 8022  hora = 952   fecha  = 20200429
Se espera que baje el precio y que no invierta.

El programa nos dice 0 de 1 estrategia recomienda que invierta.
No invertir





EstrategiaCompuestaDeCruce
Promedio movil 1 n=10 

promedio movil 2 n=15

hora = 949 fecha = 20200429

Se espera que suba para invertir 
El programa nos dice 1 de 1 recomienda que invierta






EstrategiaCompuestaBooleana:

Estrategia Sencilla 
Regresion lineal
                    nombre = a
                    longitud = 5
                    threshold = 8814

EstrategiaCompuestaDeCruce
PromedioMovil 
                    nombre = s
                    longitud1 = 6
                    longitud2 = 10

Hora = 954 Fecha = 20200429

Se espera que invierta
El programa dice que  1 de 2 recomienda que invierta
