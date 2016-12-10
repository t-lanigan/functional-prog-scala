object playground {

  /**
    * Returns if the string contains balanced
    * brackets ()
     */
  def balance(chars: List[Char]): Boolean = {
    def helper(open: Int, chars: List[Char]): Boolean =
      if (chars.isEmpty) open == 0
      else if (chars.head == '(') helper(open+1, chars.tail)
      else if (chars.head == ')') helper(open-1, chars.tail)
      else helper(open, chars.tail)
    helper(0, chars)
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins.isEmpty) 0
    else if (money - coins.head == 0) 1
    else if (money - coins.head < 0) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }

  countChange(10,List(1,2))
}