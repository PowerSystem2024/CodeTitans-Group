# Curso de Git y GitHub

## CLASE 1 PRIMER SEMESTRE MIÉRCOLES 27 DE MARZO DEL 2024

### Lo que vimos en la clase anterior:

Abrimos la terminal de Git Bash en Window o la terminal de Ubuntu, también la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios:

```sh
# Vemos la ruta de la carpeta en la que estamos
pwd

# Es para navegar a una carpeta: change directory -> cambiar de directorio
cd

# Nos lleva al home, en la raíz del disco
cd /

# La virgulilla significa que estamos en el lugar de los documentos o del usuario
cd ~

# Esto es listar los archivos, nos muestra todos los archivos en la raíz
ls

# El espacio -al significa que es un argumento especial para ver archivos ocultos
# Usar la flecha hacia arriba nos muestra el último comando utilizado
ls -al

# Muestra casi todos los archivos sin los que están ocultos
ls -l

# Muestra el grupo de archivos pero no en una lista
ls -a

# Limpia la consola o ctrl + l
clear

# Nos devuelve a la carpeta anterior
cd ..

# Esto se usa para un autocompletado o para buscar una referencia
cd U + tab

# Cambiamos de disco en window
cd /D

# Muestra todos los directorios en Ubuntu
df -h

# Cambia de directorio usando WSL Ubuntu en window
cd /mnt/d
```

### CREACIÓN DE CARPETAS

```sh
cd ..
cd ..
cd /mnt/c
cd ~ # Vamos a la raíz

mkdir Tecnicatura # Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux

cd tecnicatura

mkdir Python
mkdir Java
mkdir JavaScript
```

> Revisar y ejecutar cada comando, hacerlo como práctica
>
> Profesor Ariel Betancud

## CLASE 2 PRIMER SEMESTRE MIÉRCOLES 3 DE ABRIL DEL 2024

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador

```sh
# Crea un archivo con su extensión: ESCRIBIR DENTRO
touch vacio.txt

# Guardamos lo que escribimos en el archivo
ctrl + s

# Significa la carpeta actual
./

# Significa la carpeta anterior
../

# Vemos el contenido del archivo
cat vacio.txt

# Veremos la historia completa de los comandos que hemos utilizado
history

# Veremos el comando que utilizamos en ese número
!72 + enter

# Borra el archivo seleccionado, ¡¡¡¡CUIDADO!!!!
rm vacio.txt

# Muestra como funciona el comando
rm --help
```

## CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT

```sh
cd tecnicatura
mkdir class-git

# Entramos en la carpeta que necesitamos trabajar
cd class-git

# Creamos un repositorio en la carpeta central, se crea el archivo .git
git init

# Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados
code .

# Creamos un archivo nuevo y escribimos en él
ctrl + n

# Guardamos poniendo el nombre: historia.txt
ctrl + s

# Vemos el estado del proyecto en tiempo real, está en el área de trabajo
git status

# Enviamos el archivo al área de preparación
git add historia.txt

# Para ver el estado de cambios
git status

# Quitamos el archivo del área de preparación, cached significa que está en memoria ram
git rm --cached historia.txt

# Tendremos la lista de como funciona la configuración
git config

# Configuraciones por defecto
git config --list

# Veremos donde están las configuraciones guardadas
git config --list --show-origin

# Configuración del nombre de usuario
git config --global user.name "Ariel Betancud"

# El correo debe ser el mismo que usaremos en GitHub
git config --global user.email "betancudariel@gmail.com"

# Ahora veremos que ya están todos los datos completos
git config --list

# Ingresamos todos los archivos al área de preparación (ram)
git add .

# El primer commit está hecho
git commit -m "Mensaje importante del commit"

# Hacemos cambios en el archivo y guardamos
code .

# Hay cambios para commitear
git status

git add .
git commit -m "Mi segundo commit"

# Vemos toda la historia de este archivo, el número largo es el hash del commit
git log historia.txt
```

> Revisar y ejecutar cada comando, hacerlo como práctica
>
> Profesor Ariel Betancud

## CLASE 3 PRIMER SEMESTRE MIÉRCOLES 10 DE ABRIL DEL 2024

### Analizar cambios en los archivos de tu proyecto Git parte 3

Ingresamos de la siguiente manera:

> Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

```sh
# Ingresamos al directorio donde están nuestras carpetas de trabajo
cd tecnicatura

# Vemos los archivos y directorios que ya tenemos
ls

cd git # No hay nada
cd .. # Salimos

# Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para práctica
rm historia.txt

# rm: cannot remove 'Git': Is a directory
rm Git

# By default, rm does not remove directories. Use the --recursive (-r or -R) arguments
rm --recursive -R Git

# Nos muestra la documentación en Inglés
rm --help

# Creamos la carpeta o directorio para trabajar en Git local por ahora
mkdir class-git

# Entramos para crear el README.md para este sector
cd class-git

# Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto
touch README.md
```

> Enlace a la documentación en GitHub de MARKDOWN
> Leemos la documentación para ir creando en README.md como lo enseña GitHub.

```sh
# Abrimos VSC para editar el archivo
code .
```

### Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear

```sh
git status
git add .
git status
git commit -m "Cargamos el README dentro del directorio class-git"
git status

# Para ver los dos commits hechos
git log

cd ..
cd ..
```

## GitHub

GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

Luego de crear nuestra cuenta, podemos:

- Crear o importar repositorios
- Crear organizaciones y proyectos de trabajo
- Descubrir repositorios de otras personas
- Contribuir a proyectos existentes
- Dar estrellas a proyectos interesantes
- Y muchas otras funcionalidades

### Recursos Adicionales

> Para más información sobre el formato Markdown, consulta la [documentación oficial de GitHub](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)

> Profesor Ariel Betancud

## CLASE 4 PRIMER SEMESTRE MIÉRCOLES 17 DE ABRIL DEL 2024

### Analizar cambios en los archivos de tu proyecto Git parte 4

