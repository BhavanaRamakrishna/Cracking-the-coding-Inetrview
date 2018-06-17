



def oneinsert(s1, s2):
	i1 = 0
	i2 = 0
	flag = 0

	while i1 < len(s1) and i2 < len(s2):
		if s1[i1] != s2[i2]:
			if i1 != i2:
				return False
			i2 += 1
		else:
			i1 += 1
			i2 += 1
	return True


def onereplace(s1, s2):
	flag = 0
	for i in range(len(s1)):
		if s1[i] != s2[i] and flag == 0:
			flag = 1
		else:
			return False
	return True

def check(str1, str2):
	if len(str1) == len(str2):
		return onereplace(str1,str2)
	elif len(str1)+1 == len(str2):
		return oneinsert(str1, str2)
	elif len(str2)+1 == len(str1):
		return oneinsert(str2, str1)
	else:
		return False


str1 = "pale"
str2 = "ple"

print check(str1, str2)
