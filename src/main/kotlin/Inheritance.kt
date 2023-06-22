open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(override var age: Int = 0) : Dog() {
//    final로 설정하면 Bulldog 을 상속받은 클래스에서 bark() 함수 재정의 불가
    final override fun bark() {
        super.bark()
    }

}

abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int) : Developer() {
    override fun code(language: String) {
        println("code! $language")
    }
}

fun main() {

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")

    val dog = Bulldog(age=2)
    println(dog.age)
    dog.bark()

}