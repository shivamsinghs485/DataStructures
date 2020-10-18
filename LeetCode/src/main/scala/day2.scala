object day2 extends App {
	var nums = Array(3,3)
	var target = 6
	println(func1(nums,target))
	def func1(nums:Array[Int],target : Int): Any =
	{
		var nmap: Map[Int, Int] = Map()
//		for (i <- 0 to nums.length - 1)
//			nmap += (nums(i) -> i)
		for (i <- 0 to nums.size - 1)
			if (nmap.contains(target - nums(i)) && nmap(target - nums(i)) != i)				return Map( nmap(target - nums(i))-> i)
			else nmap += (nums(i) -> i)
			return 0
		
			
	}

	//	for( i <- 0 to nums.length-1)
//		{
//			if(nmap.contains(target-nums(i))
//				{
//
//				}
//		}

//	var i=0
//	var j=nums.length-1
//	while(i<nums.length-1)
//		{
//			if(target>nums(j) )
//				{
//					j
//				}
//		}
}