Ingresamos de la siguiente manera:

> Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

> **TAREA**: AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

```sh
# Navegamos al directorio de trabajo
cd tecnicatura
cd class-git

# Listamos el contenido del directorio
ls

# Creamos un nuevo archivo
touch historia.txt

# Abrimos VSCode en el directorio actual
code .

# Modificamos el archivo historia.txt colocando lo siguiente:
# "Bienvenido mi nombre es Ariel (coloca tu nombre)"
# Guardamos con:
ctrl + s

# Verificamos el estado del repositorio
git status

# Agregamos los cambios al área de preparación
git add .

# Verificamos nuevamente el estado
git status

# Realizamos commit sin -m para ver el editor vim
git commit

# Para salir del editor vim:
# En Windows (Git Bash):
Esc                # Presionamos Escape
:wq! + enter      # Escribimos y salimos

# En Linux:
Esc + shift + z + z  # Salimos del mensaje para el commit

# Agregamos otra línea en historia.txt desde VSC:
# "estoy estudiando programación"
# Guardamos con:
ctrl + s

# Preparamos los cambios
git add .

# Realizamos otro commit (se abrirá vim)
git commit

# En vim:
Esc + i           # Para comenzar a escribir (modo inserción)

# Para salir en Linux:
ctrl + x
s + enter         # 's' para sí, 'y' para yes en inglés

# Vemos los cambios del último commit
git show

# Vemos el historial de commits del archivo
git log historia.txt

# Salimos del registro
q

# Comparamos diferentes commits
# Nota: Colocar primero el hash más antiguo, luego el más reciente
git diff hash_commit_numerico hash_commit_numerico

# Salimos de la comparación
q

# Volvemos al directorio principal
cd ..
cd ..
```

> Nota: Los comandos para salir del editor vim pueden variar según el sistema operativo y la configuración de la terminal.

## CLASE 5 PRIMER SEMESTRE MIÉRCOLES 8 DE MAYO DEL 2024

### Volver en el tiempo en nuestro repositorio utilizando reset y checkout parte 6

Ingresamos de la siguiente manera:

> Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

> **TAREA**: AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

```sh
# Navegamos al directorio de trabajo
cd tecnicatura
cd class-git

# Listamos contenido y abrimos VSCode
ls
code .

# Revisamos el historial de commits
git log

# Volvemos a una versión anterior (hay dos tipos: duro y suave)
git reset hash-nombre-commit

git status
git add .
git commit -m "Agregamos datos de estudios en historia.txt"

# Verificamos la configuración actual
git config --list

# Reset duro - todo vuelve al estado anterior, se pierden los cambios
git reset hash-nombre-commit --hard

# Reset suave - mantiene los cambios en staging
git reset hash-nombre-commit --soft

# Creamos y configuramos el portafolio
touch portafolio.html
# Usar html:5 en VSCode para cargar el código básico HTML
# Usar "Open with Live Server" para ver en navegador

git status
ls
ls -al
git add .
git commit -m "Agregamos el html para nuestro portafolio"

# Creamos y configuramos los estilos CSS
mkdir css
cd css
touch style.css

# Agregamos los cambios de CSS
git status
git diff
git add .
git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"

# Verificamos los cambios realizados
git log
git log --stat    # Muestra cambios específicos por archivo
q                 # Para salir del log

# Navegando entre versiones
git checkout hash-nombre-commit historia.txt    # Ver versión específica
git checkout master historia.txt               # Volver a versión actual
git commit -am "Reemplazo de una versión por otra de la historia"

# Volvemos al directorio principal
cd ..
cd ..
```

> **Nota importante**: El comando `git checkout` debe usarse con precaución, ya que puede resultar en pérdida de cambios si no se maneja correctamente.
>
> **Tip**: Usar `git log --stat` es útil para ver detalles específicos de los cambios en cada commit.

## CLASE 6 PRIMER SEMESTRE MIÉRCOLES 15 DE MAYO DEL 2024

### Git reset vs. Git rm parte 7

> Los comandos git reset y git rm tienen utilidades muy diferentes, pero pueden confundirse fácilmente.

### GIT RESET

El comando git reset es una herramienta poderosa que te permite deshacer o revertir cambios en tu repositorio de Git. Lo puedes ejecutar de tres maneras diferentes, con las líneas de commando --soft, --mixed y --hard.

A diferencia de git checkout que nos permite ir, mirar, pasear y volver, con git reset volvemos al pasado sin la posibilidad de volver al futuro. Borramos la historia y la debemos sobreescribir. No hay vuelta atrás.

#### Tres árboles en Git

Los "tres árboles" de Git son estructuras de datos basadas en nodos y punteros que Git utiliza para hacer seguimiento a un cronograma de ediciones, aunque no sean estructuras en forma de árbol en el sentido tradicional.

Veamos un ejemplo práctico:

```sh
# Creamos un directorio de prueba
mkdir git_reset_test

# Entramos en la carpeta
cd git_reset_test

# Inicializamos el repositorio
git init

# Creamos un archivo de prueba
touch reset_file.txt

# Lo agregamos al staging
git add reset_file.txt

# Realizamos el primer commit
git commit -m "Iniciando el primer commit"
```

### ¿Cómo funciona Git Reset en tu flujo de trabajo?

Git reset permite moverte entre diferentes commits para deshacer o rehacer cambios. Git guarda todo lo nuevo del repositorio como commits, que son instantáneas del estado del código en un momento dado.

#### Variaciones de Git Reset

1. **git reset --soft**:

   - Borra el historial y los registros de Git de commits anteriores
   - Guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit

2. **git reset --hard**:

   - Deshace todo, absolutamente todo
   - Toda la información de los commits y del área de staging se elimina del historial

3. **git reset --mixed**:

   - Borra todo, exactamente todo
   - Toda la información de los commits y del área de staging se elimina del historial

4. **git reset HEAD**:
   - Saca archivos del área de staging sin borrarlos
   - No realiza otras acciones
   - Permite incluirlos de nuevo en staging con git add

