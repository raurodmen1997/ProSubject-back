INSERT INTO `useraccounts` (`password`,`username`) VALUES ('admin','admin');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('alum1','alum1');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('alum2','alum2');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('alum3','alum3');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('alum4','alum4');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('prof1','prof1');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('prof2','prof2');
INSERT INTO `useraccounts` (`password`,`username`) VALUES ('prof3','prof3');


INSERT INTO `db_springboot_backend`.`administradores` (`id`, `apellido1`, `apellido2`, `dni`, `email`, `nombre`, `telefono`, `useraccount_id`) VALUES ('1', 'Romero', 'Caceres', '4754620Y', 'antromcac@alum.us.es', 'Antonio', '603552741', '1');

INSERT INTO `cursos` (`nombre`) VALUES ('PRIMERO');
INSERT INTO `cursos` (`nombre`) VALUES ('SEGUNDO');
INSERT INTO `cursos` (`nombre`) VALUES ('TERCERO');
INSERT INTO `cursos` (`nombre`) VALUES ('CUARTO');
INSERT INTO `cursos` (`nombre`) VALUES ('QUINTO');


INSERT INTO `grados` (`nombre`) VALUES ('Ingeniería del Software');
INSERT INTO `grados` (`nombre`) VALUES ('Ingeniería de Computadores');
INSERT INTO `grados` (`nombre`) VALUES ('Tecnología informática');
INSERT INTO `grados` (`nombre`) VALUES ('Administración de Empresas');
INSERT INTO `grados` (`nombre`) VALUES ('Antropología');

INSERT INTO `universidades` (`nombre`) VALUES ('Universidad de Sevilla');
INSERT INTO `universidades` (`nombre`) VALUES ('Universidad Pablo de Olavide');

INSERT INTO `db_springboot_backend`.`profesores` (`id`, `apellido1`, `apellido2`,`dni`,`email`, `nombre`, `useraccount_id`) VALUES ('1', 'Romero ', 'Organvidez','47543218R','drorganvidez@gmail.com', 'David', '6');

INSERT INTO `db_springboot_backend`.`profesores` (`id`, `apellido1`, `apellido2`,`dni`,`email`, `nombre`, `useraccount_id`) VALUES ('2', 'Rojas', 'Gutierrez','47546231T', 'rodrojgut@alum.us.es', 'Rodrigo', '7');

INSERT INTO `db_springboot_backend`.`profesores` (`id`, `apellido1`, `apellido2`,`dni`,`email`, `nombre`, `useraccount_id`) VALUES ('3', 'Carillo', 'Mirando', '47546221z','fcarmir@gmail.com', 'Fernando', '8');

INSERT INTO `db_springboot_backend`.`alumnos` (`id`, `apellido1`, `apellido2`, `dni`, `email`, `nombre`, `telefono`, `useraccount_id`) VALUES ('1', 'Carillo', 'Mirando', '47546221Z', 'fcarmir@gmail.com', 'Fernando', '123456749', '2');
INSERT INTO `db_springboot_backend`.`alumnos` (`id`, `apellido1`, `apellido2`, `dni`, `email`, `nombre`, `telefono`, `useraccount_id`) VALUES ('2', 'Rojas', 'Gutierrez', '47546231T', 'rodrojgut@alum.us.es', 'Rodrigo', '123456789', '3');
INSERT INTO `db_springboot_backend`.`alumnos` (`id`, `apellido1`, `apellido2`, `dni`, `email`, `nombre`, `telefono`, `useraccount_id`) VALUES ('3', 'Romero', 'Caceres', '47546251Y', 'anaromcac@alum.us.es', 'Ana', '603552740', '4');

