import bcrypt

password1 = "halo123"
password2 = "halo456"
bytespass1 = password1.encode('utf-16')
bytespass2 = password2.encode('utf-16')

hashing1 = bcrypt.hashpw(bytespass1,bcrypt.gensalt())
hashing2 = bcrypt.hashpw(bytespass2,bcrypt.gensalt())

dbhash = [("ahmad",hashing1),("pajar",hashing2)]

print("yg disimpan")
print(dbhash)

user = "ahmad"
inputpass = "halo456"
bp = inputpass.encode("utf-16")

for i,j in dbhash:
    if i == user :
        h = j


if bcrypt.checkpw(bp,h):
    print("berhasil")
else :
    print("gagal")