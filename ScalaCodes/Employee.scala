class Employee(id:Int, name:String) {
    var _id = id;
    var _name = name;

    def show(salary:Int, address:String) = {
        println("Name is : " + _name)
        println("Salary is : " + salary)
        println("Address is : " + address)
    }
}

object Caller {
   def main(args: Array[String]): Unit = {
        val obj = new Employee(101, "John");
        obj.show(45000, "Delhi");
   }
}