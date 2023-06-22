
fun main() {

    try {
        throw Exception()
    } catch (e: Exception) {
        println("예외 발생")
    } finally {
        println("finally 실행!!!")
    }

    val a = try {
        "1234".toInt();
    } catch (e: Exception) {
        println("예외 발생")
        10
    }
    println(a)

//    throw Exception("예외 발생")

    val b: String? = null

//    이렇게 throw 처리를 하면 ? 를 사용할 필요가 없다. null 일수가 없기때문에....
    val c: String = b ?: failFast("a is null")
    println(c.length)

//    failFast("예외 발생")


}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}