# Example GraphQL Springboot App


To add a vehicle
````
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}
```

To get a vehicle
````
query {
  vehicle(id: "2854b849-68b9-445a-b706-b0b51d5c872c") {
    type
  }
}
```