> **Importante**: Si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.

### Git rm

Es un comando que nos ayuda a eliminar archivos de Git sin eliminar su historial del sistema de versiones.

#### Variaciones de Git rm

```sh
# Elimina archivos del repositorio local y staging, manteniéndolos en disco
git rm --cached

# Elimina los archivos de Git y del disco duro
git rm --force
```

### Diferencias clave

1. **git rm vs git reset HEAD**:

   - git rm elimina archivos del repositorio y de la historia
   - git reset HEAD saca cambios del área de preparación sin afectar la historia

2. **git reset vs git revert**:
   - git reset: para reescribir la historia del repositorio
   - git revert: para deshacer cambios de forma segura sin modificar la historia

### Resumen

Para evitar problemas en el trabajo:

- Entender las implicaciones y riesgos de cada comando
- Elegir el enfoque adecuado según las necesidades
- Mantener la integridad del historial del proyecto

> **Nota**: Crear cambios en el archivo creado, donde vamos a hacer varios commits, para ir probando los nuevos comandos. Al finalizar las pruebas, eliminar el directorio con todo su contenido.

## CLASE 7 PRIMER SEMESTRE MIÉRCOLES 22 DE MAYO DEL 2024

### Flujo de trabajo básico con un repositorio remoto parte 8

Cuando empiezas a trabajar en un entorno local, el proyecto vive únicamente en tu computadora. Esto significa que no hay forma de que otros miembros del equipo trabajen en él.

Para solucionar esto, utilizamos los servidores remotos: un nuevo estado que deben seguir nuestros archivos para conectarse y trabajar con equipos de cualquier parte del mundo.

Estos servidores remotos pueden estar alojados en GitHub, GitLab, BitBucket, entre otros. Lo que van a hacer es guardar el mismo repositorio que tienes en tu computadora y darnos una URL con la que todos podremos acceder a los archivos del proyecto. Así, el equipo podrá descargarlos, hacer cambios y volverlos a enviar al servidor remoto para que otras personas vean los cambios, comparen sus versiones y creen nuevas propuestas para el proyecto.

### Comandos para trabajo remoto con GIT

#### Comandos básicos

```sh
# Descargar repositorio remoto con todo su historial
git clone url_del_servidor_remoto

# Enviar cambios al servidor remoto
git push

# Traer actualizaciones del servidor remoto
git fetch

# Combinar cambios remotos con directorio de trabajo
git merge

# Ejecutar fetch y merge en un solo comando
git pull
```

#### Comandos avanzados para visualización de logs

```sh
# Mostrar commits de forma concisa
git log --oneline          # Muestra ID y título del commit
git log --decorate        # Muestra ubicación del HEAD
git log --stat           # Muestra estadísticas de cambios
git log -p              # Muestra cambios detallados en contenido

# Filtrar logs por autor y fecha
git shortlog            # Agrupa commits por autor
git log --author="Name Author"
git log --after="2018-1-2"
git log --before="today"

# Visualización personalizada
git log --graph --oneline --decorate --all
git log --pretty=format:"%cn hizo un commit %h el dia %cd"

# Limitar número de commits
git log -3

# Búsqueda en commits
git log --grep="INVIE"        # Búsqueda exacta
git log --grep="INVIE" -i     # Búsqueda ignorando mayúsculas/minúsculas
git log -- index.html         # Búsqueda en archivo específico
git log -S "Por contenido"    # Búsqueda por contenido

# Exportar logs
git log > log.txt            # Guardar logs en archivo
```

> **Tip**: Estos comandos pueden combinarse para obtener visualizaciones más específicas según tus necesidades.

> **Nota**: Es importante mantener sincronizado tu repositorio local con el remoto para evitar conflictos en el código.

## CLASE 8 PRIMER SEMESTRE MIÉRCOLES 29 DE MAYO DEL 2024

### Introducción a las ramas o branches de Git parte 9

Cuando entramos en el proyecto veremos que nos encontramos con la rama master, y es a partir de allí que debe saber que esta es la rama madre o principal rama, y las otras ramas se crean para no afectar a la master.

Las ramas (branches) son la forma de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.

La cabecera o HEAD representan la rama y el commit de esa rama donde estamos trabajando. Por defecto, esta cabecera aparecerá en el último commit de nuestra rama principal. Pero podemos cambiarlo al crear una rama o movernos en el tiempo a cualquier otro commit.

### Comandos básicos para manejo de ramas

```sh
# Genera una nueva rama
git branch nombre-de-la-rama

# Salta de una rama a otra
git checkout nombre-de-la-rama

# Genera una rama y nos mueve a ella automáticamente
git checkout -b rama

# Nos lleva a cualquier commit eliminando historial posterior
git reset id-commit

# Nos lleva a cualquier commit manteniendo historial
git checkout rama-o-id-commit
```

### Práctica con ramas

Mientras la rama master está cambiando normalmente, vamos a crear una rama paralela que va a crear nuevas secciones. La llamaremos "segunda" y la fusionaremos para ver cómo queda en la rama master.

> **Nota**: Al crear otra rama estamos creando una copia de todos los commits que ya tiene la rama master. Los cambios en la nueva rama no serán visibles en master hasta realizar un merge.

```sh
# Preparación del entorno
cd Tecnicatura
cd class-git
code .

# Guardamos cambios y verificamos estado
ctrl + s
git status

# Diferentes formas de hacer commit
git commit -am "mensaje del commit"    # Para archivos existentes
git commit -a -m "Mensaje del commit"  # Igual al anterior
git commit -a                          # Abre vim para editar mensaje

# Verificar cambios
git log
git log --stat
git branch        # Muestra rama actual
git show          # Muestra último cambio

# Trabajando con la nueva rama
git branch segunda            # Crear nueva rama
git checkout segunda         # Cambiar a nueva rama
git branch                  # Verificar rama actual
git status                 # Ver estado y HEAD actual

# Hacer cambios y commitear
git add .
git commit                 # Abre vim para mensaje
git show                  # Ver cambios realizados
git log                  # Ver historial

# Volver a master
git checkout master      # Cambiar a rama principal
git log                # Ver historial en master
```

