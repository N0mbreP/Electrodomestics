package models

class Rentadora:Electrodomestics {
    private var carrega:Int=5
    constructor(nom: String, consum: Char, pes: Double, preuBase: Double, color: String,
                carrega:Int):super(nom, consum, pes, preuBase, color){
                    this.carrega=carrega
                }
    override fun toString(): String {
        return "$nom:\n   Preu Base:$preuBase\n   Color:$color\n   Pes:$pes\n   Preu Final:$preu\n  Carrega:$carrega"
    }
    override fun preuFinal():Double{
        var result:Double=this.preuBase
        when{
            this.pes in 6.0..20.0->result+=20.0
            this.pes in 20.01..50.0->result+=50.0
            this.pes in 50.01..80.0->result+=80.0
            this.pes > 80.0->result+=100.0
        }
        when(this.consum){
            'A'->result+=35.0
            'B'->result+=30.0
            'C'->result+=25.0
            'D'->result+=20.0
            'E'->result+=15.0
            'F'->result+=10.0
            'G'->result+=0.0
        }
        when(this.carrega){
            6->result+=55
            7->result+=55
            8->result+=70
            9->result+=85
            10->result+=100
        }
        return result
    }

    fun getCarrega():Int{
        return this.carrega
    }

    fun settCarrega(carrega: Int){
        this.carrega=carrega
    }

}