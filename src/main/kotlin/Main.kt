import models.*

fun main() {
    var electrodomestico1 = Electrodomestics(nom = "Lavadora",preuBase = 500.0,color = "Blanco",consum = 'A',pes = 30.0)
    var electrodomestico2 = Electrodomestics(nom = "Televisor",preuBase = 700.0,color = "Negro",consum = 'C',pes = 20.0)
    var electrodomestico3 = Electrodomestics(nom = "Nevera",preuBase = 800.0,color = "Plateado",consum = 'B',pes = 50.0)
    var electrodomestico4 = Electrodomestics(nom = "Licuadora",preuBase = 100.0,color = "Verde",consum = 'A',pes = 3.0)
    var electrodomestico5 = Electrodomestics(nom = "Cafetera", preuBase = 80.0, color = "Rojo", consum = 'D', pes = 5.0)
    var electrodomestico6 = Electrodomestics(nom = "Microondas", preuBase = 120.0, color = "Gris", consum = 'B', pes = 15.0)
    var electrodomestico7 = Electrodomestics(nom = "Aspiradora", preuBase = 200.0, color = "Azul", consum = 'C', pes = 8.0)
    var electrodomestico8 = Electrodomestics(nom = "Secadora", preuBase = 600.0, color = "Negro", consum = 'A', pes = 35.0)
    val arrayElectrodomestics= arrayOf<Electrodomestics>(electrodomestico1, electrodomestico2,electrodomestico3,
        electrodomestico4,electrodomestico5,electrodomestico6,electrodomestico7,electrodomestico8)


    val rentadora = Rentadora(carrega = 8, nom = "Rentadora A", consum = 'A', pes = 50.0, preuBase = 500.0, color = "Blanco")

    val televisio = Televisio(mida = 55.0, nom = "TV Smart", consum = 'A', pes = 20.0, preuBase = 800.0, color = "Negro")
    for (electrodomestio in arrayElectrodomestics){
        println(electrodomestio.toString())
    }
    println(rentadora.toString())
    println(televisio.toString())
}