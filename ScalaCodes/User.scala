object User {
    def main(args: Array[String]) = {
        var x = 12;
        var y = 34;

        // var y:Int = 10;
        // var name:String = "Ram";

        // Immutable variable
        // val lastName:String = "Sharma";

        // Multiple assignments
        val (var_1: Int, var_2: String) = Pair(101, "John");
        val (var_1, var_2) = Pair(101, "John");

        println("Hello Using Scala...");
        println("Sum is " + (x + y));
    }
}