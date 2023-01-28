package bookAndW3School

fun main(){

    //Kotlin Ranges
    //With the for loop, you can also create ranges of values with "..":
    // Examples with strings

    for(char in 'a'..'z'){
        print(char)
        print(",")
    }

    println()

    // for numbers yet
    for(n1 in 5..10){
        print(n1)
        print(",")
    }

    println()

    // Use break
    for(nums in 5..15){
        if(nums == 10){
            break
        }
        println("Numbers in nums " + nums)
    }

    // Use Continue
    for(nums2 in 5..15){
        if(nums2 == 10){
            continue
        }
        println("Numbers in nums " + nums2)
    }




}