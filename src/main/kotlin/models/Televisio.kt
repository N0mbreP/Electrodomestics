package models

class Televisio:Electrodomestics{
    private var mida:Double=28.0
    constructor(nom: String, consum: Char, pes: Double, preuBase: Double, color: String,
                mida:Double):super(nom, consum, pes, preuBase, color){
        this.mida=mida
    }
    override fun toString(): String {
        return "$nom:\n   Preu Base:$preuBase\n   Color:$color\n   Pes:$pes\n   Preu Final:$preu\n  Mida:$mida"
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
        when{
            this.mida in 29.0..32.0->result+=50
            this.mida <43.0->result+=100
            this.mida <51.0->result+=150
            this.mida>=51.0->result+=200
        }
        return result
    }
}
