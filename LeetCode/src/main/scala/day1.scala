//Problem Statement
//Example 1:
//
//	Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//	Input: nums = [4,1,2,1,2]
//Output: 4

object day1 extends App {
	println("Enter you input")
//	val list =args.map(_.toInt).reduce(_^_)
	val list=args.map(_.toInt).toArray
	println("Below are the various Methods . Select anyone of the options")
	var choice = readInt()
	println(list)
	choice match
	{
		case 1 => bitwise(list)
		case 2 => method2(list)
	}
	def bitwise(a: Array[Int]) =
	{
	println("Im boarded")
		var xor=0
		for(i <- 0 to a.length-1)
			xor=xor^a(i)
		println(xor)
	}
	def method2(a: Array[Int]) =
	{
	println("No i am boarded")
		var checklist : Map[Int , Int] =Map()

		for(i <- 0 to a.length-1)
			{
			if( checklist.keys.toList.contains(a(i)))
				{
					//checklist(a(i))=2
					checklist += (a(i)-> (checklist(a(i))+1))
				}
			else checklist += (a(i) -> 1)
			}
//	println(checklist.filter(item => item._2 == checklist.maxBy(_._2)._2))
		println(checklist.minBy(_._2)._1)
	}
	
	
	
	
}
