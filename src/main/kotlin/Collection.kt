import java.util.LinkedList

fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원")


    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutable set
    val numberSet = setOf(1,2,3,4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2

    // 컬렉션 빌더 (내부에서는 mutable 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("--------------------")

    for (currency in currencyList) {
        println(currency)
    }

    println("--------------------")

    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    val lowerList = listOf<String>("a","b","c")
    val upperList = mutableListOf<String>()

    for (lower in lowerList) {
        upperList.add(lower.uppercase())
    }

    println(upperList)

    val upperList2 = lowerList.map { it.uppercase() }
    println(upperList2)

    val filteredList = mutableListOf<String>()
    for (upperCase in upperList2) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }

    println(filteredList)

    val filteredList2 = upperList2.filter { it == "A" || it == "B" }
    println(filteredList2)

}