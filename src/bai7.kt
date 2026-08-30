// Bai 7

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

    var x = readln().toIntOrNull();
    if (x != null) {
        when (x % 2) {
            1 -> print("x la so le")
            0 -> print("x la so chan")
        }
    } else {
        print("nhap loi")
    }
}