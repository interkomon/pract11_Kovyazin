package Color

import org.omg.CORBA.PRIVATE_MEMBER

enum class Colors {
    Red,Yellow,Green,Blue,Orange
}
    public fun  GetColorNumber(color:Colors):Int{
        return when (color) {
            Colors.Red -> 1
            Colors.Yellow -> 2
            Colors.Green -> 3
            Colors.Blue -> 4
            Colors.Orange -> 5

        }

}
 public   fun ColorNum(cnum:String){
    println("Введите название цвета,чтобы узнать его код")
    when(cnum) {
        "Красный" -> println("#FF0000")
        "Черный" -> println("#000000")
        "Белый" -> println("#FFFFFF")
        "Желтый" -> println("#FFFF00")
        "Зеленый" -> println("#008000")
        "Синий" -> println("#0000FF")
        "Розовый" -> println("#FFC0CB")
        "Золотой" -> println("#FFD700")
        "Оранжевый" -> println("#FFA500")
        "Серебряный" -> println("#C0C0C0")
        "Лаймовый" -> println("#00FF00")
        else -> println("УВЫ...В списке твоего цвета нет")


    }

}

 public   fun  MixColor(mix:String){
    println("Введите два цвета по примеру <ЧерныйБелый> чтобы смешать")
    when(mix){
        "КрасныйСиний"-> println("Фиолетовый")
        "СинийЗеленый"-> println("Бирюзовый")
        "ЗеленыйЖелтый"-> println("Оливковый")
        "ЗеленыйЧерный"-> println("Лесная зелень")
        "КоричневыйЗеленый"-> println("Хаки")
        "ЖелтыйКрасный"-> println("Оранжевый")
        "БелыйКрасный"-> println("Розовый")
        "ЖелтыйСиний"-> println("Зеленый")
        else-> println("УВЫ...В списке таких цветов нет")
    }
}
public fun ColorRGB(rgb:String){
    println("Введите RGB а по примеру <255,255,255> чтобы узнать цвет")
    when(rgb){
        "0,0,0"-> println("Black")
        "255,0,0"-> println("Red")
        "0,255,0"-> println("Lime")
        "0,0,255"-> println("Blue")
        "255,255,0"->println("Yellow")
        "192,192,192"-> println("Silver")
        "128,128,128"-> println("Gray")
        "128,128,0"-> println("Olive")
        "0,128,0"-> println("Green")
        "128,0,128"-> println("Purple")
        "0,128,128"-> println("Teal")
        "0,0,128"-> println("Navy")
        else->println("УВЫ...В списке таких цветов нет")

    }



}


