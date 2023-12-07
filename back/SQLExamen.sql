use examen;

DROP table IF EXISTS EstadoTarea;
CREATE TABLE EstadoTarea (
    id int,
    estado VARCHAR(50) not null,
    primary key(id)
);

DROP table IF EXISTS Usuario;
CREATE TABLE Usuario (
    id int,
    usuario VARCHAR(20) not null,
    nombre VARCHAR(50) not null,
     primary key(id)
);

DROP table IF EXISTS Tarea;
CREATE TABLE Tarea (
    id int,
    titulo VARCHAR(20) not null,
    descripcion VARCHAR(50) not null,
    fecha_creacion date not null,
    estado_tarea_id int,
    usuario_id int,
      primary key(id),
	FOREIGN KEY (estado_tarea_id) REFERENCES EstadoTarea(id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);


INSERT INTO EstadoTarea (ID, ESTADO) VALUES (1, 'Pendiente');
INSERT INTO EstadoTarea (ID, ESTADO) VALUES (2, 'En progreso');
INSERT INTO EstadoTarea (ID, ESTADO) VALUES (3, 'Completada');