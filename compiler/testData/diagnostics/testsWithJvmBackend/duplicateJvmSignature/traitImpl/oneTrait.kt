// COMPARE_WITH_LIGHT_TREE

interface T {
    fun getX() = 1
}

class C : T {
    <!ACCIDENTAL_OVERRIDE!>val x<!> = 1
}
