import scala.collection.mutable.ArrayBuffer

object insertatnylocation extends App {
	var a=Array(1,3,4,5,6,5,4,4,3,5,6,4,3,4,5)
	var b = new Array[Int](a.length+1)
	var insertat=3
	val value=2
/*	for(i <- 0 to a.length)
		{
			if(i<insertat)
				b(i)=a(i)
			else if (i==insertat)
				b(i)=value
			else
				b(i)=a(i-1)
		}*/
	println()
	
//	var b : ArrayBuffer[Int] = new ArrayBuffer[Int]
//	for(i <- 0 to insertat-1 )
//		{
//				b.append(a(i))
//
//		}
//	b.append(value)
//	for(i <- insertat to a.length-1 )
//		{
//			b.append(a(i))
//		}
//
//	b.append(5)
//
	println("new array length"+b.length+" and old array length"+a.length)
	b.foreach(print)
	println()
	a.foreach(print)
	
}
