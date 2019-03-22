INSERT INTO empleados ( nombre, apellidos, nif, direccion, movil, fijo ) VALUES ( 'Jane', 'Doe', '456234123N', 'Gijon', '674567345', '345345324');
INSERT INTO empleados ( nombre, apellidos, nif, direccion, movil, fijo ) VALUES ( 'Jhon', 'Doe', '123543334H', 'Asturias', '123533452', '64562354');
INSERT INTO empleados ( nombre, apellidos, nif, direccion, movil, fijo ) VALUES ( 'Silvia', 'Alvarez', '458343234O', 'España', '12353452', '765345');

INSERT INTO tipoactuaciones ( denominacion, precio ) VALUES ( 'Deslinde de fincas', 300);
INSERT INTO tipoactuaciones ( denominacion, precio ) VALUES ( 'Reparacion', 50);
INSERT INTO tipoactuaciones ( denominacion, precio ) VALUES ( 'Asistencia a juicio', 33);

INSERT INTO actuaciones ( horaInicial, horaFinal, precioHora, descripcion, km, dietas, visado, repro, idEmpleado, idTipoActuacion, fecha ) VALUES ( '9:00', '11:00', 33, 'Reparacion del sistema electrico', 33, 15, 10, 25, 1, 2, '2018-10-19');
INSERT INTO actuaciones ( horaInicial, horaFinal, precioHora, descripcion, km, dietas, visado, repro, idEmpleado, idTipoActuacion, fecha ) VALUES ( '12:00', '13:00', 10, 'Puerta rota', 15, 5, 5, 10, 1, 2, '2018-10-23');
INSERT INTO actuaciones ( horaInicial, horaFinal, precioHora, descripcion, km, dietas, visado, repro, idEmpleado, idTipoActuacion, fecha ) VALUES ( '10:00', '12:00', 36, 'Consejo en un juicio', 10, 12, 20, 20, 2, 3, '2018-10-15');
INSERT INTO actuaciones ( horaInicial, horaFinal, precioHora, descripcion, km, dietas, visado, repro, idEmpleado, idTipoActuacion, fecha ) VALUES ( '15:00', '18:30', 25, 'Asistencia en un fallo de las fincas', 60, 20, 20, 22, 3, 1, '2018-10-6');


