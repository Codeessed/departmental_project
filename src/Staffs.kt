 class Staffs {
    var staffOptions = Integer.valueOf(readLine())

    fun staffType(){
        if(staffOptions != 4 ){
            if (staffOptions == 1){
                var principal = Principal()
                principal.getStaffData()
            }else if(staffOptions == 2){
                var principal = Principal()
                principal.getStaffData()
            }else if(staffOptions == 3){

            }else{
                wrongOpt()
                staffOptions = Integer.valueOf(readLine())
            }

        }
    }
}