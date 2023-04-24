package fes.aragon.androidmaster

fun main() {
    val mes = 7
    getMonth(mes)
    getTrimester(mes)
    getSemester(mes)

}
fun getMonth(month:Int){
    when(month){
        1 -> {
            println("Enero")
            println("Mi cumpleanos")
        }
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Opcion inadecuada")
    }
}
fun getTrimester(month:Int){
    when(month){
        1,2,3 -> println("Primer Trimestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")
        else -> println("Opcion inadecuada")
    }
}
fun getSemester(month:Int){
    when(month){
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        else -> println("Opcion inadecuada")
    }
}