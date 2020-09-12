object mergersortedarray extends  App {
	
	var array1= Array(1,2,3,5,67,54,3)
	var array2=  Array(34,343,23,445,676,87)
	var array3  = new Array[Int](array2.length+array1.length)
	for(i <- 0 to array3.length-1)
		{
//			println(i)
		if(i<array1.length)
		{
			array3(i)=array1(i)
		}
		else
		{
			
				array3(i)=array2(i-array1.length)
		}
		
		
		}
	
	for(i <- 0 to array3.length)
		{
			if(array3(i)>array3(i+1))
				{
//					tmp=array3(i)
//					array3
				}
		}
	array3.foreach(println)
	
}
