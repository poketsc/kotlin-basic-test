fun main() {

    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }

    println(result)

//    else 생략 가능
    when(getColor()) {
        Color.RED -> print("red")
        Color.GREEN -> println("green")
    }

    when (getNumber()) {
        0,1 -> print("0 또는 1")
        else -> print("0 또는 1이 아님")
    }

}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2
