package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (r == c || c == 0) 1
      else pascal(c, r - 1) + pascal(c - 1, r - 1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanced(chars: List[Char], currentBalance: Int) : Boolean = {
        if(chars.isEmpty) currentBalance == 0
        else if(chars.head == ')' && currentBalance == 0) false
        else if(chars.head == '(') balanced(chars.tail, currentBalance + 1)
        else balanced(chars.tail, currentBalance)
      }

      balanced(chars, 0)
    }

  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
}
