class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.node_num = 0
    
    def push_front(self, data):
        new_node = Node(data)
        new_node.next = self.head

        if self.head != None:
            self.head.prev = new_node
            self.head = new_node
            new_node.prev = None
        
        else:
            self.head = new_node
            self.tail = new_node
            new_node.prev = None

        self.node_num += 1
    
    def push_back(self, data):
        new_node = Node(data)
        new_node.prev = self.tail
    
        if self.tail != None:
            self.tail.next = new_node
            self.tail = new_node
            new_node.next = None
        
        else:
            self.head = new_node
            self.tail = new_node
            new_node.next = None
        
        self.node_num += 1

    def pop_front(self):
        if self.head.next == None:
            temp = self.head
            self.head = None
            self.tail = None
            
        else:
            temp = self.head
            temp.next.prev = None
            self.head = temp.next
            temp.next = None
        
        self.node_num -= 1
        print(temp.data)

    def pop_back(self):
        if self.tail.prev == None:
            temp = self.tail
            self.head = None
            self.tail = None
        
        else:
            temp = self.tail
            temp.prev.next = None
            self.tail = temp.prev
            temp.prev = None

        self.node_num -= 1
        print(temp.data)

    def size(self):
        print(self.node_num)
    
    def empty(self):
        if self.node_num > 0:
            print(0)
        else:
            print(1)
    
    def front(self):
        print(self.head.data)
    
    def back(self):
        print(self.tail.data)

N = int(input())
l = DoublyLinkedList()
for _ in range(N):
    command = list(input().split())
    if command[0] == "push_front":
        l.push_front(int(command[1]))
    elif command[0] == "push_back":
        l.push_back(int(command[1]))
    elif command[0] == "pop_front":
        l.pop_front()
    elif command[0] == "pop_back":
        l.pop_back()
    elif command[0] == "size":
        l.size()
    elif command[0] == "empty":
        l.empty()
    elif command[0] == "front":
        l.front()
    elif command[0] == "back":
        l.back()
