
import subprocess
import sys

# Pastikan dependensi terinstal
required_packages = ["transformers", "torch"]
for package in required_packages:
    try:
        __import__(package)
    except ImportError:
        print(f"Menginstal {package}...")
        subprocess.check_call([sys.executable, "-m", "pip", "install", package])

from transformers import AutoModelForCausalLM, AutoTokenizer
import torch

# Paksa mode CPU agar aman
device = torch.device("cpu")

# Memuat model GPT-2
print("Memuat model GPT-2, harap tunggu...")
tokenizer = AutoTokenizer.from_pretrained("gpt2")
model = AutoModelForCausalLM.from_pretrained("gpt2")
model.to(device)

# Fungsi untuk menghasilkan respons kreatif

def generate_response(prompt, max_length=200, temperature=0.9, top_k=50, top_p=0.95):
    inputs = tokenizer.encode(prompt, return_tensors="pt").to(device)
    outputs = model.generate(
        inputs,
        max_length=max_length,
        pad_token_id=tokenizer.eos_token_id,
        temperature=temperature,
        top_k=top_k,
        top_p=top_p,
        do_sample=True
    )
    response = tokenizer.decode(outputs[0], skip_special_tokens=True)
    return response

# Loop percakapan
print("AI siap! Ketik 'exit' untuk keluar.")
conversation = ""
while True:
    user_input = input("Anda: ")
    if user_input.lower() == "exit":
        print("Sampai jumpa!")
        break
    conversation += f"Anda: {user_input}\nAI:"
    ai_response = generate_response(conversation)
    # Ambil bagian jawaban AI setelah prompt
    ai_reply = ai_response.split("AI:")[-1].strip()
    print(f"AI: {ai_reply}")
    conversation += f" {ai_reply}\n"