> **Importante**:
>
> - Los cambios en una rama no afectan a las otras hasta hacer merge
> - Siempre verifica en qué rama estás antes de hacer cambios
> - Usa `git branch` para ver todas las ramas y la actual

### Comandos útiles adicionales

```sh
# Limpiar consola
ctrl + l

# Salir de diferentes vistas
q                    # Salir de log/show
ctrl + x             # Salir de vim
s + enter           # Guardar en vim

git checkout segunda #Volvemos a ver todos los cambios que hicimos de nuevo
```

## CLASE 9 PRIMER SEMESTRE MIÉRCOLES 5 DE JUNIO DEL 2024 - Portafolio 4

### Fusión de ramas con Git merge parte 10

La fusión en Git es la forma en que este sistema une un historial bifurcado. El comando git merge permite integrar líneas de desarrollo independientes generadas por git branch en una sola rama. Con este comando, podemos crear un nuevo commit que combina dos ramas o branches: la rama actual y la rama que se indica después del comando.

> **Importante**: Los comandos de fusión del merge afectan solo a la rama actual y no a la rama de destino. Por lo tanto, te recomendamos utilizar git checkout para seleccionar la rama actual y git branch -d para eliminar la rama de destino obsoleta.

### Funcionamiento de Git merge

Git merge fusiona secuencias de confirmaciones en un solo historial, generalmente para combinar dos ramas. Busca una confirmación de base común y genera una confirmación de fusión que representa la combinación de las dos ramas hasta el resultado final.

### ¿Cómo unir dos ramas en git?

Para combinar ramas en tu repositorio local:

1. Usa `git checkout` para cambiar a la rama donde deseas fusionar (generalmente la rama principal)
2. Emplea `git merge` y especifica el nombre de la otra rama que deseas traer

```sh
# Ejemplo básico de merge
git checkout master
git merge segunda
```

### Comandos básicos de GitHub

```sh
# Inicialización y configuración
git init                    # Crear repositorio
git add .                   # Agregar archivos a staging
git commit -m "mensaje"     # Guardar cambios con mensaje

# Manejo de ramas
git branch nombre_rama      # Crear nueva rama
git checkout nombre_rama    # Moverse entre ramas
git push origin rama       # Enviar cambios a remoto

# Sincronización con remoto
git fetch                  # Traer actualizaciones del remoto
git merge rama            # Fusionar ramas o actualizar cambios
git pull origin rama      # Fetch y merge combinados

# Gestión de versiones
git checkout "codigo" "archivo"    # Volver a versión específica
git reset --soft                   # Volver conservando cambios en staging
git reset --hard                   # Volver descartando todos los cambios
git reset HEAD                     # Sacar cambios de staging

# Eliminación de archivos
git rm --cached                    # Eliminar de staging
git rm --force                     # Eliminar de git y disco duro

# Visualización de cambios
git status                         # Estado actual
git log                           # Historia completa
git log --stat                    # Cambios específicos
git show                         # Cambios históricos
git diff                        # Comparar cambios
```

### Ejemplo práctico: Resolución de conflictos

```sh
# En rama segunda
git status
git commit -am "Finalizado el cambio en rama segunda"

# En master
git checkout master
# Hacer cambios y guardar
git commit -am "Agregado contenido adicional"

# Proceso de merge
git merge segunda
# Resolver conflictos en VSCode
git commit -am "Arreglando conflicto"
git status
# Verificar cambios en navegador y código

# Finalizar merge
git commit -am "Solucionado el conflicto"
git merge segunda

# Sincronizar cambios entre ramas
git checkout segunda
git merge master
git commit -am "Actualizando rama segunda"
git checkout master
git merge segunda
```

> **Tip**: En caso de conflictos, siempre guarda tus cambios antes de hacer git checkout para evitar perder trabajo.

## CLASE 10 PRIMER SEMESTRE MIÉRCOLES 12 DE JUNIO DEL 2024 - Portafolio 5

### Resolución de conflictos al hacer merge parte 11

#### Conceptos Importantes

Git nunca borra nada a menos que nosotros se lo indiquemos. Cuando usamos `git merge` o `git checkout` estamos cambiando de rama o creando un nuevo commit, no borrando ramas ni commits (recuerda que puedes borrar commits con `git reset` y ramas con `git branch -d`).

Git puede resolver automáticamente algunos conflictos como:

- Cambios en diferentes líneas
- Nuevas líneas
- Cambios simples

Sin embargo, hay situaciones donde Git no puede resolver automáticamente los conflictos, como cuando dos ramas modifican la misma línea de código.

> **Importante**: Los archivos con conflictos entran en estado "Unmerged", similar a un estado intermedio entre Untracked y Unstaged.

### Cómo cancelar un merge

Si necesitas cancelar un merge en proceso:

```sh
git merge --abort
```

### Trabajo con Repositorios Remotos

1. **Operaciones básicas**:

   - `git clone`: Copiar repositorio remoto localmente
   - `git push`: Enviar cambios al remoto
   - `git fetch`: Actualizar referencias del remoto
   - `git merge`: Fusionar cambios
   - `git pull`: Combina fetch y merge

2. **Comandos rápidos**:
   - `git commit -am ""`: Combina add y commit
   - `git branch`: Crear nuevas ramas
   - `git checkout`: Cambiar entre ramas

### Ejemplo Práctico: Resolución de Conflictos

```sh
# Sincronizar ramas
git checkout segunda
git merge master    # Traer cambios de master a segunda

# Crear conflicto (en rama segunda)
# Modificar archivos HTML y CSS
ctrl + s
git commit -am "Modifique el css y el color del texto"

# Cambiar a master y hacer cambios
git checkout master
# Modificar los mismos archivos
ctrl + s
git commit -am "Agregue suscripción, cambie el código y puse todo azul en css"

# Intentar merge
git merge segunda    # Esto generará conflicto
```

