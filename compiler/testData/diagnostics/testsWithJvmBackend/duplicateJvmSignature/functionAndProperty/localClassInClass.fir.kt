// COMPARE_WITH_LIGHT_TREE

class Outer {
    fun foo() {
        class C {
            <!CONFLICTING_JVM_DECLARATIONS{LT}!><!CONFLICTING_JVM_DECLARATIONS{PSI}!>val x<!> = 1<!>
            <!CONFLICTING_JVM_DECLARATIONS{LT}!><!CONFLICTING_JVM_DECLARATIONS{PSI}!>fun getX()<!> = 1<!>
        }
    }
}
