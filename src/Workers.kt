abstract class Workers(name: String, age: Int) {
    init {
        println("$name is a staff at Excel group of schools. ")
    }
    constructor(name: String, age: Int, staff_type: String, id: Int): this(name, age){

    }
}