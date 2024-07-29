object InventoryManagement {

  def main(args: Array[String]): Unit = {
    val inventory1 = Map(
      101 -> ("Pen", 10, 20.5),
      102 -> ("Book", 20, 100.0),
      103 -> ("Pencil", 30, 12.75)
    )

    val inventory2 = Map(
      101 -> ("Pen", 30, 18.5),
      104 -> ("Eraser", 10, 20.0)
    )

    // I
    val productNames = inventory1.values.map(_._1).toList
    println(s"I. Product names: $productNames")

    // II
    val totalValue = inventory1.values.map { case (_, quantity, price) => quantity * price }.sum
    println(s"II. Total value of all products: $totalValue")

    // III
    val isEmpty = inventory1.isEmpty
    println(s"III. Is inventory1 empty? $isEmpty")

    // IV
    val mergedInventory = (inventory1.keySet ++ inventory2.keySet).map { id =>
      val (name1, qty1, price1) = inventory1.getOrElse(id, ("", 0, 0.0))
      val (name2, qty2, price2) = inventory2.getOrElse(id, ("", 0, 0.0))
      val name = if (name1.nonEmpty) name1 else name2
      val quantity = qty1 + qty2
      val price = math.max(price1, price2)
      id -> (name, quantity, price)
    }.toMap

    println(s"IV. Merged Inventory: $mergedInventory")

    // V
    val productIdToCheck = 102
    inventory1.get(productIdToCheck) match {
      case Some((name, quantity, price)) =>
        println(s"V. Product exists. Product ID: $productIdToCheck, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"V. Product with ID $productIdToCheck does not exist.")
    }
  }
}
