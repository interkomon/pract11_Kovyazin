package DayW
enum class DaysWeek {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
    public fun GetDayName(day:DaysWeek):String{
    return when(day){
        DaysWeek.Monday -> "Понедельник"
        DaysWeek.Tuesday -> "Вторник"
        DaysWeek.Wednesday -> "Среда"
        DaysWeek.Thursday -> "Четверг"
        DaysWeek.Friday -> "Пятница"
        DaysWeek.Saturday ->"Суббота"
        DaysWeek.Sunday -> "Воскресенье"

    }


}
    public fun WorkingHolidays(workhol:String) {
    println("Введите день недели")
    when (workhol) {
        "Понедельник" -> println("Рабочий день")
         "Вторник "-> println("Рабочий день")
        "Среда" -> println("Рабочий день")
         "Четверг" -> println("Рабочий день")
         "Пятница" -> println("Рабочий день")
         "Суббота"-> println("Выходной день")
         "Воскресенье" -> println("Выходной день")
        else -> println("Проверьте правильность ввода")

    }

}
    public fun Coutry(counworkhol:String){
    println("Введите страну, чтобы узнать их рабочие дни и выходные из следующего списка\nСША\nБразалия\nРоссия\nАнглия\nГермания\nЯпония\nКитай\nИспания\nИталия")
    when(counworkhol){
        "США" -> println("Рабочая неделя: Воскресенье,Понедельник,Вторник,Среда,Четверг\nВыходные: Пятница,Суббота")
        "Бразилия" ->  println("Рабочая неделя: Воскресенье,Понедельник,Вторник,Среда,Четверг\nВыходные: Пятница,Суббота")
        "Россия" ->  println("Рабочая неделя: Понедельник,Вторник,Среда,Четверг,Пятница\nВыходные: Суббота,Воскресенье")
        "Англия" -> println("Рабочая неделя: Воскресенье,Понедельник,Вторник,Среда,Четверг\nВыходные: Пятница,Суббота")
        "Германия" -> println("Рабочая неделя: Понедельник,Вторник,Среда,Четверг,Пятница\nВыходные: Суббота,Воскресенье")
        "Япония" -> println("Рабочая неделя: Воскресенье,Понедельник,Вторник,Среда,Четверг\nВыходные: Пятница,Суббота")
        "Китай" -> println("Рабочая неделя: Понедельник,Вторник,Среда,Четверг,Пятница\nВыходные: Суббота,Воскресенье")
        "Испания" -> println("Рабочая неделя: Воскресенье,Понедельник,Вторник,Среда,Четверг\nВыходные: Пятница,Суббота")
        "Италия" -> println("Рабочая неделя: Понедельник,Вторник,Среда,Четверг,Пятница\nВыходные: Суббота,Воскресенье")
        else -> println("Проверьте написания введеного вами текста")
    }
}
public fun DayW(days1:String){
    println("Введите день недели, чтобы узнать следующий")
    when(days1){
        "Понедельник" ->println("Вторник")
        "Вторник" -> println("Среда")
        "Среда" -> println("Четверг")
        "Четверг" -> println("Пятница")
        "Пятница" -> println("Суббота")
        "Суббота" -> println("Воскресенье")
        "Воскресенье" -> println("Понедельник")
        else -> println("Проверьте написания введеного вами текста")
    }

}




