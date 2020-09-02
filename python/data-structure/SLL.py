"""
아래에 학번과 이름을 꼭 적으세요.

학번:60201658
이름:강예진
소요시간 : 2시간 30분
"""
class LinkedList:
    """
    description : 노드가 다음 노드를 가르키고 있는 연결된 리스트
    """
    class Node:
        def __init__(self, item, next = None):
            self.item = item
            self.next = next

    def __init__(self):
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        self.head = None
        self.tail = None
        self.size = 0

    def get_size(self):
        # 리스트의 크기를 리턴하시오.
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        return self.size

    def is_empty(self):
        # 리스트가 비어있으면 True, 아니면 False
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        return self.size == 0

    def insert_head(self, item):
        # 새로운 node를 리스트 head에 추가한다.
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        if self.is_empty():
            self.head = self.Node(item)
            self.tail = self.head
        else:
            self.head = self.Node(item, self.head)
        
        self.size += 1

    def insert_tail(self, item):
        # 리스트 속 맨 뒤에 새로운 node를 추가한다.
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        if self.tail is None:
            self.tail = self.Node(item)
            self.head = self.tail
        else:
            self.tail.next = self.Node(item)
            self.tail = self.tail.next
            
        self.size += 1
            
            
    def delete_head(self):
        # head를 삭제. 비어 있다면 "List is Empty" 출력
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        if self.is_empty():
            print('List is Empty')
        else:
            try:
                self.head = self.head.next
                self.size -= 1
            except:
                self.head = None
                self.size = 0

    def delete(self, item):
        # 리스트 속 해당 item을 찾아 삭제한다. 
        # item이 없다면 "the item not found"을 출력
        # --- 아래의 return None 대신 코드를 작성하시오. ---
        
        if self.head == '':
            return False
        
        if self.head.item == item:
            temp = self.head
            self.head = self.head.next
            del temp
            self.size -= 1
            return True
        
        check = self.head
        if check != None:
            
            while check.next:
                if check.next.item == item:
                    temp = check.next
                    check.next = check.next.next
                    del temp
                    self.size -= 1
                    break
                check = check.next
        print("the item not found")
                
    
    def print_list(self):
        # 리스트를 head부터 순서대로 item을 출력한다.
        # 리스트에 아무 값도 없다면 list is empty를 출력한다.
        # --- 아래의 return None 대신 코드를 작성하시오. ---
       
        current = self.head
        if self.size == 0:
            print("list is empty")
        else:
            while current:
                if current.next != None:
                    print(current.item, end='')
                    print(" -> ", end='')
                else:
                    print(current.item)
                current = current.next

    def find(self, item):
        # item이 리스트 속에 있는 지 찾고, 있다면 item의 순서(head가 0번)를 반환하고 
        # 끝까지 찾아도 없으면 None을 반환
        check = self.head
        for i in range(self.size):
            if item == check.item:
                return i
            check = check.next
        return None
        

# 아래는 위 코드 테스트를 위해서 만들어놓은 샘플입니다. 수정하지 마세요.
# 다음과 같은 결과가 나와야 합니다.
"""
list is empty
IS_EMPTY? True
3 -> 1 -> 3 -> 4
IS_EMPTY? False
0
a = 0 b = 1
1 -> 3 -> 4
4
IS_EMPTY? False
List is Empty
list is empty
IS_EMPTY? True
"""

if __name__ == "__main__":
    SLL = LinkedList()
    SLL.print_list()
    print("IS_EMPTY?", SLL.is_empty())
    SLL.insert_head(1)
    SLL.insert_head(3)
    SLL.insert_tail(3)
    SLL.insert_tail(4) 
    SLL.print_list()
    print("IS_EMPTY?", SLL.is_empty())

    a = SLL.find(3)
    print(a)
    SLL.delete(3)
    b = SLL.find(3)
    print("a =", a, "b =", b)
    SLL.print_list()

    SLL.delete_head()
    SLL.delete_head()
    SLL.print_list()

    print("IS_EMPTY?", SLL.is_empty())
    SLL.delete_head()
    SLL.delete_head()
    SLL.print_list()
    print("IS_EMPTY?", SLL.is_empty())
