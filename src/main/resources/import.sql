INSERT INTO `db_springboot_backend`.`useraccount` (`id`, `password`,`username`) VALUES ('1', '1234','admin');

INSERT INTO `db_springboot_backend`.`useraccount` (`id`,`password`,`username`) VALUES ('2', '1235','alum');

INSERT INTO `db_springboot_backend`.`useraccount` (`id`, `password`,`username`) VALUES ('3', '1236','prof');

INSERT INTO `db_springboot_backend`.`curso` (`id`, `nombre`) VALUES ('1', 'PRIMERO');

INSERT INTO `db_springboot_backend`.`curso` (`id`, `nombre`) VALUES ('2', 'SEGUNDO');

INSERT INTO `db_springboot_backend`.`curso` (`id`, `nombre`) VALUES ('3', 'TERCERO');

INSERT INTO `db_springboot_backend`.`curso` (`id`, `nombre`) VALUES ('4', 'CUARTO');

INSERT INTO `db_springboot_backend`.`curso` (`id`, `nombre`) VALUES ('5', 'QUINTO');

INSERT INTO `db_springboot_backend`.`foro` (`id`, `comentarios`) VALUES ('1', 'Que esta pasando aqui');

INSERT INTO `db_springboot_backend`.`foro` (`id`, `comentarios`) VALUES ('2', 'Este profesor no sabe explicar');

INSERT INTO `db_springboot_backend`.`foro` (`id`, `comentarios`) VALUES ('3', 'Alguien que haya aprobado la asignatura con él');

INSERT INTO `db_springboot_backend`.`foro` (`id`, `comentarios`) VALUES ('4', 'no tengo ni idea');

INSERT INTO `db_springboot_backend`.`foro` (`id`, `comentarios`) VALUES ('5', 'Esto es complicado');

INSERT INTO `db_springboot_backend`.`espacio` (`id`,`precio`, `asignatura_id`,`foro_id`,`profesor_id`) VALUES ('1','10.0',  '1','1','1');

INSERT INTO `db_springboot_backend`.`espacio` (`id`,`precio`, `asignatura_id`,`foro_id`,`profesor_id`) VALUES ('2','10.0',  '2','2','2');

INSERT INTO `db_springboot_backend`.`espacio` (`id`,`precio`, `asignatura_id`,`foro_id`,`profesor_id`) VALUES ('3','10.0', '3','3','3');

INSERT INTO `db_springboot_backend`.`espacio` (`id`,`precio`, `asignatura_id`,`foro_id`,`profesor_id`) VALUES ('4','10.0', '4','4','4');

INSERT INTO `db_springboot_backend`.`espacio`(`id`,`precio`, `asignatura_id`,`foro_id`,`profesor_id`) VALUES ('5','10.0',  '5','5','5');

INSERT INTO `db_springboot_backend`.`grado` (`id`, `nombre`) VALUES ('1', 'Ingeniería del Software');

INSERT INTO `db_springboot_backend`.`grado` (`id`, `nombre`) VALUES ('2', 'Ingeniería de Computadores');

INSERT INTO `db_springboot_backend`.`grado` (`id`, `nombre`) VALUES ('3', 'Tecnología Informática');

INSERT INTO `db_springboot_backend`.`grado` (`id`, `nombre`) VALUES ('4', 'Administración de Empresas');

INSERT INTO `db_springboot_backend`.`grado` (`id`, `nombre`) VALUES ('5', 'Antropología');

INSERT INTO `db_springboot_backend`.`universidad` (`id`, `nombre`) VALUES ('1', 'Escuela Técnica Superior de Informatica');

INSERT INTO `db_springboot_backend`.`universidad` (`id`, `nombre`) VALUES ('2', 'Universidad de Sevilla');

INSERT INTO `db_springboot_backend`.`universidad` (`id`, `nombre`) VALUES ('3', 'Facultad Geografia e Historia');

INSERT INTO `db_springboot_backend`.`asignatura` (`id`, `nombre`,`curso_id`,`universidad_id`) VALUES ('1', 'Fundamentos de la Programacion','1','1');

INSERT INTO `db_springboot_backend`.`asignatura` (`id`, `nombre`,`curso_id`,`universidad_id`) VALUES ('2', 'Estructura de Computadores','2','1');

INSERT INTO `db_springboot_backend`.`asignatura` (`id`, `nombre`,`curso_id`,`universidad_id`) VALUES ('3', 'Fundamentos Físicos de la Informatica','3','1');

INSERT INTO `db_springboot_backend`.`asignatura` (`id`, `nombre`,`curso_id`,`universidad_id`) VALUES ('4', 'Diseño y Pruebas 1','1');

INSERT INTO `db_springboot_backend`.`asignatura` (`id`, `nombre`,`curso_id`,`universidad_id`) VALUES ('5', 'Diseño y Pruebas 2','1');


INSERT INTO `db_springboot_backend`.`persona` (`id`, `apellidos`,`dni`, `email`,`nombre`, `telefono`,`grado_id`,`universidad_id`) VALUES (`1`, `Romero Cáceres`,`47542120R`, `antromcac@alum.us.es`,`Antonio`, `955792204`,`1`,`1`);

INSERT INTO `db_springboot_backend`.`persona` (`id`, `apellidos`,`dni`, `email`,`nombre`, `telefono`,`grado_id`,`universidad_id`) VALUES (`2`, `Romero Cáceres`,`47542121R`, `anaromcac@alum.us.es`,`Ana`, `955792204`,`3`,`1`);

INSERT INTO `db_springboot_backend`.`persona` (`id`, `apellidos`,`dni`, `email`,`nombre`, `telefono`,`grado_id`,`universidad_id`) VALUES (`3`, `Rojas Gutierrez`,`97143120Z`, `rojasgutierrez@hotmail.com`,`Rodrigo`, `954792214`,`1`,`1`);

INSERT INTO `db_springboot_backend`.`persona` (`id`, `apellidos`,`dni`, `email`,`nombre`, `telefono`,`grado_id`,`universidad_id`) VALUES (`4`, `Jimenez Ruiz`,`87542121E`, `romeroruiz@hotmail.com`,`Jesus`, `603552641`,`2`,`1`);

INSERT INTO `db_springboot_backend`.`persona` (`id`, `apellidos`,`dni`, `email`,`nombre`, `telefono`,`grado_id`,`universidad_id`) VALUES (`5`, `Mauri Mitchell`,`37242182z`, `maurimitc@gmail.com`,`Cristian`, `954792219`,`5`,`3`);

INSERT INTO `db_springboot_backend`.`valoracion` (`id`, `comentario`,`valoracion`) VALUES ('1', 'Para nada bien','1');

INSERT INTO `db_springboot_backend`.`valoracion` (`id`, `comentario`,`valoracion`) VALUES ('2', 'No daria clases con él','2');

INSERT INTO `db_springboot_backend`.`valoracion` (`id`, `comentario`,`valoracion`) VALUES ('3', 'Muy buenos resultados obtenidos con él','4');

INSERT INTO `db_springboot_backend`.`valoracion` (`id`, `comentario`,`valoracion`) VALUES ('4', 'Aceptable','3');

INSERT INTO `db_springboot_backend`.`valoracion` (`id`, `comentario`,`valoracion`) VALUES ('5', 'Perfecto me ha ayudado en todo momento','5');



