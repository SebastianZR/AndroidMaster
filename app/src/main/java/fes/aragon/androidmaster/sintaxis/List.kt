package fes.aragon.androidmaster

fun main() {
    mutableList()


}
fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //println(readOnly.size)
    //println(readOnly.first())
    //println(readOnly.filter { it.contains("a") })

    readOnly.forEach{weekDay -> println(weekDay)}
}
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add(0, "Sebastian")
    println(weekDays)

}