### Resolución del Conflicto

1. Abrir archivos conflictivos en VSCode
2. Elegir cambios deseados (incoming/current changes)
3. Guardar cambios
4. Commitear la resolución:

```sh
# Verificar estado
git status

# Commitear resolución
git commit -am "Solución de conflictos al mergear las ramas"

# Sincronizar ramas
git checkout segunda
git merge master
```

> **Tips para resolver conflictos**:
>
> - Siempre guarda tus cambios antes de cambiar de rama
> - Usa herramientas visuales como VSCode para resolver conflictos
> - Comunícate con tu equipo antes de hacer cambios mayores
> - Mantén tus ramas actualizadas frecuentemente

### Recordatorios Importantes

- Los merges también son commits
- El merge ocurre en la rama donde estás posicionado
- Los conflictos deben resolverse manualmente
- Siempre verifica el estado después de resolver un conflicto

## CLASE 11 PRIMER SEMESTRE MIÉRCOLES 19 DE JUNIO DEL 2024 - Portafolio 6

### Cómo funcionan las llaves públicas y privadas parte 12

Las llaves públicas y privadas, conocidas también como cifrado asimétrico de un solo camino, sirven para mandar mensajes privados entre varios nodos con la lógica de que firmas tu mensaje con una llave pública vinculada con una llave privada que puede leer el mensaje.

#### Propósito

Las llaves públicas y privadas nos ayudan a cifrar y descifrar nuestros archivos de forma que los podamos compartir sin correr el riesgo de que sean interceptados por personas con malas intenciones.

### Proceso de cifrado de mensajes

1. **Generación de llaves**

   - Ambas personas deben crear su par de llaves (pública y privada)

2. **Compartir llaves públicas**

   - Las llaves públicas pueden compartirse libremente
   - No hay riesgo si son interceptadas

3. **Cifrado del mensaje**

   - El remitente usa la llave pública del destinatario
   - Solo la llave privada correspondiente puede descifrar el mensaje

4. **Transmisión segura**

   - El mensaje cifrado puede enviarse por cualquier medio
   - La interceptación no compromete la seguridad

5. **Descifrado**
   - El destinatario usa su llave privada
   - Solo él puede acceder al contenido original

> **IMPORTANTE**: Nunca compartas tu llave privada. La llave pública puede compartirse libremente, pero la privada debe mantenerse segura y protegida.

### Diagrama de flujo básico

```
Emisor                                     Receptor
  |                                           |
  |-- Obtiene llave pública del receptor ---->|
  |                                           |
  |---- Cifra mensaje con llave pública ----->|
  |                                           |
  |                        Descifra mensaje --|
  |                    con su llave privada --|
```

> **Tip**: Este sistema de cifrado es la base de la seguridad en Git y otros sistemas de control de versiones distribuidos.

## CLASE 12 PRIMER SEMESTRE MIÉRCOLES 26 DE JUNIO DEL 2024 - Portafolio 7

### Configura tus llaves SSH en local parte 13

La seguridad en GitHub va más allá de usuario y contraseña. Las llaves SSH proporcionan una capa adicional de seguridad y eliminan la necesidad de ingresar credenciales constantemente.

> **Importante**: Las llaves SSH son por persona, no por repositorio o proyecto.

### ¿Por qué usar SSH?

1. Mayor seguridad que usuario/contraseña
2. Protección contra pérdida de acceso
3. Autenticación automática
4. Conexión cifrada

### Proceso de configuración

```sh
# Verificar configuración actual
git config -l

# Actualizar email en GitHub
git config --global user.email "alumnos@mail.com"

# Generar par de llaves SSH
ssh-keygen -t rsa -b 4096 -C "alumnos@mail.com"

# Iniciar agente SSH
eval $(ssh-agent -s)

# Agregar llave privada al agente
ssh-add ~/.ssh/id_ga35745    # Usar ruta de tu llave privada
```

### Configuración por Sistema Operativo

#### Windows y Linux

```sh
# Iniciar agente SSH
eval $(ssh-agent -s)

# Agregar llave
ssh-add ruta-donde-guardaste-tu-llave-privada
```

#### Mac

```sh
# Iniciar agente SSH
eval "$(ssh-agent -s)"

# Crear/modificar archivo config
vim config
Host *
  AddKeysToAgent yes
  UseKeychain yes
  IdentityFile ruta-donde-guardaste-tu-llave-privada

# Agregar llave
ssh-add -K ruta-donde-guardaste-tu-llave-privada
```

### Segundo Factor de Autenticación (2FA)

Es recomendable configurar 2FA para mayor seguridad. Hay dos opciones principales:

1. **GitHub Mobile**

   - Instalar app GitHub Mobile
   - Iniciar sesión
   - Usar códigos generados en la app

2. **Authenticator App**
   ```
   Configuración:
   1. Perfil → Settings
   2. Password and Authentication
   3. Authenticator app → Edit
   4. Escanear código QR
   ```

> **Recomendación**: Usar Twilio Authy Authenticator para códigos de autenticación.

### Tips de Seguridad

1. Proteger la llave privada con contraseña
2. Nunca compartir la llave privada
3. Mantener respaldos seguros de las llaves
4. Registrar múltiples métodos de 2FA
5. Guardar códigos de recuperación en lugar seguro

> **Nota**: Es crucial registrar y guardar los datos de autenticación para mantener acceso al cambiar de dispositivo.

# CLASE 1 SEGUNDO SEMESTRE MIÉRCOLES 14 DE AGOSTO DEL 2024

### USO DE GITHUB Parte 1

GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

### Funcionalidades Principales

- **Import repository**: Importar repositorios existentes
- **New repository**: Crear nuevo repositorio
- **New organization**: Crear espacio para empresa/equipo
- **New project**: Agrupar repositorios relacionados
- **New gist**: Compartir fragmentos de código

### Crear Nuevo Repositorio

