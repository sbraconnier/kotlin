/*
 * KOTLIN DIAGNOSTICS SPEC TEST (POSITIVE)
 *
 * SECTIONS: when-expression
 * PARAGRAPH: 2
 * SENTENCE: [3] When expression has two different forms: with bound value and without it.
 * NUMBER: 1
 * DESCRIPTION: Empty 'when' with bound value.
 */

// TESTCASE NUMBER: 1
fun case_1(value_1: Int) {
    when (<!UNUSED_EXPRESSION!>value_1<!>) {}
}
