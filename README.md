# CandyShopTP
Trabajo practico demostrativo para la facultad en Java y Java Swing

Herencia:
En este trabajo se utiliza JAVA “Swing” para realizar una interfaz de usuario y así trabajar más cómodamente sobre los conceptos abordados. Este GUI toolkit posee sus formas de ser trabajado para dar como resultado una interacción exitosa lo cual obliga al programador a tener un punto de vista diferente al trabajo por consola.

La clase “CandyShop” extiende de “javax.swing.JFrame” (linea 8) lo cual es un caso de herencia ya que tomara elementos que permitirá trabajar la interfaz ademas de nuevos elementos que nosotros implementamos.

Clases abstractas:
La clase “MetodoDePago” es una clase abstracta la cual es utilizada en dos casos: en las clases “PagoEfectivo” y “PagoCredito” utilizan el metodo “realizarPago” independientemente cada uno variando para cada metodo propio.

Organización de clases mediante paquetes y subpaquetes:
Se modularizo en distintas clases para así aprovechar la ventaja de trabajar con el paradigma orientado a objetos. Se armaron las clase “CandyShop”, “Inventario”, “MetodoDePago”, “PagoCredito”, “PagoEfectivo” y “Producto” las cuales interactuan entre si.

Utilización de modificadores de acceso:
Los modificadores de acceso se hacen presentes en multiples casos, donde mas se hace notorio es en las clases las cuales trabajan con “setters” y “getters” ya que los elementos preferentemente son de caracter “private” y la forma mas apropiada de cambiar el estado es con los mismos modificadores “setter” o “getter”.
En el caso de la clase “Inventario” y “Producto” se encuentran los atributos “id”, “descripcion”, “cantidad” , “precio”, “precios”, “productos” y “subtotal”, todos ellos tienen distintos modificadores de acceso que se pueden observar de forma explicita su requerimiento, aunque durante todo el programa se ven distintos tipos de modificadores.

Atributos estáticos o de clase:
Se trabaja con un atributo estático para el resultado mas importante del programa, el “subtotal”, este se encuentra declarado en la clase “Inventario” (linea 8), debe ser trabajado durante toda la ejecucion y ya que muchos métodos trabajan asincrónicamente con este valor se refirió usarlo como un atributo estático.

Uso de arreglos y/u objetos de tipo ArrayList:
En el programa se utiliza una ArrayList para almacenar todas las compras que se vayan a realizar, se encuentra en la clase “CandyShop” (linea 13), esta es utilizada al accionarse el boton “btnAgregarActionPerformed” (agregar a la lista de compras)  y se utilizan varios arreglos simples para almacenar los valores limitados de la lisra de “productos” y de “precios” en la clase “Inventario” (linea 4 y 5).

