//Bai 10: When

fun main(args: Array<String>) {
    print("kiem tra so chan/le:")
    var x = readln().toIntOrNull()
    if (x != null) {
        when (x % 2) {
            1 -> println("x la so le")
            0 -> println("x la so chan")
            else -> println("x <0")
        }
    } else {
        println("nhap loi")
    }


    print("nhap thang: ")
    var y = readln().toIntOrNull()
    if (y != null) {
        when (y) {
            1, 2, 3 -> print("Quy 1")
            4, 5, 6 -> print("Quy 2")
            6, 7, 8 -> print("Quy 3")
            10, 11, 12 -> print("Quy 4")
            else -> print("nhap loi")
        }
    }

    var thuNhap = 0
    print("nhap thu nhap / thang: ")
    var thuNhapThang = readln().toIntOrNull()
    if (thuNhap != null) {
        when (thuNhap) {
            in 1..3 -> print("ngheo")
            in 4..7 -> print("binh thuong")
            in 8..10 -> print("on")
            in 11..15 -> print("giau")
            else -> print("nhap loi")
        }
    }

    var a = 101
    var check = when (a) {
        in 0..100 -> false
        else -> true
    }
    println(check)


    var b = 99
    when {
        b % 2 == 0 -> println("b la so chan")
        b % 2 != 0 -> println("b la so le")
    }

}