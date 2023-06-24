fun main() {

    val str: String? = "안녕"

//     let -> null 이 아닐때 작동
    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        val def: String? = "def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef가 null 아님")
        }

        1234
    }
    println(result)
}
