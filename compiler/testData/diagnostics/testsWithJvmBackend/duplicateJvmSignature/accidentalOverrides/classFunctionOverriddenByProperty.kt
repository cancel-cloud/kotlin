// COMPARE_WITH_LIGHT_TREE

open class B {
    fun getX() = 1
}

class C : B() {
    val x: Int
        <!ACCIDENTAL_OVERRIDE!>get()<!> = 1
}
