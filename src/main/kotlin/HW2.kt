import java.lang.StringBuilder
import java.util.*

fun  isPalindrome (inputString : String) : Boolean{
    val sb = StringBuilder(inputString)
    val reverseString = sb.reverse().toString()
    return inputString.equals(reverseString)
}
    fun main() {

        var Palindrome = "asddsa"
        if (isPalindrome(Palindrome)) {
            println(true)
        } else {
            println(false)
        }
    }
