

def rotate(m):
	if len(m) == 0 or len(m) != len(m[0]):
		print "Nope"
	else:
		#learn this to rotate matrix in place or to traverse throughs layers inside the matrix
		for x in range(int(len(m)/2)):
			for y in range(x,len(m)-1-x):
				temp = m[x][y]
				m[x][y] = m[y][len(m)-1-x]
				m[y][len(m)-1-x] = m[len(m)-1-x][len(m)-1-y]
				m[len(m)-1-x][len(m)-1-y] = m[len(m)-1-y][x]
				m[len(m)-1-y][x] = temp
		print m


mat = [ [1, 2, 3, 4 ],
		[5, 6, 7, 8 ],
		[9, 10, 11, 12 ],
		[13, 14, 15, 16 ] ]
rotate(mat)

#O(n)
