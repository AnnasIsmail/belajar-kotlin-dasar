fun main(){
    val a = 25
    val b = 150

    println(a > b)
    println(a >= b)
    println(a == b)

    val c = true
    val d = false

    println(c && d)
    println(c || d)

    if( c || d){
        println("masuk pak")
    }

    when (a){
        200 -> println("bagus pak")
        100 -> println("lumayan pak")
        50 -> println("kurang pak")
        25 -> {
            println("gini juga bisa")
        }
    }

    val nilai = "C"
    val cobaArray: Array<String> = arrayOf("A" ,"B")

    when (nilai){
        in cobaArray -> println("Lulus Anda!")
        !in cobaArray -> println("Tidak Lulus Anda!")
    }

    when (nilai){
        is String -> println("nilai is string")
        !is String -> println("nilai not string")
    }

    val nameArray: Array<String> = arrayOf("Ammas" , "Ismail" , "Muhammad")

    for(name in nameArray){
        print(name + " ")
    }

    val range = 5..100 step 5

    for(value in range){
        if(value !== range.last){
            print("${value}, ")
        }else{
            print(value)
        }
    }

    var i = 0;
    var v = 10

    println()

    while(i <= v){
        i++

        if(i === 3){
            continue
        }

        print("${i}, ")

        if(i === 8){
            break
        }
    }

    do{
        print("${i}, ")
    } while(i === v)

    println()
    coba("masuk Pak")
}

fun coba(text: String){
    println(text)
}