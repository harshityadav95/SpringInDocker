

# Spring in Docker Application

A sample Spring Boot API application to perform CRUD API operations and build into a docker image 






## CRUD API. 

#### Create API

```
GET/    localhost:8080/addItem

# Body> RAW > JSON

{
    "trackingnumbner" :1,
    "destinationaddress": "delhi",
    "senderaddress":"karnataka",
    "weight":0.2,
    "priority" :1

}

```

### Read API

```
GET/ locahost:8080/allItems

# List All Items

```

```

Get/  localhost:8080/item/{id}

id = trackingnumber of the order

```

```

Get/ localhost:8080

# It will display "It Works" if the app is working"

```

### Update API

```
PUT/ localhost:8080/updateItem/

# Body> RAW > JSON
# udpated value of existing record

{
    "trackingnumbner" :2,
    "destinationaddress": "Kerla",
    "senderaddress":"karnataka",
    "weight":0.2,
    "priority" :1
}
```

### Delete API

```
DELETE/ localhost:8080/deleteItem/{id}

id= ID of the value to be deleted
```













