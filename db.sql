drop DATABASE if EXISTS carwash;
create DATABASE carwash;
use carwash;

create table tipo_cliente(
    id_tipo_cliente integer AUTO_INCREMENT PRIMARY KEY,
    descripcion varchar(20)
);
create table clientes(
    codigo_cliente int AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(20),
    apellido varchar(20),
    fechaIngreso date,
    id_tipo_cliente int,
    constraint fk_cliente_tipo_cliente FOREIGN KEY(id_tipo_cliente) REFERENCES tipo_cliente(id_tipo_cliente)
);
create table tipo_vehiculo(
    id_tipo_vehiculo int AUTO_INCREMENT PRIMARY KEY,
    descripcion varchar(20),
    precio_x_hora decimal(10,2)
);
  
create table vehiculo(
    id_vehiculo int AUTO_INCREMENT PRIMARY KEY,
    marca varchar(20),
    anio int,
    disponible TINYINT,
    id_tipo_vehiculo int,
    CONSTRAINT fk_vehiculo_tipo FOREIGN key(id_tipo_vehiculo) REFERENCES tipo_vehiculo(id_tipo_vehiculo)
);

create table reserva(
    id_reserva int AUTO_INCREMENT PRIMARY KEY,
    id_cliente int,
    id_vehiculo int,
    fecha date,
    dias int,
    total decimal(12,2),    
    CONSTRAINT fk_reserva_cliente FOREIGN KEY(id_cliente) REFERENCES clientes
    (codigo_cliente),
    CONSTRAINT fk_reserva_vehiculo FOREIGN KEY(id_vehiculo) REFERENCES vehiculo(id_vehiculo)
);