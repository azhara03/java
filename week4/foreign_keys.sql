ALTER TABLE product 
ADD CONSTRAINT  fk_id_category FOREIGN KEY (id_category) REFERENCES category(id)
ON UPDATE CASCADE;

ALTER TABLE sales
ADD CONSTRAINT fk_id_customer FOREIGN KEY (id_customer) REFERENCES customer(id),
ADD CONSTRAINT fk_id_employee FOREIGN KEY (id_employee) REFERENCES employee(id),
ADD CONSTRAINT fk_id_product FOREIGN KEY (id_product) REFERENCES product(id)
ON UPDATE CASCADE;