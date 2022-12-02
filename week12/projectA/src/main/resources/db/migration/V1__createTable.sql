
CREATE TABLE IF NOT EXISTS product2 (
    id		       INT          PRIMARY KEY  AUTO_INCREMENT,
    id_category    INT          NOT NULL,
    product_name   VARCHAR(30)  UNIQUE       NOT NULL,
    weight		   VARCHAR(20),
    cost		   VARCHAR(20)
);

ALTER TABLE product
ADD CONSTRAINT  fk_id_category FOREIGN KEY (categoryId) REFERENCES category(id)
ON UPDATE CASCADE;