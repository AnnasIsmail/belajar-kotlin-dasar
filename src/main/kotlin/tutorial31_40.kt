import com.belajar.packageCoba.sayHelloFunc

fun factorialLoop(value: Int):Int{
    var result = 1
    for (i in value downTo 1){
        result *= i
    }
    return result
}

fun factorialRecursive(value: Int): Int{
    return when (value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

tailrec fun display(value: Int){
    println("Value: $value")
    if(value > 0){
        display(value - 1)
    }
}

tailrec fun factorialRecursiveDisplay(value: Int, total: Int = 1 ): Int{
    return when (value){
        1 -> total
        else -> factorialRecursiveDisplay(value - 1, total *  value)
    }
}

fun toUpper(text: String): String{
    return text.uppercase()
}

inline fun inlineFunc(
    name: () -> String,
    secondName: () -> String
): String {
    return "Hello Nama Saya ${name()} ${secondName()}"
}
fun main(args: Array<String>) {

    println(factorialLoop(10))
    println(factorialRecursive(10))
    display(10)
    println(factorialRecursiveDisplay(10))

    val exampleLambda: (String , String) -> String = { FirstName: String, LastName: String ->
        val res = "Terima Kasih Mas $FirstName $LastName"
        res
    }

    val exampleLambda2: (Int) -> String = {
        "Anda Berumur $it"
    }

    val exampleLambda3: (String) -> String = ::toUpper

    println(exampleLambda(exampleLambda3("Annas") , "Ismail") + " " + exampleLambda2(21))

    //Higher Order Function

    fun hello(name: String, trans: (String)-> String): String{
        val nameAfterTrans = trans(name)
        return "Hello $nameAfterTrans"
    }

    val lamdaUpper = {value: String -> value.uppercase()}
    println(hello("Annas" , lamdaUpper))

    println(hello("Annas" , {value: String -> value.lowercase()}))
    println(hello("Annas" ) {value: String ->
        value.lowercase()
    })

    val anonFunc = fun(text: String): String {
        val space: Int = text.lastIndexOf(' ')
        return text.substring(0, space)
    }

    println(hello("Annas Ismail Muhammad" , anonFunc))

    var index: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Index ke-$index")
        index++
    }

    lambdaIncrement()

    println(inlineFunc({ "Annas" } , { "Ismail" }) )

    fun printStar(range: Int , sort: String , continueIndex: Int = 0){
        if(sort == "asc"){
            LoopI@ for( i in 0..range){
                LoopJ@ for( j in 0..i){
                    print("*")
                    if(continueIndex > 0){
                        if(j == continueIndex){
                            println()
                            continue@LoopI
                        }
                    }
                }
                println()
            }
        }else if(sort == "desc"){
            LoopI@ for( i in 0..range){
                val rangeMin = range-i
                LoopJ@ for( j in 0..rangeMin){
                    print("*")
                    if(continueIndex > 0){
                        if(j == continueIndex){
                            println()
                            continue@LoopI
                        }
                    }
                }
                println()
            }
        }
    }

    printStar(10 , "asc")
    printStar(10 , "desc")

    printStar(10 , "asc" , 5)
    printStar(10 , "desc" , 5)

    sayHelloFunc("Annas")

    for (value in args){
        print("$value ")
    }
}