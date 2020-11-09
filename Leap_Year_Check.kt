import java.util.*

fun main(args:Array<String>){
    println("Enter the year")
    val scan=Scanner(System.`in`)
var year=scan.nextInt()
 if(check(year)){
     print("Leap Year")
 }
    else{
     print("Not Leap year")
 }
}
fun check(a:Int): Boolean {
    var  bo=false;
    if(a%400==0){
        return true
    }
    if(a%4==0){
        return true
    }
    if(a%100==0){
        return true
    }
    return false
}