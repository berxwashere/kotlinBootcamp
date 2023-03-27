package com.example.kotlindersler.nesne_tabanli_programlama.homework2

class homework {

    fun celciusToFahrenheit(degree:Int) {
        val celsius = ((degree-32)*5)/9
        println("Celsius degree: $celsius")
    }

    fun perimeterCalculator(firstSide:Int,secondSide:Int) {
        val perimeter = firstSide*secondSide
        println("Perimeter of this rectangle: $perimeter")
    }

    fun factorialCalculator(number:Int) {
        var factorial = 1
        for (i in 1..number) {
            factorial = factorial*i
        }
        println("Factorial of this number: $factorial")
    }

    fun aLetter(word:String) {
        var counter = 0
        for (i in word) {
            if (i == 'a' ) { //  or --|| 'A'-- neden olmadı? öğren.
                counter++
            }
        }
        for (i in word) {
            if (i == 'A' ) { //  or --|| 'A'-- neden olmadı? öğren.
                counter++
            }
        }
        println("Usage of letter a: $counter")
    }

    fun interiorAngleCalculator(sidesAmount:Int) {
        var interiorAngles = (sidesAmount-2)*180
        println("Sum of interior angles: $interiorAngles")
    }

    fun salaryCalculator(days:Int) {
        val hours = days*8
        var sumOfShift = hours - 160
        var salary = 0
        if (hours>160) {
            salary = (160*10)+(sumOfShift*20)
        }else{
            salary = hours*10
        }
        println("Salary is: $salary")
    }

    fun quotaPriceCalculator(quotaAmount:Int) {
        var quotaPrice = 0
        if(quotaAmount>50) {
            quotaPrice = 100+((quotaAmount-50)*4)
        }else{
            quotaPrice = 100
        }
        println("Quota price is: $quotaPrice")
    }

}