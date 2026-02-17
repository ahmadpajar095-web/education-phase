from fastapi import FastAPI

app = FastAPI()

@app.route("/")
def main():
    return {"massage" : "hello"}