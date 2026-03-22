val arr = Vector.range(1, 9999999)

def binarySearch(list: Vector[Int], n: Int): Int =
  var low: Int = 0
  var high: Int = list.length - 1
  var count: Int = 0

  while low <= high do
    var half: Int = low + (high - low) / 2

    count += 1

    if list(half) == n then
      println("Iteration: " + count)
      return half
    end if

    if list(half) > n then
      high = half
    end if

    if list(half) < n then
      low = half
    end if
      
  return -1

@main
def hello = 
  val n = 10543
  println("Number "+ n + " is at: " + binarySearch(arr, n))
