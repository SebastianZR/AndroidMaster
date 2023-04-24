package fes.aragon.androidmaster.exercises

fun main() {
    val morningNotification = 51
    val eveningNotification = 130

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMenssages:Int){
    if(numberOfMenssages <= 99){
        println("You have $numberOfMenssages notifications")
    }else{
        println("Your phone is blowing up you have 99+ notifications")
    }
}