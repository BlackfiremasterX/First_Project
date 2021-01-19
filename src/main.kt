//Добавить в калькулятор функцию расчета степени и извлечения из корня
//
fun main()
{
    print("Введите первое число: ")
    var num1 = readLine().toString().toDouble()
    print("Введите второе число: ")
    var num2 = readLine().toString().toDouble()
    print("Выберите операцию: ")
    var oper = readLine()
    when(oper)
    {
        "+" -> println(num1+num2)
        "-" -> println(num1-num2)
        "/" -> println(num1/num2)
        "*" -> println(num1*num2)
        else -> print("Ошибка!")
    }


}

