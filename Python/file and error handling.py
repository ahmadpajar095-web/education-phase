with open("inventory.txt", "w") as file:
    file.write("sword\nshield\npotion")
with open("inventory.txt", "r") as file:
    isi = file.read()
    print(isi)

inventory = [    "sword",
    "shield",
    "potion"
]

with open ("inventory.txt", "w") as file:
    for item in inventory:
        file.write(item + "\n")