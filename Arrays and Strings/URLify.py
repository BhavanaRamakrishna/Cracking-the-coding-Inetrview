

def URLify(s,n):
	count = 0
	for i in range(len(s)):
		if s[i] == " ":
			count = count + 1
	l = s.split()
	ns = ""
	for words in l: #takes O(n2)
		ns = ns + words
		ns = ns + "%20"

	ns = '%20'.join(l) #takes O(n)
	if len(ns) > n:
		return ns[0:n-1]

	return ns





s = "Mr John Smith   "
print URLify(s,13) #O(n)
