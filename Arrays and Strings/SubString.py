def issubstring(s1,s2):
	return s2 in s1

def check(s1, s2):
	if len(s1) == len(s2) and len(s1) > 0:
		return issubstring(s1+s1, s2)
	return False


s1 = "waterbottle"
s2 = "erbotlewat"
print check(s1, s2)
