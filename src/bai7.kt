// Bai 7 - 9: If-else

fun main(args: Array<String>) {
    print("Nhap diem: ")
    var score = readln().toFloatOrNull();
    if (score == null) {
        println("Loi nhap diem")
    } else if (score > 7) {
        println("Pass")
    } else {
        println("Tach")
    }

    var a = 10
    var b = 11
    var max = if (a > b) a else b
    println(max)
}