object factorial{

  def gcd(a: Int, b: Int): Int = {
    if(b == 0) a
    else gcd(b, a%b)
  }

  def factorialNoTailRec(n:Int): Int = {
    if(n == 1) 1
    else n * factorialNoTailRec(n - 1)
  }

  def factorial(n: Int): Int = {
    def loop(acc: Int, n:Int): Int =
      if(n == 0) acc
      else loop(acc * n, n-1)
    loop(1, n)
  }

  gcd(14, 7)
  factorialNoTailRec(4)
  factorial(4)
}