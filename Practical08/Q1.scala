import scala.io.StdIn._

object CaesarCipher {

  def encrypt(text: String, shift: Int): String = {
    text.map { c =>
      if (c.isLetter) {
        val offset = if (c.isLower) 'a' else 'A'
        ((c - offset + shift) % 26 + offset).toChar
      } else {
        c
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)  
  }
  
  def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
    func(text, shift)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the text to be processed: ")
    val text = readLine()

    print("Enter the shift value: ")
    val shift = readInt()

    print("Choose an operation (1 for Encryption, 2 for Decryption): ")
    val choice = readInt()

    val result = choice match {
      case 1 => cipher(text, shift, encrypt)
      case 2 => cipher(text, shift, decrypt)
      case _ => "Invalid choice!"
    }

    println(s"Result: $result")
  }
}
