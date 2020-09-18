import scala.io.StdIn._
object mergesortedtutorial extends App {
	var a = Array(Array(1,5,6),Array(1,7,9),Array(1,8,7))
	var k =Array("1 2","2 2","3 3 ")
	var i1=0
	
	while(i1 < k.length)
		{
			var count=0
		for(i <- 0 to a.length-1)
		{
			for(j <- 0 to a.length-1)
				{
					
					if(i==k(i1).split(" ")(0).toInt-1 || j==k(i1).split(" ")(1).toInt-1)
						{
							println(i+"and "+ j)
							a(i)(j)=555
						
						}
					else if(a(i)(j)!=555)
						{
							
							count+=1
							
						}
				}
		}
			println("count for "+i1+" task is "+count)
			i1+=1
		}
	
	
}
