
class PriorityQueue(object): 
	def __init__(self): 
		self.queue = [] 

	def __str__(self): 
		return ' '.join([str(i) for i in self.queue]) 


	def isEmpty(self): 
		return len(self.queue) == [] 

	def insert(self, data): 
		self.queue.append(data) 

	
	def delete(self): 
		try: 
			max = 0
			for i in range(len(self.queue)): 
				if self.queue[i] > self.queue[max]: 
					max = i 
			item = self.queue[max] 
			del self.queue[max] 
			return item 
		except IndexError: 
			print() 
			exit() 

if __name__ == '__main__': 
	myQueue = PriorityQueue() 
	num=int(input())
	for i in range(num):
		myQueue.insert(int(input()) )
	r = int(input())
	for i in range(r):
		myQueue.delete()
	print("Queue elements are :",myQueue)      