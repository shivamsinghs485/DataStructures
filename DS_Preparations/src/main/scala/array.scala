import util.control.Breaks._

object array extends App {
	println("inserting an element in mid of array")
	var a : Array[Int]=new Array(15)
	
	for(i <- 1 to 10)
		{
			a(i-1)=i+i
		}
//	println(searching(a,7))
//	insert(a,9,1234).foreach(println)
//	println("now deletion")
//	delete(a,0).foreach(println)
	def insert(arr : Array[Int] , index : Int,va : Int): Array[Int] =
	{
		for(i <- 10 to index+1 by -1) {
//		println(i)
			arr(i) = arr(i - 1)
		}
		arr(index)=va
		return arr
	}
	def delete(arr : Array[Int] , index : Int): Array[Int] =
	{
		for(i <- index to 10) {
			//		println(i)
			arr(i) = arr(i + 1)
		}
		
		return arr
	}
	def searching(arr : Array[Int],va : Int): String =
	{
		var l=0
		var h=arr.length-1
		var mid=0
		while(l<=h)
			{
				mid=(l+h)/2
				if(arr(mid)==va)
					return "found :)"
				else if(va<arr(mid))
					h=mid-1
				else
					l=mid+1
			}
		return "not found :("
	}
//	reverse1(a).foreach(println)
	def reverse1(arr : Array[Int]): Array[Int] =
	{
		var i=0
		var tmp=0
		var j=arr.length-1
		while(i<=j)
			{
			tmp=arr(i)
				arr(i)=arr(j)
				arr(j)=tmp
				i+=1
				j-=1
			}
		return arr
	}
//	insertsorted(a,13).foreach(println)
	def insertsorted(arr : Array[Int], x : Int): Array[Int] =
	{
		
			for (i <- 9 to 0 by -1) {
				if (arr(i) > x )
					arr(i + 1) = arr(i)
				else
				{
					arr(i + 1) = x
					return arr
				}
			}
		arr(0)=x
		return arr
	}
//	rearrange(Array(-5,6,7,8,-8,-7,-6,4,3,1)).foreach(println)
	def rearrange(arr : Array[Int]): Array[Int] =
	{
		
		var i=0
		var j=arr.length-1
		var t=0
		while(i<=j)
			{
				
				while(arr(i)<0) i+=1
				while(arr(j)>=0) j-=1
				if(i<j)
					{
						t=arr(i)
						arr(i)=arr(j)
						arr(j)=t
					}
			}
		return arr
	}
//	merge(Array(3,5,8,13,15),Array(1,2,3,4,5)).foreach(println)
	def merge(arr1 : Array[Int] , arr2: Array[Int]) : Array[Int]	 =	{
			var arr3 : Array[Int]=new Array(arr1.length+arr2.length)
		var i=0
		var k=0
		var j=0
		while (i < arr1.length && j<arr2.length ) {
					if (arr1(i) > arr2(j)) {
						arr3(k) = arr2(j)
						j += 1
					}
					else if(arr1(i)==arr2(j))
						{
							arr3(k) = arr2(j)
							j+=1
							i+=1
						} //this is to make same nos coming from both the array not getting repeated after merging
					else {
						arr3(k) = arr1(i)
						i += 1
					}
					k+=1
				}
				while(j<arr2.length)
					{
						arr3(k)=arr2(j)
						j+=1
						k+=1
					}
				while(i<arr1.length)
					{
						arr3(k)=arr1(i)
						i+=1
					k+=1
					}
				return arr3
		}
//	intersection(Array(3,5,8,13,15),Array(1,2,3,15)).foreach(println)
	def intersection(arr1 : Array[Int] , arr2: Array[Int]) : Array[Int]	 =	{
		var arr3 : Array[Int]=new Array(arr1.length+arr2.length)
		var i=0
		var k=0
		var j=0
		while (i < arr1.length && j<arr2.length ) {
			if (arr1(i) > arr2(j)) {
//				arr3(k) = arr2(j)
				j += 1
			}
			else if(arr1(i)==arr2(j))
			{
				arr3(k) = arr2(j)
				j+=1
				i+=1
				k+=1
			} //this is to make same nos coming from both the array not getting repeated after merging
			else {
//				arr3(k) = arr1(i)
				i += 1
			}
			
		}
		/*while(j<arr2.length)
		{
			arr3(k)=arr2(j)
			j+=1
			k+=1
		}
		while(i<arr1.length)
		{
			arr3(k)=arr1(i)
			i+=1
			k+=1
		}*/
		return arr3
	}
//	smissing(Array(2,5,6,7,9,11,13,15),1,20)
	def smissing(arr : Array[Int],l:Int,h:Int): Unit =
	{
		var i=1
		var j=0
		while(j<arr.length)
			{
				if(arr(j)!=i)
					{
						println("missing"+i)
						i+=1
					}
				else
					{
						i+=1
						j+=1
					}
			}
		while(i<=h)
			{
				println("missing"+i)
				i+=1
			}
		}
//	duplicatesorted(Array(3,6,8,8,10,12,15,15,15,20))
	def duplicatesorted(arr:Array[Int]): Unit =
	{
	var i=0
		var dup=0
		var j=1
		while(i<arr.length-1) {
			while (arr(i) == arr(i + 1))
		  {
			  j+=1
			  i+=1
		  }
			if(j>1)
			println("occurance of"+arr(i)+" is "+j+"times")
				i+=1
			j=1
			}
		println(dup)
	}
	duplicateunsortred(Array(5,5,1,2,7,9,7,7,2,2,2))
	def duplicateunsortred(arr : Array[Int]): Unit =
	{
		var checklist : Map[Int , Int] =Map()
		
		for(i <- 0 to arr.length-1)
		{
			if( checklist.keys.toList.contains(arr(i)))
			{
				//checklist(a(i))=2
				checklist += (arr(i)-> (checklist(arr(i))+1))
			}
			else checklist += (arr(i) -> 1)
		}
		//	println(checklist.filter(item => item._2 == checklist.maxBy(_._2)._2))
		checklist.withFilter(_._2>1).foreach(println)
		println(checklist)
		println(checklist.maxBy(_._2)._1)
		
	}
	
	
}

