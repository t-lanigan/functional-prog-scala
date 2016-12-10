package recfun

object Main {
  def main(args: Array[String]) {
    println("running main...")
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
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def helper(open: Int, chars: List[Char]): Boolean =
      if (chars.isEmpty) open == 0
      else if (chars.head == ')') helper(open - 1, chars.tail) && open>0
      else if (chars.head == '(') helper(open + 1, chars.tail)
      else helper(open, chars.tail)
    helper(0, chars)
  }
  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def helper(money: Int, coins: List[Int]) : Int = {
      if (coins.isEmpty) 0
      else if (money - coins.head < 0) 0
      else if (money - coins.head == 0) 1
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
    helper(money, coins.sorted)
  }
}

