import scala.collection.mutable.ArrayBuffer

@main def main(): Unit =
  println(bubbleSort(buf))

var buf = ArrayBuffer (
  133, 44, 455435, 123423, 123, 55, 6, 1230,
  10, 1, 300, 405, 4545, 123, 34346, 99999, 1002,
  10230, 399, 999, 9, 55, 934, 1, 2, 4, 34, 435, 34,
  123, 88, 345, 6576, 3111, 4, 7, 676, 83, 676767, 33,
  11, 987, 8, 1, 23, 45, 12, 5, 0, 991191, 8884465, 99586,
  7475745, 8384, 999134, 945941, -123, -1943, -999,
  -10, -345, -92
)

def bubbleSort(b: ArrayBuffer[Int]): ArrayBuffer[Int] =

  var count = 0
  for i <- Range(0, b.length - 1) do
    var swapped = false
    count += 1
    for j <- Range(0, b.length - i - 1) do
      
      if b(j) > b(j+1) then
        var temp = b(j+1)
        b(j+1) = b(j)
        b(j) = temp
      end if

    if swapped == true then
      b
    end if

  println("Interation: " + count)
  b

    
  




