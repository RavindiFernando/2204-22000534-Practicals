class Account(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, to: Account): Unit = {
    withdraw(amount)
    to.deposit(amount)
  }

  def getBalance: Double = balance
}

object AccountMain extends App {
  val acc1 = new Account(1000)
  val acc2 = new Account(500)
  acc1.transfer(200, acc2)
  println(s"Account 1 balance: ${acc1.getBalance}")  
  println(s"Account 2 balance: ${acc2.getBalance}")  
}
