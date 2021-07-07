open class Principal(){
    var name:String = ""
    var age:Int = 0
    companion object {
         fun getStaffData() {
            val principal1 = Principal()
            println("Enter your Name")
            val principalName = readLine()
            if (principalName != null) {
                principal1.name = principalName
            }
            println("Enter your Age")
            val principalAge = Integer.valueOf(readLine())
            principal1.age = principalAge

            println("Principal's name is ${principal1.name} and is ${principal1.age} years old")
        }
    }
}