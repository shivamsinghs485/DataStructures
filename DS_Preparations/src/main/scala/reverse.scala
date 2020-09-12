object reverse extends App {
	var str = "try to reverse me"
	var str1=str.toCharArray
	var tmp=' '
	/*for(i <- 0 to str.length/2 ) {
		tmp = str(i)
		str(i) = str(str.length - i - 1)
	}*/
	for(i <- 0 to str1.length/2 )
	{
	tmp=str1(i)
		str1(i)=str1(str1.length-1-i)
		str1(str1.length-1-i)=tmp
	}
	
	str1.foreach(print)
	
	
	
	
	
	
	
	
}
