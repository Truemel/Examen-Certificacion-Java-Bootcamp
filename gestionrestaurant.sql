CREATE DATABASE restaurant;
Use restaurant;

CREATE TABLE Mesa (
  ID INT PRIMARY KEY,
  Numero INT,
  Capacidad INT,
  Ubicacion VARCHAR(255)
);

CREATE TABLE Camarero (
  ID INT PRIMARY KEY,
  Nombre VARCHAR(255),
  Edad INT,
  Fecha_Inicio DATE
);

CREATE TABLE Plato (
  ID INT PRIMARY KEY,
  Nombre VARCHAR(255),
  Descripcion VARCHAR(255),
  Precio DECIMAL(5,2),
  Categoria VARCHAR(255)
);

CREATE TABLE Pedido (
  ID INT PRIMARY KEY,
  Mesa_ID INT,
  Camarero_ID INT,
  Fecha DATE,
  Total DECIMAL(5,2),
  FOREIGN KEY (Mesa_ID) REFERENCES Mesa(ID),
  FOREIGN KEY (Camarero_ID) REFERENCES Camarero(ID)
);

CREATE TABLE Detalle_Pedido (
  Pedido_ID INT,
  Plato_ID INT,
  Cantidad INT,
  Subtotal DECIMAL(5,2),
  PRIMARY KEY (Pedido_ID, Plato_ID),
  FOREIGN KEY (Pedido_ID) REFERENCES Pedido(ID),
  FOREIGN KEY (Plato_ID) REFERENCES Plato(ID)
);

-- Insertar mesas
INSERT INTO Mesa VALUES (1, 1, 4, 'Interior');
INSERT INTO Mesa VALUES (2, 2, 2, 'Interior');
INSERT INTO Mesa VALUES (3, 3, 6, 'Exterior');
INSERT INTO Mesa VALUES (4, 4, 2, 'Exterior');
INSERT INTO Mesa VALUES (5, 5, 4, 'Interior');

-- Insertar camareros
INSERT INTO Camarero VALUES (1, 'Juan', 25, '2022-01-01');
INSERT INTO Camarero VALUES (2, 'Ana', 30, '2020-06-01');
INSERT INTO Camarero VALUES (3, 'Pedro', 22, '2023-05-01');
INSERT INTO Camarero VALUES (4, 'Sofia', 27, '2021-02-01');
INSERT INTO Camarero VALUES (5, 'Luis', 32, '2019-08-01');

-- Insertar platos
INSERT INTO Plato VALUES (1, 'Ensalada César', 'Lechuga, pollo, queso parmesano, aderezo césar', 7.50, 'Entrada');
INSERT INTO Plato VALUES (2, 'Burger Clásica', 'Carne de res, queso, lechuga, tomate', 10.00, 'Plato principal');
INSERT INTO Plato VALUES (3, 'Tarta de manzana', 'Tarta de manzana con una bola de helado de vainilla', 5.00, 'Postre');
INSERT INTO Plato VALUES (4, 'Sopa de tomate', 'Sopa de tomate con albahaca y croutons', 6.00, 'Entrada');
INSERT INTO Plato VALUES (5, 'Pasta carbonara', 'Spaghetti, huevo, queso parmesano, panceta', 9.00, 'Plato principal');

-- Insertar pedidos
INSERT INTO Pedido VALUES (1, 1, 1, '2023-07-01', 17.50);
INSERT INTO Pedido VALUES (2, 2, 2, '2023-07-02', 15.00);
INSERT INTO Pedido VALUES (3, 3, 3, '2023-07-03', 22.50);
INSERT INTO Pedido VALUES (4, 4, 4, '2023-07-04', 14.00);
INSERT INTO Pedido VALUES (5, 5, 5, '2023-07-05', 19.00);

-- Insertar detalles de los pedidos
INSERT INTO Detalle_Pedido VALUES (1, 1, 1, 7.50);
INSERT INTO Detalle_Pedido VALUES (1, 2, 1, 10.00);
INSERT INTO Detalle_Pedido VALUES (2, 4, 1, 6.00);
INSERT INTO Detalle_Pedido VALUES (2, 5, 1, 9.00);
INSERT INTO Detalle_Pedido VALUES (3, 1, 1, 7.50);
INSERT INTO Detalle_Pedido VALUES (3, 2, 1, 10.00);
INSERT INTO Detalle_Pedido VALUES (3, 3, 1, 5.00);
INSERT INTO Detalle_Pedido VALUES (4, 4, 1, 6.00);
INSERT INTO Detalle_Pedido VALUES (4, 5, 1, 9.00);
INSERT INTO Detalle_Pedido VALUES (5, 1, 1, 7.50);
INSERT INTO Detalle_Pedido VALUES (5, 5, 1, 9.00);
INSERT INTO Detalle_Pedido VALUES (5, 3, 1, 5.00);