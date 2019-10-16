object insertionSort{
  def main(args: Array[String]){
    def sort(array : Array[Int]) : Array[Int] = {

      for(x <- 1 until array.length){
        val value = array(x)
        var key = x

        while(key > 0 && array(key - 1) > value) {
          array(key) = array(key - 1)
          key = key - 1
        }
        array(key) = value
      }
      array
    }
    var values = Array(3,12,1,8,7,9,10,12)
    sort(values)
    println(values.mkString(","))
  }
}
