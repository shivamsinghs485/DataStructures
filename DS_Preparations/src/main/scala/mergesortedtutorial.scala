val row = arr1(i)(0) //task1
val column = arr1(i)(1) //task2
j = 0
while ( {
	j < m
}) {
	if (arr(row)(j) ne "a") {
		arr(row)(j) = "a"
		count += 1
	}
	if (arr(j)(column) ne "a") {
		arr(j)(column) = "a"
		count += 1
	}
	
	j += 1
}