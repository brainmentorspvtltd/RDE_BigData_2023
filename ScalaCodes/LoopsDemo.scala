object Demo {
    def main(args: Array[String]): Unit = {
        // var i = 0;
        // for(i <- 1 to 10) {
        //     println("i is : " + i);
        // }

        // for(i <- 1 until 10) {
        //     println("i is : " + i);
        // }

        // var j = 0;
        // for(i <- 1 to 3; j <- 1 to 5) {
        //     println("i is : " + i);
        //     println("j is : " + j);
        // }

        var i = 0;
        var data = List(2,1,5,7,11);
        for(i <- data) {
            println(i);
        }

    }
}