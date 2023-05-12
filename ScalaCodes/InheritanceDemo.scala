class Account(val acc_no:Int) {
    def withdraw() = {
        println("This is withdraw method of Account Class...");
        println("Withdraw limit is 50000...");
    }
    def deposit() = {
        println("This is deposit method of Account Class...");
    }
}

class SavingAccount(override val acc_no:Int, balance:Int) extends Account(acc_no) {
    override def withdraw() = {
        println("This is withdraw method of SavingAccount Class...");
        println("Withdraw limit is 1Lac...");
    }
    def roi() = {
        println("ROI is 7.5%");
    }
}

class CurrentAccount(override val acc_no:Int, balance:Int) extends Account(acc_no) {
    override def deposit() = {
        println("Deposit Limit is 50000...");
    }
}

object Demo {
    def main(args: Array[String]): Unit = {
        val obj = new SavingAccount(121212, 50000);
        obj.withdraw(); // will call child class withdraw
        obj.deposit();  // will call parent class deposit
        obj.roi();      // will call child class roi

        val ca = new CurrentAccount(121212, 50000);
        ca.withdraw();  // will call parent class withdraw
        ca.deposit();   // will call child class deposi
    }
}