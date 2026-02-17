class player:
    def __init__(self,name,hp):
        self.name = name
        self.hp = hp

    def info(self):
        print(f"Nama: {self.name}")
        print(f"HP: {self.hp}")
 
    def attack(self, target):
        demage = 10  # Contoh damage tetap
        target.hp -= demage
        print(f"{self.name} menyerang! {target.name}")
        print(f"{target.name} menerima {demage} damage!")
        print(f"{target.name} HP tersisa: {target.hp}")
        
        print(f"{self.name} HP: {self.hp}")

    def defend(self):
        print(f"{self.name} bertahan!")
        print(f"{self.name} HP: {self.hp}")

    def heal(self):
        print(f"{self.name} menyembuhkan diri!")
        print(f"{self.name} HP: {self.hp}")

hero = player("Hero", 100)
kukang = player("Kukang", 80)
angkut = player("Angkut", 90)

kukang.attack("Hero")

class villain:
    def __init__(self,name,hp):
        self.name = name
        self.hp = hp
    
    def attack(self):
        print(f"{self.name} menyerang!")

    def defend(self):
        print(f"{self.name} bertahan!")

    def heal(self):
        print(f"{self.name} menyembuhkan diri!")