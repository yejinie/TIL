class DLL:
    class Node:
        def __init__(self, value, prev = None, next = None):
            self.prev = None
            self.next = None
            self.value = value
    
    def __init__(self):
        self.head = self.Node("head")


    def append(self, value):
        """리스트의 가장 뒤에 노드를 추가합니다."""
        node = self.head
        while node.next :
            node = node.next
        node.next = self.Node(value, prev = node)

    def count(self):
        node = self.head
        cnt = 1
        while node :
            node = node.next
            cnt += 1
        return cnt

    def insert(self, idx, value):
        cnt = 0
        node = self.head
        newNode = Node(value, prev = node, next = node.next)
        node.next.prev = newNode
        node.next = newNode
