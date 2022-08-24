const val NAME: String = "Annas"

fun main(args: Array<String>) {

    var angka: Int = 1_0_0;
    println(angka)

    var string: String? ="""ahahah
        |kocak anda
    """.trimMargin()

    println(string?.length)

//    var stringTemplate: String = "annas uang saya sisa: ${angka}"
//    stringTemplate = "annas uang saya hanya: ${angka}"
    val stringTemplate: String = "annas uang saya sisa: ${angka}"
    println(stringTemplate)
    println(NAME)

    val cobaArray: Array<String> = arrayOf("Ammas" , "Ismail" , "Muhammad")

    println("${ cobaArray[0] } ${cobaArray[1]} ${cobaArray.get(2)}")
    cobaArray.set(2 , " ")
    println("${ cobaArray[0] } ${cobaArray[1]} ${cobaArray[2]}")

    val arrayBolehNull: Array<String?> = arrayOfNulls(3);
    arrayBolehNull[0] = "Annas"
    println("${arrayBolehNull[0] } ${arrayBolehNull[1]} ${arrayBolehNull[2]}")

//    val range = 0..100
    val range = 100 downTo 1 step 5

    println(range.count())
    println(range.contains(20))
    println(range.first)
    println(range.last)
    println(range.step)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}