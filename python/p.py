import requests

id = int(input("Enter id\n"))
URL = f"http://localhost:8080/people/{id}"

r = requests.get(url = URL)

person = r.json()

if r.status_code == 404:
    print(f"Server error {r.json()['message']}")
    print(f"Server error {r.json()['timestamp']}")
else:
    person = r.json()
    print(f"Person name: {person['name']}")
