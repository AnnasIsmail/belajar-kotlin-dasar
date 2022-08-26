import java.util.StringJoiner

fun identify(firstName: String, lastName: String = ""): Unit{
    println("Hello $firstName $lastName");
}

fun sum (a: Int = 0, b: Int = 0):Int{ return a + b }

fun minus (a: Int = 0, b: Int = 0):Int = a - b

fun sumV2 (a: Int = 0, vararg b: Int ):Int{
    var total = a
    for (value in b){
        total += value
    }
    return total
}

fun String.hello(): String{
    return "Hello $this"
}

infix fun String.changeWord(type: String): String{
    return if(type.lowercase() == "up"){
        this.uppercase()
    }else{
        this.lowercase()
    }
}

fun main() {
    identify("Ammas")
    identify(lastName = "Ammas", firstName = "Ismail Muhammad")

    println(sum(12, 8))
    println(sum(12))

    println(minus(12, 8))
    println(minus(12))

    println(sumV2(12, 8 , 10, 20, 250))

    val name: String = "Joko"
    println(name.hello())
    println(name changeWord "Up")

    fun scopeFunction(){
        val name = "Andre"
        println(name)
    }

    scopeFunction()
}
