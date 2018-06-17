


def check(s):
	h = {}
	for c in s: #O(n)
		if c != ' ':
			if c in h:
				h[c] += 1
			else:
				h[c] = 1
	flag = 0
	for key in h: 
		if h[key] % 2 != 0:
			if flag== 0:
				flag = 1
			else:
				return False
	if  flag == 0:
		return False
	return True


s = "tact coa"
print check(s)
