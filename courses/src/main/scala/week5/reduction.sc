def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())( (a, b) => f(a) :: b )

def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)( (a, b) => b + 1)



lengthFun(List(3, 4, 5, 6))
mapFun(List(3, 4, 5, 6), (x => 1)) // Couldn't find how to try it out