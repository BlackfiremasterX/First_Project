////Добавить в калькулятор функцию расчета степени и извлечения из корня
////
//fun main()
//{
//    print("Введите первое число: ")
//    var num1 = readLine().toString().toDouble()
//    print("Введите второе число: ")
//    var num2 = readLine().toString().toDouble()
//    print("Выберите операцию: ")
//    var oper = readLine()
//    when(oper)
//    {
//        "+" -> println(num1+num2)
//        "-" -> println(num1-num2)
//        "/" -> println(num1/num2)
//        "*" -> println(num1*num2)
//        else -> print("Ошибка!")
//    }
//
//
//}
//



//Begin7◦. Найти длину окружности L и площадь круга S заданного радиуса R:
// L= 2·π·R,S=π·R2.
// В качестве значенияπиспользовать 3.14

//fun main()
//{
//    print("Введите радиус окружности: ")
//    var R = readLine()!!.toInt()
//    var π = 3.14
//    var L = 2*π*R
//    var S = π*R*R
//    print("Длина окружности равна: $L\nПлощадь круга равна: $S")
//}

import kotlin.math.*
fun main()
{
    print("Введите радиус большей окружности O1: ")
    var R1 = readLine()!!.toInt()
    print("Введите радиус меньшей окружности O2: ")
    var R2 = readLine()!!.toInt()
    var π = 3.14
    var S1 = π*R1*R1
    var S2 = π*R2*R2
    var S_ring = S1 - S2
    print("Площадь первого круга равна: $S1\nПлощадь второго круга равна: $S2\nПлощадь кольца равна: $S_ring")
var q = R1.pow(2)

    print(q)



}




