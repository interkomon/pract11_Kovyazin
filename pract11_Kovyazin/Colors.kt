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
 public   fun ColorNum():String{
    println("Введите название цвета (на русском),чтобы узнать его код ")
     var cnum = readLine()!!.toString()
    return when(cnum) {
        "Красный" -> "#FF0000"
        "Черный" -> "#000000"
        "Белый" -> "#FFFFFF"
        "Желтый" -> "#FFFF00"
        "Зеленый" -> "#008000"
        "Синий" ->"#0000FF"
        "Розовый" ->"#FFC0CB"
        "Золотой" ->"#FFD700"
        "Оранжевый" -> "#FFA500"
        "Серебряный" -> "#C0C0C0"
        "Лаймовый" ->"#00FF00"
        else ->"УВЫ...В списке твоего цвета нет"


    }

}

 public   fun  MixColor():String{
    println("Введите два цвета по примеру <ЧерныйБелый> чтобы смешать")
     var mix = readLine()!!.toString()
   return when(mix){
        "КрасныйСиний"-> "Фиолетовый"
        "СинийЗеленый"-> "Бирюзовый"
        "ЗеленыйЖелтый"-> "Оливковый"
        "ЗеленыйЧерный"-> "Лесная зелень"
        "КоричневыйЗеленый"->"Хаки"
        "ЖелтыйКрасный"-> "Оранжевый"
        "БелыйКрасный"-> "Розовый"
        "ЖелтыйСиний"-> "Зеленый"
        else->"УВЫ...В списке таких цветов нет"
    }
}
public fun ColorRGB():String{
    println("Введите RGB а по примеру <255,255,255> чтобы узнать цвет")
    var rgb = readLine()!!.toString()
  return  when(rgb){
        "0,0,0"->"Black"
        "255,0,0"-> "Red"
        "0,0,255"-> "Blue"
        "255,255,0"->"Yellow"
        "192,192,192"->"Silver"
        "128,128,128"-> "Gray"
        "0,128,0"-> "Green"
        "128,0,128"->"Purple"
        else->"УВЫ...В списке таких цветов нет"

    }



}


