DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `customers`;
DROP TABLE IF EXISTS `items`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) DEFAULT NULL,
    `price` FLOAT(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `orders` (
    `orderid` INT(11) NOT NULL AUTO_INCREMENT,
    `customerid` INT(11) NOT NULL,
    `itemid` INT(11) NOT NULL,
    `quantity` INT(15) NOT NULL,
    PRIMARY KEY(orderid),
    FOREIGN KEY(customerid) REFERENCES customers(id),
    FOREIGN KEY(itemid) REFERENCES items(id)
);