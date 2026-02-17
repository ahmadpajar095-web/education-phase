#==========================#
# === PEMBUATAN LIST === #
#==========================#

#list kosong
iniList = []

# elemen dalam list
iniList = [1, 2, 3 ,3]

# ini list dengan key dan value
iniList = [{"nama" : "ahmad", "umur" : 23}, {"nama" : "putra", "umur" : 13}]

#==========================#
# === PENGAKSESAN LIST === #
#==========================#

print(iniList[1])
print(iniList[-2])
print(iniList[0]["nama"])


my_list = [1, 2, 3]

my_list.append(4)       # Tambah di akhir
my_list.insert(1, 10)   # Tambah di posisi tertentu (indeks 1)

print(my_list)

# beberapa method dalam llist
my_list = [1, 2, 3, 4]

my_list.remove(2)   # Hapus nilai 2
my_list.pop()       # Hapus elemen terakhir
my_list.pop(1)      # Hapus elemen di indeks 1


# mengubah isi list dalam index yang ditentukan
my_list = [1, 2, 3]
my_list[1] = 20     # Ubah elemen indeks 1 menjadi 20

# mengambil panjang list 
my_list = [1, 2, 3]
print(len(my_list))  # Output: 3


#mengambil dnegan cara looping dalam list
my_list = ["A", "B", "C"]

for item in my_list:
    print(item)

# mengambil output dengan gaya tertentu
my_list = [10, 20, 30, 40, 50]

print(my_list[1:4])   # Output: [20, 30, 40]
print(my_list[:3])    # Output: [10, 20, 30]
print(my_list[-2:])   # Output: [40, 50]
