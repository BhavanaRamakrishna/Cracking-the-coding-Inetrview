def is_unique(s):
	if len(s) <=0:
		return False
	if len(s) == 1:
		return True
	hashmap = {}
	for c in s:
		if c in hashmap:
			return False
		else:
			hashmap[c] = 1
	return True

def is_unique1(s):
	if len(s) <=0:
		return False
	if len(s) == 1:
		return True
	ss = ''.join(sorted(s))
	for i in range(1,len(ss)):
		if ss[i] == ss[i-1]:
			return False
	return True

s = "bhavn"
print is_unique(s)
#without using DS
print is_unique1(s)
