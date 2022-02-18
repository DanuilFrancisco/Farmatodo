# README.MD


## Content
Este readme da una guia de como consumir los recursos para las pruebas, el proyecto crea por si mismo la base de datos una vez se compila gracias a la libreria de MongoDb y la vacea una vez se para la ejecucion. Y por ende ejecuta bases de datos No relaciones.

Para hacer la creacion de los datos haga uso de la API por medio de POSTMAN
Para la obtencion del metodo Get tambien puede hacer uso de POSTMAN

La direccion para hacer un POST o un GET den POSTMAN sera la siguiente
api/{nombreDeLaEntidadEnIngles}

api/characters
api/episodes
api/location
api/number
api/numbers

y para realizar los API REST especificos:

"...../all para optener todos los datos"
Para un dato en especifico
"...../{episode}
....../{location}
......./{number}

Y para realizar creacion de datos
"..../new"

Recuerde que la base de datos trabaja en:
Localhost = 27017

Y la API en:
Serverport = 8083



