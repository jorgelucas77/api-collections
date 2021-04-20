package one.digitainnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 500.0, "CLT")
    val maria = Funcionario("Maria", 3500.0, "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion =funcionarios1.union(funcionarios2)
    resultUnion.forEach {  println(it) }

    println("------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract =funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {  println(it) }

    println("------------------")
    val resultIntersect =funcionarios3.intersect(funcionarios2)
    resultSubtract.forEach {  println(it) }
}