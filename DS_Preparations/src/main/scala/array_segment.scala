import scala.util.control._
object array_segment extends App {
  var loop = new Breaks;
  var arr = Array(3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12,3,16)
  var x = 3
  var k = 3
  print(segmentfinder(arr,12,3,3))
  def segmentfinder(arr : Array[Int] , length : Int , segment : Int , elem : Int) : Boolean = {

    var i=0
    var j = 0
    var passes = (length/segment).toInt
    var checks = 0
    for (pass <- 0 until passes)
      {

        if(pass != checks) {
          return false
        }
        loop.breakable{
        while(i < segment)
          {
            if(elem == arr(i+segment*pass))
              {

                i=0
                checks+=1
                loop.break()
              }
            i+=1
          }
        }
        print(pass)

      }
    if(passes != checks) {
      return false
    }
    return true
  }


}
