import java.lang.StringBuilder
import java.util.*

fun  isPalindrome (inputString : String) : Boolean{
    val sb = StringBuilder(inputString)
    val reverseString = sb.reverse().toString()
    return inputString.equals(reverseString)
}
    fun main() {

        var Palindrome = "asddsa"
        var nonPalindrome = "sdkqwe"
        if (isPalindrome(Palindrome)) {
            println("$Palindrome is a Palindrome String")
        } else {
            println("$nonPalindrome is not a Palindrome String")
        }
    }