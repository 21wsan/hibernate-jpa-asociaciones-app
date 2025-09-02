INSERT INTO clientes (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (1,'Andres','Guzman','debito',NULL,NULL),(2,'John','Doe','credito',NULL,NULL),(4,'Pepa','Deo','debito',NULL,NULL),(5,'Lucy','Martinez','credito',NULL,NULL),(6,'Luna','Garcia','debito',NULL,NULL),(7,'John','Roe','paypal',NULL,NULL),(8,'Lee','Loe','paypal',NULL,NULL),(9,'Lalo','Mena','WebPay','2025-08-21 12:41:48','2025-08-21 12:44:04'),(10,'Ana Sofia','Enao','paypal plus','2025-08-21 15:57:53','2025-08-21 16:13:11');
INSERT INTO alumnos (id, nombre, apellido) VALUES (1, 'Johana', 'Banana');
INSERT INTO alumnos (id, nombre, apellido) VALUES (2, 'Pepe', 'el Pollo');
INSERT INTO cursos (id, titulo, profesor) VALUES (1, 'Curso Spring', 'Andres G.');
INSERT INTO cursos (id, titulo, profesor) VALUES (2, 'Curso Java EE', 'Andres G.');
insert into direcciones (calle, numero) values ('Calle Falsa', 123);
insert into direcciones (calle, numero) values ('Skypiea', 456);
insert into tbl_cliente_direcciones(id_cliente, id_direccion) values (1, 1);
insert into tbl_cliente_direcciones(id_cliente, id_direccion) values (1, 2);