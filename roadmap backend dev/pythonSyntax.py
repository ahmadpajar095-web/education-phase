#ini komentar
""" ini komentar multibaris jadi gak perlu banyak buat tagar terus
tiap barisnya dan tinggal enter untuk masuk kebaris baru yg terpenting
diapit oleh tiga petik dua"""\


#name= input( "masukkan nama ")
#print("halo" , name, sep="," )

PI = 3.14
age : int = 20
name : str = "pajar"
#if true:
#   print ("ini boolean")  # indentasi itu sangat [penting ga boleh ganbungin tab dengan 4 spasi]

a =20
b =5
print (a ** b)

flag = True
empty = None


s = "Halo"               # single/double quotes
s = 'Halo'
s = """multi
baris"""
print (s)
s = r" aku \n bukan newline"  # raw string
s = f"Nama: {name}"      # f-string


s.lower(); s.upper(); s.strip()
s.replace("a", "x"); s.split(","); ",".join(["a","b"])

s[0]           # indexing
s[-1]          # dari belakang
s[1:5]         # slicing
s[::-1]        # reverse


user = {
    "name": "Pajar",
    "age": 18,
    "hukuman" : "push up"}
user["role"] = "Mahasiswa"
user.get("age", 0)           # default jika tidak ada
for k, v in user.items():
    print(k, v)

x = True
if age == 80 :
    print("Ini selalu jalan karena kondisinya True")
else :
    print("tak diketahui")

print (user.values())
print (user.get("rolee", "N/A"))

def fungsiSalam():
    print("asalamualaikum")

fungsiSalam()