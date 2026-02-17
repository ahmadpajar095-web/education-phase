## password -> hashed password ##
import bcrypt

password ='root123'                         # passwordnya disimpan dalam variabel
password_bytes = password.encode('utf-8')   # password diubah ke bytes

#hashing(proses mengubah password menjadi hash(hasil dari hashing/password yg udah dihash))
hashed = bcrypt.hashpw(password_bytes,bcrypt.gensalt())  #generate hash + salt(string random yg ditambahkan sebelum dihashing)

print(hashed) # var hashed dapat disimpan didatabase sebagai password yg sudah di enkripsi


## password dicek = hashed password ##

input_password = 'root123'                      # user menginput password
input_bytes = input_password.encode('utf-8')    # input diubah ke bytes

stored_hash = hashed                            # mengambil hash password dari database

if bcrypt.checkpw(input_bytes,stored_hash):     # checkpw bandingkan password input dengan yg ada pada database
    print("login berhasil")
else :
    print("login gagal")


#=========================================#
# contoh penggunaan pada login dan regist #
#=========================================#

from flask import Flask, request
import bcrypt

app = Flask(__name__)

@app.route("/register", methods=["POST"])
def register():
    password = request.form["password"]
    hashed = bcrypt.hashpw(password.encode(), bcrypt.gensalt())
    
    # simpan hashed ke database
    return "User berhasil dibuat"

@app.route("/login", methods=["POST"])
def login():
    password = request.form["password"]

    # ambil hashed dari database
    stored_hash = b'$2b$12$....'

    if bcrypt.checkpw(password.encode(), stored_hash):
        return "Login sukses"
    else:
        return "Login gagal"
