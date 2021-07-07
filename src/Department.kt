



    fun main(args: Array<String>) {


        homeDisplay()
        var options: Int = Integer.valueOf(readLine())
        while (options != 4){
            if(options == 1){
                staffDisplay()
                var staffs = Staffs()
                staffs.staffType()
                break
            }else if (options == 2){

            }else if (options == 3){

            }else {
                try {
                    options
                }catch (e: NumberFormatException){
                    println("Input a number")
                }
                wrongOpt()
                staffDisplay()
            }

            options = Integer.valueOf(readLine())

        }

        bye()

    }

    fun wrongOpt(){
        println("Wrong Input! Enter numbers within options")
    }

    fun bye(){
        println("Have a nice day. Goodbye")
    }
    fun staffDisplay(){
        println("Type of Staff :\n1. Principal\n2. Teachers\n3. Non-Academic Staff\n4. Back")
    }
    fun homeDisplay(){
        println("Hi, welcome to Excel group of schools. Log in as :\n1. Staff\n2. Student\n3. Applicant\n4. Exit")

    }

    fun options(word: String){
        var word = Integer.valueOf(readLine())
    }