fun main() {

    //part1

//Create a list of 3 elements

    val citysList = mutableListOf("Riyadh","Makkah","Paris")

//add more 2 elements

    citysList.add(3, "New York")
    citysList.add(4, "Madrid")

//update last element

    citysList[citysList.size-1]= "Vienna"

//print the whole list with the numbers

    for (index in 0 until citysList.size) {
        println("$index - ${ citysList[index] }")
        }

    println("---------------------")


    //part2

//Create a list of integer with 5 elements

    val listOfintegers = mutableListOf(1,2,3,4,5)

//update the 3th element to 12

    listOfintegers[2] = 12

//check if the 12 if existing delete the element

    listOfintegers.removeAll({ it == 12 })

//print the list

    println(listOfintegers)

}



