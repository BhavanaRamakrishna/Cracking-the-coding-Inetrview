

def check(big, small): #won't work, try bhavbna, anabhva, try sorting and comparing each values
	if len(big) != len(small):
		return False
	if len(big) <=0 or len(small) <= 0:
		return False
	for c in big:
		if c not in small:
			return False
	return True


def check1(big, small): #won't work , cuz same key can't be added again, try getting the count and then subtracting
	if len(big) != len(small):
		return False
	if len(big) <=0 or len(small) <= 0:
		return False
	h = {}
	for c in big:
		h[c] = 1
	for c in small:
		if c not in h:
			return False
		else:
			h.pop(c, None)

	return True



big = "bhavbna"
small = "anabhva"

print check(big, small) #O(n2)
print check1(big, small) #O(n)
