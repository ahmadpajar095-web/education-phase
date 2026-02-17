import json

data_mahasigma = []


data_mahasigma.append({"nama": "pajar", "umur": 18})
data_mahasigma.append({"nama": "agus", "umur": 19})
data_mahasigma.append({"nama": "suryanto", "umur": 14})
data_mahasigma.append({"nama": "kurniawan", "umur": 89})


with open("tes.csv", "w") as file:
    json.dump(data_mahasigma, file, indent=4)

for k in data_mahasigma:
    print("nama : ", k["nama"], "\numur : ", k["umur"])

