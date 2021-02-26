Coverage: 64.1%

Inventory Management System

A system built for my client to Manage Customers, Items and Orders in the system. User can create, read, update and delete customers, items and orders in the system. 

## Getting Started

The program will start with 'What entities would you like to use?' and from there you can choose Customer, Item, Order. You can start the program by typing in entity name you would like to edit and once it's done you can type 'READ' to see if the correct data is added to the system. 

### Prerequisites

Java 1.8 MySQL Server Version
Mysql Server 5.7

### Installing
Open command line and follow the commands below:

Mkdir IMS

cd IMS

git clone https://github.com/BerkanQA/IMS-Starter.git

cd IMS-Starter

mvn package

cd target

java -jar ims-0.0.1-jar-with-dependencies


## Running the tests

git clone https://github.com/BerkanQA/IMS-Starter.git

cd IMS-Starter

mvn package

mvn test

### Unit Tests 

Unit Test can be runned by using mvn test and it will show how many tests has run and which has failed and has errors.


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Berkan Irice** - *Completed application* [BerkanQA]https://github.com/BerkanQA/IMS-Starter
## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* I would like to thank Jordan Harrison for creating and sharing the source code to run up the application
* I would like to thank Edward Reynolds for the help provided throughout the project 
