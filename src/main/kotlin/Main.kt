fun main(args: Array<String>) {
    var newsalary: Double
    println("THE SALARY OF EMPLYES :")
    println("enter the salary for employee to calculate  new salary: ")
     var  salary = readLine()!! .toDouble()
    println("ENTER THE PREFORMANCE RATING :")
    println("1-Excellent ")
    println("2- Good ")
    println("3-Poor ")
    var pre = readLine()!!.toInt()
    println("the nwe salary for employee ")

    if (pre == 1)
    {  newsalary =  (salary *0.06) + salary
        println("$newsalary") }
     if (pre == 2){newsalary =  (salary *0.04) + salary
        println("$newsalary")}
     if (pre == 3){newsalary = (salary *0.015)+ salary
         println("$newsalary")}

}
