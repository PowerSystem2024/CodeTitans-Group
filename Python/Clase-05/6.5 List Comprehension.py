
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
along_p = [p for p in names if p[0] == "P"] #Regresa una lista nueva donde el elemento tenga como primer caracter "P"

print(along_p)

beers = [
    {"name": "Quilmes", "Country": "Arg"},
    {"name": "Corona", "Country": "Mex"},
    {"name": "Stella Artois", "Country": "Bel"}
]
arg = [c for c in beers if c["Country"] == "Arg"]
print(arg)