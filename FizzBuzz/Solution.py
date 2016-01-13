T=int(raw_input())
arr=[]
arr=map(int,(raw_input().strip().split(' ')))
for i in arr:
	for j in range(1,i+1):
		if j%15==0:
			print 'FizzBuzz'
		elif j%3==0:
			print 'Fizz'
		elif j%5==0:
			print 'Buzz'
		else:
			print j
		

