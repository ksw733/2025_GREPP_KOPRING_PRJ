package io.ksw.S05

fun main() {



    ambiguousReturn()

}

fun nestedLoopTest() {
    for (i in 1..3) {
        for (j in 1..3) {
            println("i=$i, j=$j")
            if (j == 2) break
        }
    }
}

fun returnTest() {
    listOf(1, 2, 3, 4).forEach label@{
        if (it == 3) return@label
        println("숫자: $it")
    }
    println("test")
}

fun labeledBreakTest() {
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            println("i=$i, j=$j")
            if (j == 2) break@outer // 바깥 루프 종료
        }
    }
}

fun ambiguousReturn() {
    val result = run {
        listOf(1, 2, 3).forEach {
            if (it == 2) return@forEach  // 이건 OK
            println(it)
        }
        "끝!"
    }
    println(result)
}
