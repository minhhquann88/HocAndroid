// Bài 5,6: Phép toán, Toán tử gán, So sánh

/*
    So sánh:
        == : a.equals(b)
        != : !a.equals(b)
        > : a.compareTo(b) > 0
 */

fun main(args: Array<String>) {
    var a = 10
    var b = 3
    var c = a.toFloat() / b
    println(c)
    println(-a)


    a += 2
    println(a)

    var b2 = b.toFloat()
    b2 /= 2
    println(b2)
}