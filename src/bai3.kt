/*
    Bai 3: Biến
    Là tên vùng nhớ, lưu trữ dữ liệu
    2 loại: var và val
        var: Cho phép thay đổi giá trị
        val(hằng): Không có phép thay đổi giá tr
    Khai báo/Khởi tạo:
        var a:Int = 1
        var b:Double
    In biến:
        println("a = $a")
 */
fun main(args: Array<String>) {
    var a: Int = 1
    var d = 100L //Long

    var b = 0.2f //Float
    var c = 0.2 //Double

    var kyTu = 'x' //Char
    var str1 = "Xin chào"
    var str2 = """
        |Xin
        |chào
    """

    var check = true

    var arrayInt = intArrayOf(1, 2, 3, 4, 5)
    var arrayFloat = floatArrayOf(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f)

    val Pi = 3.1415925f

    println("Giá trị a là: $a")
    println("Kiểu b là " + b::class.java.typeName)
    println("Giá trị b là: " + b)

    println(str2)
}

