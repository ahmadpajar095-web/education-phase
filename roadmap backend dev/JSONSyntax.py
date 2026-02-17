import json

# Data berupa list of dict (daftar buku)
bukuku = [
    {"judul": "Python Dasar", "penulis": "Andi", "tahun": 2021},
    {"judul": "Data Science", "penulis": "Budi", "tahun": 2022},
    {"judul": "Machine Learning", "penulis": "Citra", "tahun": 2023}
]

# Simpan ke file JSON
with open("buku.json", "w") as f:
    json.dump(bukuku, f, indent=4
    )

# Baca isi file JSON
with open("buku.json", "r") as f:
    daftar_buku = json.load(f)

# Cetak semua judul buku
for buku in daftar_buku:
    print(buku["judul"], "-", buku["penulis"])
