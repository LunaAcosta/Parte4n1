package com.example.parteivn1

fun main (){

    val prueba1 = coleccion(n1 =10 , n2 = 10, n3 = 10)
    println("test1 pasando ${prueba1==30}")

}
fun coleccion(n1:Int?, n2:Int?, n3:Int?): Int {
    var valor = 0

    if(n1==n2 && n1==n2 && n2== n1 && n2==n3 && n3==n1 && n3==n2) {

        valor = 0

        return valor
    }
    else if(n1==null || n2==null || n3==null) {
        valor = -100
        return valor
    }
    else if(n1!!>n2 && n1!!> n3){
        valor=-1
        return valor
    }
    else if(n2!!>n3 && n2!!>n1){
        valor=-2
        return valor
    }
    else if(n3!!>n1 && n3!!>n2){
        valor=n1+n2+n3
    }
    return valor
}