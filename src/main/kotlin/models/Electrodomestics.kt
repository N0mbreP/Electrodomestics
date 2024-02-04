package models

import java.awt.Color

open class Electrodomestics {
    protected var nom:String="Owu"
    protected  var consum:Char='G'
    protected  var pes:Double=5.0
    protected  var preuBase:Double= 0.0
    protected  var preu:Double=preuFinal()
    protected  var color:String="blanc"

    override fun toString(): String {
        return "$nom:\n   Preu Base:$preuBase\n   Color:$color\n   Pes:$pes\n   Preu Final:$preu"
    }
    protected open fun preuFinal():Double{
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

    protected open fun gettConsum():Char{
        return this.consum
    }
    protected open fun gettPes():Double{
        return this.pes
    }
    protected open fun gettPreuBase():Double{
        return this.preuBase
    }
    protected open fun gettPreu():Double{
        return this.preu
    }
    protected open fun gettColor():String{
        return this.color
    }

    protected open fun settNom(nom:String){
        this.nom=nom
    }
    protected open fun settPreuBase(preuBase:Double){
        this.preuBase=preuBase
    }
    protected open fun settColor(color: String){
        this.color=color
    }
    protected open fun settConsum(consum:Char){
        this.consum=consum
    }
    protected open fun settPes(pes:Double){
        this.pes=pes
    }

}