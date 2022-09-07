#Springboot Device Seller Test App
***

## Endpoints

### Register
````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 77

{
"name": "admin",
"username": "admin",
"password": "admin"
}
````

### Sign In
````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 55

{
    "username": "admin",
    "password": "admin"
}
````

### Change Role
````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDg1MzUyNzJ9.HDYnM1MWDNOIdbDep7H2AeeXYUijVMVTQHv0vkIjV8HPRgsieUrftktpGgPHO79AlqlUBS4ES927YR_YM-2uew
````

### Save Device
````
POST /api/device/ HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4NTM3MjIyfQ.R6lcyBrJskhCZFOqs2RvimX2o6pKjGqbPiFZKlSZ5vX5NwEK15mHYAo7T0aM7PVGTAv3X7EAXzOpQTFHoYjlsg
Content-Type: application/json
Content-Length: 111

{
    "name": "device-1",
    "description": "description-1",
    "price": 9,
    "deviceType": "LAPTOP"
}
````

### Get All Device
````
POST /api/device/ HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4NTM3MjIyfQ.R6lcyBrJskhCZFOqs2RvimX2o6pKjGqbPiFZKlSZ5vX5NwEK15mHYAo7T0aM7PVGTAv3X7EAXzOpQTFHoYjlsg
Content-Type: application/json
Content-Length: 111

{
    "name": "device-1",
    "description": "description-1",
    "price": 9,
    "deviceType": "LAPTOP"
}
````

### Delete Device
````
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4NTM3MjIyfQ.R6lcyBrJskhCZFOqs2RvimX2o6pKjGqbPiFZKlSZ5vX5NwEK15mHYAo7T0aM7PVGTAv3X7EAXzOpQTFHoYjlsg
````

### Save Purchase
````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4NTM3MjIyfQ.R6lcyBrJskhCZFOqs2RvimX2o6pKjGqbPiFZKlSZ5vX5NwEK15mHYAo7T0aM7PVGTAv3X7EAXzOpQTFHoYjlsg
Content-Type: application/json
Content-Length: 80

{
    "userId": 2,
    "deviceId": 3,
    "price": 9,
    "color": "blue"
}
````

### Get ALl Purchases
````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4NTM3MjIyfQ.R6lcyBrJskhCZFOqs2RvimX2o6pKjGqbPiFZKlSZ5vX5NwEK15mHYAo7T0aM7PVGTAv3X7EAXzOpQTFHoYjlsg
````
