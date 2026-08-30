//Bai 11: for loop

fun main(args: Array<String>) {
    var tong = 0
    for (i in 1..100 step 2) {
        tong += i
    }
    println("Tong la $tong")

    var luyThua = 1
    for (i in 1 until 5) {
        luyThua *= i
    }
    println("Luu thua: $luyThua")
}