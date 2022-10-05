fun main(args: Array<String>) {
    var numbs = arrayOf(100,2,3000,4,52,6)
    println(summer(numbs))

}
///დაწერეთ ფუნქცია, რომელიც პარამეტრად მიიღებს მთელი რიცხვების მასივს და დააბრუნებს
//მთელ მნიშვნელობას.ფუნქციამ უნდა გამოთვალოს მასივში ლუწ ინდექსზე მდგომი რიცხვების
//საშუალო არითმეტიკული.
//მოიყვანეთ ფუნქციის გამოყენების მაგალითი.
fun summer(args: Array<Int>): Int {
    var evenSum = 0;
    var index = 0;
    while(index<args.size) {
       evenSum = evenSum + args[index]
               index += 2
    }
    return evenSum
}
