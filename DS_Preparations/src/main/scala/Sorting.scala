object Sorting extends App {
//	var arr : Array[Long]=Array(793810624, 895642170 ,685903712 ,623789054 ,468592370)
//	var tmp : Long=0
////	for(i<- 0 to arr.length-2)
////		{
////			if(arr(i)<arr(i+1))
////				{
////					tmp=arr(i)
////					arr(i)=arr(i+1)
////					arr(i+1)=tmp
////				}
////
////		}
////	println(arr.reduce(_+_)-arr(arr.length-1))
////
	var candles = Array(3 ,2 ,1, 3)
	var tmp=0
	var count=0
	for(i <- 0 to candles.length-2)
	{
		if(candles(i)>candles(i+1))
		{
			tmp=candles(i)
			candles(i)=candles(i+1)
			candles(i+1)=tmp
		}
		
	}
	println(candles(candles.length-1))
	
	for(i <- 0 to candles.length-1)
	{
		if(candles(candles.length-1)==candles(i))
			count+=1
	}
	println(count)
}

	
	

