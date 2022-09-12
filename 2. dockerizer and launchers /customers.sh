#1.- Configurando Maven
source .bash_profile
#2.- Posicionando en la carpeta del proyecto
cd ../customers
#3.- Compilar y generar el archivo .jar que será el launcher de la aplicación en docker
mvn clean install -DskipTests
echo "JAR generado"
#4.- Containerización de la aplicación, utilizando el archivo Dockerfile
docker build -t customers .
echo "IMAGEN creada"
#5.- Ejecución del contenedor especificandole el puerto que tendrá habilitado
docker run -p 5052:5052 -d --name lpaz/customers customers
