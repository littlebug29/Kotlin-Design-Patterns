package patterns.creation

interface Product
interface ProductCreator {
    fun create(): Product
}

class ConcreteProduct : Product
class ConcreteProductCreator : ProductCreator {
    override fun create(): Product = ConcreteProduct()
}

class Client(private val creator: ProductCreator) {
    fun doSomething() {
        val product = creator.create()
        println(product)
    }
}

fun main() {
    val client = Client(ConcreteProductCreator())
    client.doSomething()
}