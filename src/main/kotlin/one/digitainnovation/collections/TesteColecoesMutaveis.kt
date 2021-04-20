package one.digitainnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 500.0, "CLT")
    val maria = Funcionario("Maria", 3500.0, "PJ")

    println("------LIST------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-----SET-------")
    val funcionariosSet = mutableSetOf(joao)
   // funcionariosSet.forEach { println(it) }

    println("------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}