class Node:
    def __init__(self, data):
        self.data = data      # pegang mainan
        self.next = None      # nunjuk ke boneka berikutnya

# bikin linked list
class LinkedList:
    def __init__(self):
        self.head = None      # boneka pertama

    def tambah(self, data):
        new_node = Node(data)
        if self.head is None:     # kalau belum ada boneka
            self.head = new_node
        else:
            temp = self.head
            while temp.next:      # jalan sampai boneka terakhir
                temp = temp.next
            temp.next = new_node  # sambung boneka baru

    def tampil(self):
        temp = self.head
        while temp:
            print(temp.data, end="  => ")
            temp = temp.next
        print("null")

# pakai linked list
set = LinkedList()
set.tambah(10)
set.tambah(20)
set.tambah(30)
set.tambah(40)

set.tampil()  # 10 → 20 → 30 → 40 → nuset
