object Demo {
    def main(args: Array[String]): Unit = {
        var x = 12;
        if(x % 2 == 0) {
            println("Number is even")
        }
        else if(x % 2 != 0) {
            println("Number is odd")
        }
        else {
            println("Number is invalid...")
        }
    }
}