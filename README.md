# spring-docker-sample

- Here in mysql sample
  - We create a network
  - map both the spring boot and mysql to point to same network
  - run *docker-compose up*
  
  
  You are free to edit any no of times the docker-compose.yaml file and make the changes and run.


!!Notes!!

	•  docker run -it -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql  -  This will run the mysql with latest i.e. 8 else  use advanced version for specific tag and mount volume
		docker run -p3306:3306 -v mysql-volume:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql/mysql-server:8.0.20 
		From <https://hub.docker.com/_/mysql> 
	•  clear
	•  docker container ls
	•  docker container exec -it 5e bash
		○ bash-4.2# mysql -pmy-secret-pw
	• This link was helpful in connecting to Mysql running in docker
		○ https://codehandbook.org/how-to-connect-to-mysql-running-in-docker-container-from-localhost/
		○ https://stackoverflow.com/questions/50379839/connection-java-mysql-public-key-retrieval-is-not-allowed/59778108#59778108
	• To inspect container
		○ docker container inspect <container_ID>
	• I have uploaded am image to its easy to run it from anywhere
		• docker container run -p8080:8080 vikramsvk/spring-boot-docker-sample-vik
![image](https://user-images.githubusercontent.com/70604290/132095839-dddc800a-8f2e-48b2-92b1-cee3890b1b38.png)
