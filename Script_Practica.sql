/*DROP SCHEMA practica;
DROP USER usuario_practica;*/

CREATE SCHEMA `practica`;

CREATE TABLE `practica`.`estado` (`id_estado` INT NOT NULL AUTO_INCREMENT, `nombre` VARCHAR(30) NOT NULL, `capital` VARCHAR(50) NOT NULL,
`habitantes` VARCHAR(50) NULL, `continente` VARCHAR(15) NULL, PRIMARY KEY (`id_estado`))
ENGINE = innoDB;

/*Insertar 3 registros*/
INSERT INTO `practica`.`estado` (`nombre`, `capital`, `habitantes`, `continente`)
	VALUES ('China', 'Pekín', '1 415 943 000', 'Asia');
    
INSERT INTO `practica`.`estado` (`nombre`, `capital`, `habitantes`, `continente`)
	VALUES ('China', 'Pekín', '1 415 943 000', 'Asia');
    
INSERT INTO `practica`.`estado` (`nombre`, `capital`, `habitantes`, `continente`)
	VALUES ('China', 'Pekín', '1 415 943 000', 'Asia');
    
INSERT INTO `practica`.`estado` (`nombre`, `capital`, `habitantes`, `continente`)
	VALUES ('China', 'Pekín', '1 415 943 000', 'Asia');

/* Crear un usuario */
CREATE USER 'usuario_practica' @'%' IDENTIFIED BY 'la_Clave';

/* Se asignan los priviliegios */
GRANT ALL PRIVILEGES ON practica.* to 'usuario_practica';
flush privileges;