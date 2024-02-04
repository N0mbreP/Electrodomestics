package models

import java.awt.Color

open class Electrodomestics {
    protected var nom:String="Owu"
    private var consum:Char='G'
    private var pes:Double=5.0
    private var preuBase:Double= 0.0
    private var preu:Double=preuFinal()
    private var color:String="blanc"

    override fun toString(): String {
        return super.toString()
    }
    private fun preuFinal():Double{
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
        return result

    }

    constructor(nom: String, consum: Char, pes: Double, preuBase: Double, color: String){
        this.nom=nom
        this.consum=consum
        this.pes=pes
        this.preuBase=preuBase
        this.color=color
    }


    fun gettNom():String{
        return this.nom
    }

    fun gettConsum():Char{
        return this.consum
    }
    fun gettPes():Double{
        return this.pes
    }
    fun gettPreuBase():Double{
        return this.preuBase
    }
    fun gettPreu():Double{
        return this.preu
    }
    fun gettColor():String{
        return this.color
    }

    fun settNom(nom:String){
        this.nom=nom
    }
    fun settPreuBase(preuBase:Double){
        this.preuBase=preuBase
    }
    fun settColor(color: String){
        this.color=color
    }
    fun settConsum(consum:Char){
        this.consum=consum
    }
    fun settPes(pes:Double){
        this.pes=pes
    }

}