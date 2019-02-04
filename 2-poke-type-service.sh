#/bin/bash


if [ $# -eq 0 ]
	then
		echo "No port was provided"
		exit 1
fi

cd pokemon-type-service
mvn spring-boot:run -Drun.arguments=--server.port=$1

