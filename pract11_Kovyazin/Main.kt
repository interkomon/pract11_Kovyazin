import DayW.*
import Color.*

fun main(){
    var day = ""
    var color = ""
    while (day !="Monday" && day!= "Tuesday" && day!= "Wednesday"&& day!= "Thurday"&& day!= "Friday"&& day!= "Saturday"&& day!= "Sunday")
    {
        println("Введите день недели (на английском)")
        day = readLine()!!.toString()
        if (day !="Monday" && day!= "Tuesday" && day!= "Wednesday" && day!= "Thurday" && day!= "Friday" && day!= "Saturday"&& day!= "Sunday")
            println("Ошибка. Проверьте ввод")
    }

    var dayweek = DaysWeek.valueOf(day)
    println(GetDayName(dayweek))
    println(WorkingHolidays())
    println(Coutry())
    println(DayW())


    while (color !="Red" && color != "Yellow" && color != "Green" && color != "Blue" && color != "Orange")
    {
        println("Введите цвет (на английском)")
        color = readLine()!!.toString()
        if (color !="Red" && color != "Yellow" && color != "Green" && color != "Blue" && color != "Orange")
            println("Ошибка. Проверьте ввод")
    }
    var colorn = Colors.valueOf(color)

    println(GetColorNumber(colorn))
    println(ColorNum())
    println(MixColor())
    println(ColorRGB())
}








