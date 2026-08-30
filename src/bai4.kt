// Bài 4: Ép kiểu

fun main(args: Array<String>) {
    var a = 10
    var b = a.toLong()

    println(a::class.java.typeName)
    println(b::class.java.typeName)

    var str1 = "1"
    var c = str1.toInt()
    var d = str1.toBoolean()
    println("$c , $d")
}