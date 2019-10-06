/**
  *
  * Bubble sort implemented in a functional way i.e. Scala Style.
  * Scala encourages to implement solutions in recursive way.
  * It also gives flexibility of implementing solution in iterative way,
  * but pure scala style is in functional way.
  *
  */
object BubbleSort {

  def bubbleSort(array: List[Int]) : List[Int] = {

    def sort(pendingList: List[Int], sortedList: List[Int]) : List[Int] = {
      if(pendingList.isEmpty)
        sortedList
      else
        bubble(pendingList,Nil, sortedList)
    }

    def bubble(pendingList: List[Int] , tempList: List[Int], sortedList: List[Int]) : List[Int] = {
      pendingList match {
        case h1 :: h2 :: t => {
          if(h1 > h2) bubble(h1 :: t, h2 :: tempList, sortedList)
          else bubble(h2 :: t, h1 :: tempList, sortedList)
        }
        case h1 :: Nil => sort(tempList, h1 :: sortedList)
      }
    }

    sort(array, Nil)

  }


  def main(args: Array[String]): Unit = {
    val x = bubbleSort(List(1,5,3,4,2))
    print(x)
  }


}

