class Teachers(): Principal() {
  override fun getStaffData(){
     val teacher1 = Principal()
     println("Enter your Name")
     val teacherName = readLine()
     if (teacherName != null) {
      teacher1.name = teacherName
     }
     println("Enter your Age")
     val teacherAge = Integer.valueOf(readLine())
     teacher1.age = teacherAge

     println("Teacher's name is ${teacher1.name} and is ${teacher1.age} years old")
  }
}