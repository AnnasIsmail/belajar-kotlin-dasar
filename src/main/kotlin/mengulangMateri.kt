infix fun String.comppareString(to: String): Int{
    return this.compareTo(to)
}

fun main() {
    val integer: Int = 10
    val double: Double = 2.2
    println(integer+double.toInt())
    val price: Int = 10_000_000
    println(price)
    val range = 1..10
    for (value in range){
        if (value !== range.last){
            print("$value, ")
        }else{
            print("$value")
        }
    }
    println("""Hallo Teman
        |Aku Kotlin Dasar
    """.trimMargin())
    val daftarAbsen: Array<String> = arrayOf("Joko" , "Santo" , "Mamang")
    for (value in daftarAbsen){
        print(value)
        if (value != daftarAbsen.last()){
            print(", ")
        }else{
            println()
        }
    }
    fun operationMath(operation: String, firstNumber: Int, vararg values: Int): String{
        var total: Double = firstNumber.toDouble()
        for (value in values) {
            when(operation){
                "*" -> total *= value
                "/" -> total /= value
                "+" -> total += value
                "-" -> total -= value
            }
        }
//            if (operation == "*") {
//                total = total * value
//            } else if (operation == "/") {
//                total = total / value
//            } else if (operation == "+") {
//                total = total + value
//            } else if (operation == "-") {
//                total = total - value
//            }
        val totalString: String = total.toString()
        return if(totalString.substring(totalString.lastIndexOf(".")+1) == "0"){
            total.toInt().toString()
        }else{
            total.toString()
        }
    }
    println(operationMath("+", 10,12,12,2,3,4,5,1,2))
    println(operationMath("-", 10,12,12,2,3,4,5,1,2))
    println(operationMath("*", 10,12,12,2,3,4,5,1,2))
    println(operationMath("/", 10,2,2,5))

    var totalIndex = 10
    do {
        if(totalIndex === 5){
            totalIndex--
            continue
        }else if(totalIndex === 2){
            totalIndex--
            break
        }
        println("Pengulangan di Index ke-$totalIndex")
        totalIndex--
    }while (totalIndex > 0)

    fun String.Capital(): String{
        return this.uppercase()
    }

    val hallo = "Hallo Selamat Pagi."

    println(hallo.Capital())

    println("Annas" comppareString "Annas")

    tailrec fun recursiveLoop(value: Int): Long{
        return when(value){
            1 -> 1
            else -> value * recursiveLoop(value-1)
        }
    }

    println(recursiveLoop(20))

    val lengthString: (String) -> Int = {text: String ->
        text.length
    }

    println(lengthString("coba"))

    fun toUpper(value: String): String = value.uppercase()
    val StringToUpper: (String) -> String = ::toUpper
    println(StringToUpper("sulap tulisan menjadi besar"))

    fun helloName (name: String , upCase: (String)-> String = ::toUpper): String{
        var nameAfterUpCase = upCase(name)
        return "Hallo $nameAfterUpCase"
    }

    println(helloName("joko"))
    println(helloName("joko", {name: String -> name.lowercase()}))
    println(helloName("joko santoso" , fun(text: String): String {
        val space: Int = text.lastIndexOf(' ')
        return text.substring(space+1)
    }))

    var age = arrayOf(12,25,23,32,42,12,23,14,24,28,37,16,24)

    println(age.filter { it > 20 })

    var index: Int = 10;

    do {
        println("now index-$index")
        index--
    }while(index >= 0)

    var namaKetuaRt = arrayOf("Joko" , "Santo" , "Irwan" , "Endang")

}