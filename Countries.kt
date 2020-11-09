import java.util.*

fun main(args:Array<String>){
val scan =Scanner(System.`in`)
    val country= mutableListOf<String>()

println("Enter the size")
    val size=scan.nextInt();

    println("Enter the list of contries")

    for(i in 0..size){
        country.add(scan.next())
    }
    println("Enter the search element")
    val search=scan.next();
    country.forEachIndexed{index,country ->

        if(country.contains(search)){
           println("Found")
            // print("found $country at   $index    position")
        }
        else{
            print("Not Found")
        }
    }



}