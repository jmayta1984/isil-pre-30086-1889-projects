# Repaso

1. **Caso** 

   Se desea una aplicación que permita gestionar los resultados de las carreras de autos **Fórmula 1 (F1)** y de las carreras de motocicletas **MotoGP (GP)**. Las especificaciones son las siguientes: 

- De cada carrera se conoce: código de la carrera, nombre de la carrera, temporada en la que se corrió, nombre del circuito, ciudad de ubicación del circuito, y país de ubicación del circuito. A continuación se muestran los datos de algunas carreras: 

   "F1-0001", "Gran Premio de Bahrein", 2024, "Circuito Internacional de Barein", "Sakhir", "Bahrein" 
   "F1-0002", "Gran Premio de Arabia Saudita", 2024, "Jeddah Corniche Circuit", "Jeddah", "Arabia Saudita" 
   "GP-1001", "Gran Premio de Catar", 2024, "Lusail International Circuit", "Doha", "Catar" 

- En una carrera participan vehículos de distintas marcas. De cada marca se conoce: código de la marca, nombre de la marca, país al que pertenece la marca. Aquí algunos ejemplos de marcas: 

   1, "Ferrari", "Italia" 
   2, "Red Bull", "Austria" 
   1001, "Ducati Lenovo", "Italia"
   1002, "Prima Pramac", "Italia" 

- De los pilotos que participan en las carreras se conoce: código del piloto, nombre del piloto, apellido del piloto, país al que representa el piloto. Aquí algunos ejemplos de pilotos: 

   1, "Charles", "Leclerc", "Monaco" 
   2, "Max", "Verstappen", "Paises Bajos" 3, "Sergio", "Perez", "Mexico" 
   1001, "Brad", "Binder", "Sudafrica" 1002, "Francesco", "Bagnaia", "Italia" 

- Cada piloto firma contrato con una marca por 1 o más temporadas; por lo tanto, durante dichas temporadas corre con vehículos de la marca que lo contrató. 
- Cuando se muestra el resultado de un piloto en una carrera de la **Fórmula 1**, se desea mostrar los siguientes datos: nombre de la carrera, temporada de la carrera, nombre del circuito, ciudad y país del circuito, nombre y apellido del piloto, país del piloto, marca del auto que condujo, país de la marca, puesto que ocupó al final de la carrera, puntos obtenidos. 
- En las carreras de la **Fórmula 1** se otorgan puntos a los puestos del 1 al 10 según la siguiente escala: 

|**Puesto** |1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |
| - | - | - | - | - | - | - | - | - | - | - |
|**Puntos** |25 |18 |15 |12 |10 |8 |6 |4 |2 |1 |

- Un ejemplo de cómo se desea mostrar el resultado de un piloto en una carrera de la **Fórmula 1** es el siguiente: 

   Carrera: Gran Premio de Bahrein Temporada: 2024 
   Circuito: Circuito Internacional de Barein Ciudad y pais: Sakhir, Bahrein 
   Piloto: Max Verstappen 
   Pais: Paises Bajos 
   Marca: Red Bull 
   Pais: Austria 
   Puesto: 1 
   Puntos: 25 

- En las carreras de la **Fórmula 1**, la carrera se corre siempre en un día domingo. 
- En las competencias de **MotoGP** se corren 2 carreras: el sábado se corre la **carrera Sprint**, y al día siguiente se corre la **carrera principal**. En la **carrera Sprint** el número de vueltas que debe completar el piloto es la mitad de la cantidad de vueltas que debe completar en la **carrera principal**. 
- En la **carrera Sprint** se otorga el puntaje usando la siguiente escala: 

|**Puesto** |1 |2 |3 |4 |5 |6 |7 |8 |9 |
| - | - | - | - | - | - | - | - | - | - |
|**Puntos** |12 |9 |7 |6 |5 |4 |3 |2 |1 |

- En la **carrera principal** se otorga el puntaje usando la escala siguiente: 

|**Puesto** |1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |11 |12 |13 |14 |15 |
| - | - | - | - | - | - | - | - | - | - | - | - | - | - | - | - |
|**Puntos** |25 |20 |16 |13 |11 |10 |9 |8 |7 |6 |5 |4 |3 |2 |1 |

- Cuando se muestra el resultado de un piloto en una carrera de la **MotoGP**, se desea mostrar los siguientes datos: nombre de la carrera, temporada de la carrera, nombre del circuito, ciudad y país del circuito, nombre y apellido del piloto, país del piloto, marca de la motocicleta que condujo, país de la marca, puesto que ocupó al final de la **carrera principal**, puesto que ocupó al final de la **carrera Sprint**, puntos obtenidos. 
- Un ejemplo de cómo se desea mostrar el resultado de un piloto en una carrera de la **MotoGP** es el siguiente: 

   Carrera: Gran Premio de Catar Temporada: 2024 
   Circuito: Lusail International Circuit Ciudad y pais: Doha, Catar 
   Piloto: Francesco Bagnaia 
   Pais: Italia 
   Marca: Ducati Lenovo 
   Pais: Italia 
   Puesto: 1 
   Puesto Sprint: 3 
   Puntos: 32 

## **Funcionalidad del proyecto** 
- El proyecto debe aplicar herencia y sobreescritura de métodos. También puede aplicar sobrecarga de métodos, si lo considera necesario. 
- El proyecto debe mostrar en la salida por consola: 
- El resultado de un piloto en una carrera de la **Fórmula 1 (use los datos del ejemplo mostrado arriba)**. 
- El resultado de un piloto en una carrera de la **MotoGP (use los datos del ejemplo mostrado arriba)**. 
- **El proyecto no debe mostrar** lista de carreras, tampoco lista de pilotos, ni lista de marcas. Solo debe mostrar lo solicitado en el punto anterior.
