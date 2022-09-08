#1.- Configurando Maven
source .bash_profile
#2.- Posicionando en la carpeta del proyecto
cd ../discovery-service
#3.- Compilar y generar el archivo .jar que será el launcher de la aplicación en docker
mvn clean install
echo "JAR generado"
#4.- Containerización de la aplicación, utilizando el archivo Dockerfile
docker build -t discovery-service .
echo "IMAGEN creada"
#5.- Ejecución del contenedor especificandole el puerto que tendrá habilitado
docker run -p 8761:8761 discovery-service
