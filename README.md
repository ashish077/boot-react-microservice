# boot-react-microservice
A student dashboard build using react for frontend which consumes two rest APIs to dispay the student data. 
##Requirements
1. Java-1.8.x
2. Spring-boot: 2.3.4
3. mysql : 5.x.x
4. React: 16.13.x

##Steps to Setup
**1. clone the branch**
```bash
git clone https://github.com/ashish077/boot-react-microservice.git
```

**2. Create mysql database for student and book**
run the included database queries in the db.

**3. install relevant frontend tools**
```bash
npm install
```
**4. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**5. Build and run the app both frontend and backend APIs**
##for frontend
```bash
nvm start
```
##for backend
run the two APIs from the editor

The app will start running at <http://localhost:3000>.
