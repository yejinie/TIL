""" 
Circle Linked List
SLL과 동일한 구조
마지막 node가 첫 node를 가르킴

"""

class CLL:
    class Node:
        def __init__(self, value, next = None):
            self.next = None
            self.value = value

    def __init__(self):
        self.head = self.Node("head")

    def append(self, value):
        #마지막 node 뒤에 새로운 node 추가
        node = self.head
        while node.next != self.head:
            node = node.next
        node.next = self.Node(value)
        node.next.next = self.head

    def pop(self):
        #마지막 node 삭제
        node = self.head
        while node.next.next != self.head:
            node = node.next
        node.next = self.head

    def count(self, value):
        #value를 가지고 있는 node가 몇개인지 리턴한다.
        node = self.head.next
        cnt = 0
        while node != self.head:
            if node.value == value:
                cnt += 1
            node = node.next
        return cnt

    def getSize(self):
        #현재 몇개의 node로 리스트가 구성되어 있는지 리턴한다.
        node = self.head.next
        cnt = 1
        while node != self.head:
            cnt += 1
            node = node.next
        return cnt

