fun fibonacci(n: Int): Int {
    var fib = 0
    repeat(n) {
        fib = if (it < 2) 1 else fib + (fib - it + 1)
    }
    return fib
}

fun main() {
    val n = 10
    println("Fibonacci($n) = ${fibonacci(n)}")
}
