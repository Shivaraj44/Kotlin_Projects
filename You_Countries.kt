import java.util.*

fun main(args :Array<String>){
    val scan =Scanner(System.`in`)
    println("Enter the size")
    val size=scan.nextInt();
    println("Enter the Array Elements")
    var country= mutableListOf<String>();
    for(i in 1..size){
        country.add(scan.next());
    }
    println("Enter the Country to search")
    val search=scan.next();
    country.forEachIndexed { index, country1 ->
        if(country1.contains(search)){
            println("$country1 $index")
        }


    }
}