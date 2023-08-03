use restaurant;

-- Consulta 1
select nombre, cantidad from plato inner join detalle_pedido on plato.id = detalle_pedido.Plato_ID where detalle_pedido.Pedido_ID = 1;

-- Consulta 2
select mesa.id, sum(cantidad) as cantidad_pedidos from mesa inner join pedido on mesa.id = pedido.Mesa_ID inner join detalle_pedido on pedido.ID = detalle_pedido.Pedido_ID group by mesa.ID;
-- order by cantidad_pedidos asc;

-- Consulta 3
select nombre, sum(total) as total_ventas from camarero inner join pedido on camarero.ID = pedido.Camarero_ID group by camarero.Nombre order by camarero.Nombre desc;

-- Consulta 4
select plato.nombre, aux.solicitud as cantidad_solicitudes from plato inner join (select plato.id, plato.nombre, sum(cantidad) as solicitud from plato inner join detalle_pedido on plato.id = detalle_pedido.Plato_ID group by plato.id) as aux
on plato.id = aux.id where aux.solicitud = (select max(solicitud) as max from (select plato.id, plato.nombre, sum(cantidad) as solicitud from plato inner join detalle_pedido on plato.id = detalle_pedido.Plato_ID group by plato.id) as max)  order by plato.nombre asc;

-- Consulta 5
select nombre, sum(Subtotal) as total_valor_ventas from plato inner join detalle_pedido on plato.id = detalle_pedido.Plato_ID group by plato.Nombre order by total_valor_ventas asc;