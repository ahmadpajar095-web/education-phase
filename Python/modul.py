def sapa():
    print("Hello, world!")

list = [1, 2, 3, 4, 5]                  #tempat penyimpanan data yg fleksibel dan bisa diubah ubah
tuple = (1, 2, 3, 4, 5)                 #tempat penyimpanan data yg tidak bisa diubah ubah
dictionary = {
    'udin' :{
        'umur' : 20,
        'alamat' : 'Jakarta'
    },
    'budi' :{
        'umur' : 22,
        'alamat' : 'Bandung'
    },
    'a' : {
        'umur' : 25,
        'alamat' : 'Surabaya'
    }
    }   #tempat penyimpanan data yg berupa pasangan key dan value
set = {1, 2, 3, 4, 5}                   #tempat penyimpanan data yg tidak berurutan dan tidak ada duplikat

print(list[1])
print(tuple[2])
print(dictionary['budi'])
for data in set:
    print(f"nomor {data}")