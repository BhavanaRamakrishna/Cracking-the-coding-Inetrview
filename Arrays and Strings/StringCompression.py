def compress(s):
	t = [() for i in range(len(s))]
	i = 0
	t[0] = s[0],1
	for c in s:
		if t[i][0] != c:
			i += 1
			t[i] = c,1
		else:
			t[i]= t[i][0], t[i][1]+ 1
	s1 = ''.join([str(str(e[0]) + str(e[1]))for e in t if len(e)!= 0])
	return s1 if len(s1) < len(s) else s


s = "aabcccccaaa"
print compress(s)
