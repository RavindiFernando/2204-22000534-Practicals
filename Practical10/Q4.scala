class UserAccount(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, to: UserAccount): Unit = {
    withdraw(amount)
    to.deposit(amount)
  }

  def getBalance: Double = balance

  override def toString: String = s"Account(balance: $balance)"
}

object FinancialInstitution {
  def accountsWithNegativeBalances(accounts: List[(String, UserAccount)]): List[(String, Double)] = {
    accounts.filter(_._2.getBalance < 0).map { case (name, acc) => (name, acc.getBalance) }
  }

  def totalBalance(accounts: List[UserAccount]): Double = {
    accounts.map(_.getBalance).sum
  }

  def adjustedBalances(accounts: List[(String, UserAccount)]): List[(String, Double)] = {
    accounts.map { case (name, acc) =>
      val balance = acc.getBalance
      val adjustedBalance = if (balance > 0) {
        balance * 1.05  
      } else {
        balance * 0.90  
      }
      (name, adjustedBalance)
    }
  }
}

object FinancialInstitutionMain extends App {
  val userAcc1 = new UserAccount(1000)
  val userAcc2 = new UserAccount(-200)
  val userAcc3 = new UserAccount(300)
  
  val allAccounts = List(
    ("Account1", userAcc1), 
    ("Account2", userAcc2), 
    ("Account3", userAcc3)
  )

  println("Accounts with negative balances:")
  FinancialInstitution.accountsWithNegativeBalances(allAccounts).foreach { case (name, balance) =>
    println(s"$name: $balance")
  }

  println(s"\nTotal balance of all accounts: ${FinancialInstitution.totalBalance(allAccounts.map(_._2))}")

  println("\nAdjusted balances after interest:")
  FinancialInstitution.adjustedBalances(allAccounts).foreach { case (name, adjustedBalance) =>
    println(s"$name: $adjustedBalance")
  }
}
