Imatge del UML:
![image](https://github.com/N0mbreP/Electrodomestics/assets/109170634/e31d2e9b-58b3-4af6-b743-b935c83b70eb)

Text per generar l'UML:

@startuml
class Electrodomestics{
-- atributs --
- nom:String
- consum:Char
- pes:Double
- preuBase:Double
- preu:Double
- color:String

-- mètodes --
+override toString():String

+getNom():String
+getPreu():Double
+getColor():String
+getConsum():Char
+getPes():Double

+settNom(nom:String)
+settPreuBase(preuBase:Double)
+settColor(color:String)
+settConsum(consum:Char)
+settPes(pes:Double)

+preuFinal(preu:Double):Double
         }

class Rentadora{
-- atributs --
- carrega:Int

-- mètodes --
+override toString():String

+getCarrega():Int

+settCarrega(carrega:Int)

+override preuFinal(preu:Double):Double
         }

class Televisio{
-- atributs --
-mida:Double

-- mètodes --
+override toString():String

+getMida():Double

+settMida(mida:Double)

+override preuFinal(preu:Double):Double
         }

Electrodomestics<|-- Televisio
Electrodomestics<|-- Rentadora
@enduml