1. **Configuración básica**:
   - Nombre: `class-git`
   - Descripción: "Haremos un blog increíble"
   - Visibilidad: Público/Privado
   - README.md: Archivo de documentación inicial

> **Nota**: El `README.md` es esencial para describir el proyecto, requerimientos e instrucciones de contribución.

### Clonar Repositorio

```bash
# Clonar repositorio desde URL
git clone URL
```

> **IMPORTANTE**: Inicialmente usaremos HTTPS que requiere usuario y contraseña.

### Conectar Repositorio Local con GitHub

```bash
# 1. Conectar repositorio remoto
git remote add origin URL

# 2. Verificar conexión
git remote
git remote -v

# 3. Sincronizar repositorios
git fetch
git merge
# O alternativamente:
git pull origin master --allow-unrelated-histories

# 4. Subir cambios
git push origin master
```

### Autenticación en GitHub 2022

#### Actualizar nombre de rama

```bash
# Renombrar rama master a main
git branch -M main
```

#### Crear Token de Acceso Personal

> **IMPORTANTE**: Desde 2022, GitHub requiere tokens en lugar de contraseñas.

Pasos para crear token:

1. GitHub → Settings
2. Developer settings
3. Personal access tokens
4. Generate new token
5. Configurar:
   - Nombre descriptivo
   - Fecha de expiración
   - Permisos (mínimo: repo)
   - Generate token

> **Tip**: Guarda el token en un lugar seguro, no podrás verlo nuevamente.

### Recordatorios Importantes

1. Usar HTTPS para clonación inicial
2. Siempre inicializar con README.md
3. Mantener tokens seguros
4. Actualizar nombres de rama a `main`
5. Verificar conexiones remotas antes de push

## CLASE 2 SEGUNDO SEMESTRE MIÉRCOLES 21 DE AGOSTO DEL 2024

### Cargar la llave SSH pública en GitHub

Para establecer una conexión segura con GitHub, necesitas cargar tu llave SSH pública en tu cuenta. La llave se encuentra en el archivo `.pub` dentro del directorio `.ssh`.

### Proceso de configuración en GitHub

1. **Copiar llave pública**

   - Abrir archivo `.ssh/*.pub` con editor de texto
   - Copiar todo el contenido

2. **Configurar en GitHub**
   - Ir a Settings → SSH and GPG keys
   - Click en "New SSH key"
   - Agregar nombre descriptivo
   - Pegar contenido de llave pública

> **Recomendación**: Nombrar la llave SSH según el dispositivo donde se usa. Repetir proceso para cada nueva PC.

### Comandos de gestión de ramas

```bash
# Ver rama actual
git branch

# Cambiar a rama master
git checkout master

# Renombrar master a main
git branch -M main

# Conectar repositorio remoto
git remote add origin git@github.com:nombreUsuario/class-git.git

# Verificar conexión remota
git remote -v

# Fusionar rama segunda en main
git merge segunda

# Commit rápido con mensaje
git commit -am "Uso de GitHub parte 20"

# Subir cambios a GitHub
git push origin main
```

### Solución al cambio master → main

Si se crean dos ramas (`master` y `main`) en GitHub:

1. **Configuración en GitHub**

   - Ir a Settings del repositorio
   - Cambiar rama predeterminada a `main`
   - Eliminar rama `master`

2. **Configuración local**

   ```bash
   # Asegurarse de estar en main
   git checkout main

   # Verificar estado
   git status

   # Subir cambios a main
   git push origin main
   ```

> **Importante**: Asegúrate de que todos los colaboradores actualicen sus repositorios locales después del cambio.

### Recordatorios

1. Mantener respaldo de llaves SSH
2. Usar nombres descriptivos para las llaves
3. Verificar rama actual antes de commits
4. Mantener consistencia en nombres de ramas
5. Comunicar cambios de rama principal al equipo

## CLASE 3 SEGUNDO SEMESTRE MIÉRCOLES 28 DE AGOSTO DEL 2024

### Cambios en GitHub: de `master` a `main`

> "Las palabras tienen color y peso" - Julio Cortázar

Los sinónimos existen por definición, pero no expresan lo mismo. **Feo** no es lo mismo que **desagradable**, ni **aromático** es lo mismo que **oloroso**. Los sinónimos no tienen el mismo "color" ni el mismo "peso".

### Contexto del cambio

Desde el 1 de octubre de 2020, GitHub cambió el nombre de la rama principal de `master` a `main`. Este cambio surgió a raíz de una reflexión profunda, provocada por el movimiento **#BlackLivesMatter**.

La industria de la tecnología ha utilizado históricamente términos como:

- master
- slave
- blacklist
- whitelist

> **Importante**: La industria está trabajando activamente para eliminar esta terminología.

### Implementación actual

#### Repositorios locales

Cuando se crea un repositorio localmente con `git init`:

- La rama por defecto sigue siendo `master`
- Se debe cambiar manualmente a `main`

```bash
# Cambiar nombre de rama master a main
git branch -M main
```

#### Repositorios en GitHub

Cuando se crea un repositorio en GitHub:

- La rama por defecto ya es `main`
- Al clonar, mantiene el nombre `main`
- No requiere cambios adicionales

> **Nota**: De aquí en adelante, cuando se mencione "master" en documentación antigua, debe entenderse como "main".

### Recordatorios

1. Verificar nombre de rama al inicializar repositorios
2. Actualizar documentación antigua
3. Mantener consistencia en la terminología
4. Considerar el impacto de las palabras en la tecnología

## CLASE 4 SEGUNDO SEMESTRE MIÉRCOLES 4 DE SEPTIEMBRE DEL 2024

### Tu primer push con SSH

La creación de llaves SSH es necesaria solo una vez por computadora. Esta configuración te permite conectarte a GitHub de forma segura y sin necesidad de ingresar credenciales constantemente.

### Configuración de llave SSH en GitHub

