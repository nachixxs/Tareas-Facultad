import pprint

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': '35', 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': '34', 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': '28', 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': '34', 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    1:  {'Nombre': 'Franco Armani', 'Edad': '35', 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Arquero'},
}

seleccionArgentina[23] = {'Nombre': 'Emiliano Martínez', 'Edad': '30', 'Altura': 1.95, 'Precio': '28 Millones', 'Posicion': 'Arquero'}
seleccionArgentina[7] = {'Nombre': 'Rodrigo De Paul', 'Edad': '28', 'Altura': 1.80, 'Precio': '40 Millones', 'Posicion': 'Mediocampista'}
seleccionArgentina[22] = {'Nombre': 'Lautaro Martínez', 'Edad': '25', 'Altura': 1.74, 'Precio': '80 Millones', 'Posicion': 'Delantero Centro'}
seleccionArgentina[3] = {'Nombre': 'Nicolás Tagliafico', 'Edad': '29', 'Altura': 1.72, 'Precio': '15 Millones', 'Posicion': 'Lateral Izquierdo'}

pprint.pprint(seleccionArgentina) # Importamos la libreria pprint para al ejecutar el diccionario se vea mas ordenado en la terminal