fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    var a : String? = null
    println(a?.length)

    var b: Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자
    val c = a?.length ?: 0
    println(c)

    val nullableStr = getNullStr()
    val nullableStrLength = nullableStr?.length ?: "null".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

//    throw NullPointerException()

    val d: String? = null

//    개발자가 null 일수 없다고 표현하는것
    val e = d!!.length

}