1. **Acceder a configuración**

   - Ir a GitHub Settings
   - Seleccionar SSH Keys
   - Crear nueva llave
   - Pegar contenido de llave pública

2. **Actualizar URL del repositorio**

```sh
# Cambiar de HTTPS a SSH
git remote set-url origin url-ssh-del-repositorio-en-github
```

### Copiar llave SSH pública

```sh
# Mac
pbcopy < ~/.ssh/id_rsa.pub

# Windows (Git Bash)
clip < ~/.ssh/id_rsa.pub

# Linux (Ubuntu)
cat ~/.ssh/id_rsa.pub
```

> **Importante**: Antes de hacer push, siempre realizar pull o fetch para evitar conflictos con cambios de otros colaboradores.

### Gestión de Colaboradores

#### Invitar colaboradores

1. Acceder a Settings del repositorio
2. Seleccionar Collaborators
3. Verificar identidad (contraseña o 2FA)
4. Enviar invitación por nombre de usuario

#### Para colaboradores invitados

- Recibir invitación
- Aceptar invitación
- Comenzar a participar con commits

### Buenas Prácticas

1. Verificar cambios remotos antes de push
2. Mantener comunicación con colaboradores
3. Usar ramas para nuevas funcionalidades
4. Documentar cambios importantes
5. Revisar permisos de colaboradores periódicamente

> **Tip**: Mantén un registro de quién tiene acceso a tu repositorio y revisa periódicamente los permisos de colaboradores.

## CLASE 5 SEGUNDO SEMESTRE MIÉRCOLES 11 DE SEPTIEMBRE DEL 2024

### Git Tags y Versiones en GitHub

#### ¿Qué son los Git Tags?

Son etiquetas que se asignan a commits específicos en un repositorio Git. Estas etiquetas sirven como marcadores para identificar versiones importantes del proyecto, como releases, puntos de referencia o cualquier otro momento significativo.

#### ¿Por qué usar Git Tags?

1. **Facilitar la navegación**: Encontrar rápidamente commits específicos
2. **Gestionar versiones**: Rastrear cambios a lo largo del tiempo
3. **Identificar releases**: Señalizar versiones públicas del proyecto

### Tipos de Etiquetas

1. **Etiquetas anotadas**

   - Almacenan información adicional
   - Incluyen fecha, autor y correo
   - Ideales para releases públicos

2. **Etiquetas ligeras**
   - Más simples
   - Funcionan como marcadores
   - Para uso temporal o privado

### Comandos Básicos

```bash
# Crear nueva etiqueta
git tag v1.0

# Listar etiquetas existentes
git tag

# Listar con patrón específico
git tag -l "v1.*"

# Compartir etiquetas
git push origin nombre-de-la-etiqueta    # Una etiqueta
git push origin --tags                   # Todas las etiquetas

# Eliminar etiquetas
git tag -d nombre-de-la-etiqueta        # Local
git push origin :refs/tags/nombre-tag    # Remoto
```

### Buenas Prácticas

1. **Nomenclatura consistente**

   - Usar versionado semántico (v1.0.0)
   - Mantener formato consistente
   - Documentar convención usada

2. **Documentación**

   - Incluir notas de versión
   - Describir cambios importantes
   - Mencionar breaking changes

3. **Workflow**
   - Crear tags después de testing
   - Verificar antes de publicar
   - Mantener histórico de releases

> **Importante**: Las etiquetas no se envían automáticamente al repositorio remoto, deben enviarse explícitamente.

### Recordatorios

1. Usar tags para versiones estables
2. Documentar cambios significativos
3. Mantener consistencia en nombrado
4. Verificar antes de publicar
5. Comunicar cambios al equipo

> **Tip**: Considera usar versionado semántico (MAJOR.MINOR.PATCH) para tus tags.

## CLASE 8 SEGUNDO SEMESTRE MIÉRCOLES 2 DE OCTUBRE DEL 2024 - Portafolio 8

### Manejo de ramas en GitHub

Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas locales que nunca envías a GitHub, así como pueden existir ramas importantes en GitHub que nunca usas en el repositorio local.

### Instalación de gitk

Si el comando `gitk` no está disponible, instálalo con:

```sh
# Actualizar repositorios
sudo apt-get update

# Instalar gitk
sudo apt-get install gitk
```

### Funcionamiento de las Ramas

Características principales:

- Las modificaciones solo afectan a la rama actual
- Cada rama mantiene su propio historial
- Los cambios son independientes entre ramas
- Se pueden fusionar cuando sea necesario

> **Importante**: Al cambiar de rama, los archivos en tu directorio de trabajo cambiarán para reflejar el estado de la rama seleccionada.

### Comandos Básicos para Ramas

```sh
# Crear nueva rama
git branch branchName

# Cambiar a una rama
git checkout branchName

# Crear y cambiar a nueva rama (combinado)
git checkout -b nombre-de-la-rama

# Publicar rama en repositorio remoto
git push origin nombre-de-la-rama
```

### Visualización del Flujo de Trabajo

`gitk` es el primer visor gráfico desarrollado para Git:

- Muestra el historial del repositorio
- Permite ver las ramificaciones
- Facilita el entendimiento del flujo de trabajo

### Buenas Prácticas

1. **Nombrado de ramas**

   - Usar nombres descriptivos
   - Seguir convenciones del equipo
   - Incluir tipo de cambio (feature/, bugfix/, etc.)

2. **Gestión de ramas**
   - Mantener ramas actualizadas
   - Eliminar ramas obsoletas
   - Documentar propósito de cada rama

> **Tip**: Usa `gitk` para visualizar mejor la estructura de tu repositorio y entender el flujo de trabajo.

### Recordatorios

1. Verificar rama actual antes de hacer cambios
2. Mantener main/master limpia y estable
3. Crear ramas para nuevas características
4. Probar cambios antes de fusionar
5. Comunicar cambios al equipo

## CLASE 9 SEGUNDO SEMESTRE MIÉRCOLES 9 DE OCTUBRE DEL 2024

## Configurar múltiples colaboradores en un repositorio de GitHub

### Introducción

Por defecto, en repositorios públicos cualquier persona puede clonar o descargar el proyecto, pero no pueden crear commits ni ramas. En repositorios privados, se requiere una invitación explícita incluso para ver el contenido.

### Gestión de Colaboradores

#### Agregar colaboradores

1. Acceder a configuración del repositorio
2. Settings → Collaborators
3. Añadir colaborador por email o username
   > **Importante**: El colaborador debe tener email o username público

### Flujo de trabajo para colaboradores

#### Configuración inicial

```bash
# Preparar directorio de trabajo
cd Documentos
mkdir class-git
ls -al

# Clonar repositorio (no usar git init)
git clone url-copiada-github

# Abrir editor
code .    # Para VSCode
vim historia.txt    # Para edición en terminal
```

#### Realizar cambios

```bash
# Verificar estado y crear commit
git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"

# Sincronizar cambios
git pull origin main
git fetch

# Verificar ramas y historia
git branch    # Ver ramas disponibles
git log       # Ver historial
git log --graph    # Ver historial gráfico
```

### Solución de problemas comunes

#### Corregir mensaje de commit

```bash
# Modificar último mensaje de commit
git commit --amend
git pull origin main
git push --set-upstream origin main
```

#### Acceso denegado

Si recibe error de acceso:

1. El dueño debe agregar al colaborador en GitHub
2. Colaborador debe aceptar invitación
3. Intentar push nuevamente

### Verificación de cambios

```bash
# Para el dueño del repositorio
git pull origin main
git fetch
git log --stat    # Ver detalles de cambios
```

### Buenas Prácticas

1. **División del trabajo**

   - Asignar ramas específicas (ej: header, footer)
   - Coordinar merges
   - Mantener comunicación clara

2. **Sincronización**
   - Pull frecuente de cambios
   - Verificar estado antes de push
   - Resolver conflictos temprano

> **Tip**: Establecer convenciones de nombrado de ramas y commits desde el inicio del proyecto.

### Recordatorios

1. Colaboradores necesitan aceptar invitación
2. Verificar permisos antes de comenzar
3. Mantener repositorio actualizado
4. Documentar cambios importantes
5. Coordinar trabajo en ramas diferentes

## CLASE 10 SEGUNDO SEMESTRE MIÉRCOLES 16 DE OCTUBRE DEL 2024 - Portafolio 10

### Flujo de trabajo profesional: Merge de ramas de desarrollo a main

Para desarrollar software de manera óptima y ordenada, es necesario implementar un flujo de trabajo profesional que permita la colaboración sin interferencias entre desarrolladores.

### Proceso de trabajo recomendado

1. **Preparación inicial**

   - Crear ramas de desarrollo
   - Asignar ramas a desarrolladores
   - Establecer convenciones de nombrado

2. **Flujo por desarrollador**

```bash
# Sincronizar con repositorio
git pull origin main

# Cambiar a rama asignada
git checkout nombre-rama

# Realizar cambios y commits
git add .
git commit -m "Descripción de cambios"

# Subir cambios a remoto
git push origin nombre-rama
```

3. **Gestión de integración**
   - Revisor descarga cambios
   - Verifica funcionamiento
   - Realiza merge a main

### Roles y responsabilidades

1. **Desarrolladores**

   - Trabajar en rama asignada
   - Mantener rama actualizada
   - Documentar cambios
   - Resolver conflictos locales

2. **Integrador**
   - Revisar pull requests
   - Verificar funcionalidad
   - Gestionar merges
   - Mantener main estable

### Buenas Prácticas

1. **Control de versiones**

   - Commits descriptivos
   - Ramas actualizadas
   - Pull requests detallados
   - Revisión de código

2. **Comunicación**
   - Reportar problemas
   - Documentar decisiones
   - Coordinar merges
   - Mantener equipo informado

> **Importante**: Cada rama debe tener un propósito específico y documentado.

### Recordatorios

1. Mantener main siempre estable
2. Probar cambios antes de merge
3. Seguir convenciones de equipo
4. Documentar cambios significativos
5. Comunicar problemas temprano

> **Tip**: Establecer reuniones regulares de sincronización para coordinar merges y resolver conflictos.

## CLASE 11 SEGUNDO SEMESTRE MIÉRCOLES 23 DE OCTUBRE DEL 2024 - Portafolio 11

### Flujo de trabajo profesional: Archivos binarios

### Problemática con archivos binarios

Los archivos binarios, especialmente las imágenes, presentan varios desafíos en Git:

1. **Peso del repositorio**

   - Las imágenes son archivos pesados
   - Cada commit mantiene una copia
   - El repositorio crece innecesariamente

2. **Limitaciones técnicas**
   - Límite de 100MB por archivo
   - Restricciones en commits
   - Problemas de sincronización

### Impacto en el rendimiento

1. **Sincronización**

   - Mayor tiempo de clonación
   - Pulls más lentos
   - Mayor uso de ancho de banda

2. **Almacenamiento**
   - Crecimiento exponencial del repo
   - Copias redundantes
   - Dificultad para limpiar historial

### Buenas Prácticas

1. **Gestión de imágenes**

   - Usar servicios externos de almacenamiento
   - Optimizar tamaño de imágenes
   - Mantener solo recursos necesarios

2. **Alternativas recomendadas**
   - CDNs para imágenes
   - Servicios de almacenamiento cloud
   - Referencias externas en documentación

### Soluciones comunes

1. **Para imágenes**

   - Usar servicios como Cloudinary
   - Implementar CDN
   - Optimizar antes de subir

2. **Para archivos grandes**
   - Utilizar Git LFS
   - Almacenamiento externo
   - Enlaces simbólicos

> **Importante**: Evitar commits con archivos que se acerquen al límite de 100MB.

### Recordatorios

1. Revisar tamaño de archivos antes de commit
2. Optimizar recursos binarios
3. Usar alternativas para archivos grandes
4. Documentar uso de servicios externos
