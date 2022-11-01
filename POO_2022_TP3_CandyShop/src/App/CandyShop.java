package App;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class CandyShop extends javax.swing.JFrame {//apartado back-end de la aplicacion

    Inventario inventario = new Inventario();
    DefaultTableModel modelo = new DefaultTableModel();

    ArrayList<Producto> listaVentas = new ArrayList<Producto>();

    public CandyShop() {//construye el apartado visual de la aplicacion
        initComponents();
        this.setTitle("Candy Shop");
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(inventario.getProductos());
        cmbProducto.setModel(comboModel);
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        calcularPrecio();
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanelPrincipal = new javax.swing.JTabbedPane();
        tabVentas = new javax.swing.JPanel();
        textoProd = new javax.swing.JLabel();
        textoCant = new javax.swing.JLabel();
        textoPrecio = new javax.swing.JLabel();
        textoSubtotal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cmbProducto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        spnCantidad = new javax.swing.JSpinner();
        txtSubtotal = new javax.swing.JLabel();
        txtImporte = new javax.swing.JLabel();
        btnNuevaOrden = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        textoSeleccionePago = new javax.swing.JLabel();
        btnCredito = new javax.swing.JButton();
        btnDebito = new javax.swing.JButton();
        btnEfectivo = new javax.swing.JButton();
        textoTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabVentas.setBackground(new java.awt.Color(204, 204, 255));

        textoProd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textoProd.setText("Producto:");

        textoCant.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textoCant.setText("Cantidad:");

        textoPrecio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textoPrecio.setText("Precio:");

        textoSubtotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textoSubtotal.setText("Subtotal:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        tblProd.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(tblProd);

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        txtSubtotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSubtotal.setText("0,00 ARS");

        txtImporte.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtImporte.setText("0,00 ARS");

        btnNuevaOrden.setText("Nueva Orden");
        btnNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaOrdenActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar (ultima fila)");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        textoSeleccionePago.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textoSeleccionePago.setText("Seleccione el metodo de pago:");

        btnCredito.setText("Crédito");
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btnDebito.setText("Débito");
        btnDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebitoActionPerformed(evt);
            }
        });

        btnEfectivo.setText("Efectivo");
        btnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectivoActionPerformed(evt);
            }
        });

        textoTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        textoTotal.setText("Total a abonar:");

        txtTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotal.setText("0,00 ARS");

        javax.swing.GroupLayout tabVentasLayout = new javax.swing.GroupLayout(tabVentas);
        tabVentas.setLayout(tabVentasLayout);
        tabVentasLayout.setHorizontalGroup(
                tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabVentasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tabVentasLayout.createSequentialGroup()
                                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(tabVentasLayout.createSequentialGroup()
                                                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(tabVentasLayout.createSequentialGroup()
                                                                                .addComponent(textoProd)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btnAgregar))
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabVentasLayout.createSequentialGroup()
                                                                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(textoPrecio)
                                                                                        .addGroup(tabVentasLayout.createSequentialGroup()
                                                                                                .addComponent(textoCant)
                                                                                                .addGap(6, 6, 6)))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(spnCantidad)
                                                                                        .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(btnNuevaOrden, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVentasLayout.createSequentialGroup()
                                                                .addComponent(textoSubtotal)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVentasLayout.createSequentialGroup()
                                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(tabVentasLayout.createSequentialGroup()
                                                                .addComponent(textoTotal)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(textoSeleccionePago))
                                                .addGap(39, 39, 39))))
        );
        tabVentasLayout.setVerticalGroup(
                tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabVentasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoProd)
                                        .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAgregar))
                                .addGap(18, 18, 18)
                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnEliminar))
                                        .addComponent(textoCant))
                                .addGap(18, 18, 18)
                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(textoPrecio)
                                                .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(btnNuevaOrden))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(textoSeleccionePago, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSubtotal)
                                        .addComponent(textoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotal))
                                .addContainerGap())
        );

        tabPanelPrincipal.addTab("Ventas", tabVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabPanelPrincipal)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabPanelPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//pago con efectivo
        PagoEfectivo pagoEfectivo = new PagoEfectivo();
        txtTotal.setText(aMoneda(pagoEfectivo.realizarPago()));
    }

    private void btnDebitoActionPerformed(java.awt.event.ActionEvent evt) {//pago con debito (no se realiza nada en particular)
        txtTotal.setText(aMoneda(inventario.getSubtotal()));//pago con debito es solamente el precio sin modificaciones
    }

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//pago con credito
        PagoCredito pagoCredito = new PagoCredito();
        txtTotal.setText(aMoneda(pagoCredito.realizarPago()));
    }//
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//elimino la ultima fila si es que hay filas
        if (modelo.getRowCount() > 0) {
            listaVentas.remove(modelo.getRowCount() - 1);
            modelo.removeRow(modelo.getRowCount() - 1);
            resetearContador();
            actualizarTabla();
        }
    }

    private void btnNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//elimino todos los valores de la tabla guardados previamente para poder trabajar
        listaVentas.clear();
        actualizarTabla();
        resetearContador();
        txtTotal.setText("$ 0.0 ARS");
    }

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//evaluo cambio en el spinner
        calcularPrecio();
    }

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//calculo el precio del producto elegido
        calcularPrecio();
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//Agrego el nuevo producto a la tabla
        Producto item = new Producto();//declaro un nuevo item de tipo producto
        item.setId(cmbProducto.getSelectedIndex());//tomo del combo box el indice del producto actual y se lo asigno al nuevo item de tipo producto
        item.setDescripcion(cmbProducto.getSelectedItem().toString());//tomo del combo box la descripcion del producto actual y se lo asigno al nuevo item de tipo producto
        item.setPrecio(inventario.getPrecio() * inventario.getCantidad());//multiplico el precio por cantidad (global hasta el momento) y se lo asigno al nuevo item de tipo producto como el precio
        item.setCantidad(inventario.getCantidad());//tomo la cantidad (global hasta el momento) y se lo asigno al nuevo item de tipo producto como la cantidad
        if (!revisarProducto(item)) {//si revisarProducto retorno false es por que el producto a agregar (por parametro) no habia sido ingresado previamente
            listaVentas.add(item);//agrego el nuevo producto a la listaVentas ya que el producto nunca se eligio previamente
        }
        actualizarTabla();
        resetearContador();
    }

    public boolean revisarProducto(Producto ver) {//reviso si el producto ya existe en la listaVentas y si es asi le sumo cantidad al producto a comprar para no generar nueva linea
        for (Producto p : listaVentas) {//por cada producto de la listaVentas
            if (p.getId() == ver.getId()) {//si el id del producto de la listaVentas es igual al id del producto ingresado por parametro
                int nuevaCantidad = p.getCantidad() + ver.getCantidad();//la variable nuevaCantidad se carga con la cantidad del producto en la lista y la cantidad del producto enviado por parametro
                p.cantidad = nuevaCantidad;//asigno al producto en la listaVentas el valor de la nuevaCantidad
                p.precio = inventario.getPrecio() * nuevaCantidad;//asigno al precio del producto en la listaVentas el valor de su precio por la nuevaCantidad
                return true;//si se ingreso al buce es por que el producto en la listaVentas y el producto por parametro es igual, retorno true
            }
        }
        return false;//si no cumple lo anterior retorna false    
    }

    public void resetearContador() {//vuelvo a poner los valores iniciales de cada elemento de la app
        inventario.setPrecio(0);
        inventario.setCantidad(0);
        cmbProducto.setSelectedIndex(0);//tomo la informacion del combo producto segun el indice y lo inicializo en cero
        spnCantidad.setValue(1);//tomo la informacion del spinner degun el indice y lo inicializo en uno   
        calcularPrecio();
    }

    public void actualizarTabla() { //consiste en eliminar todos los valores previos de la tabla y cargar la tabla nuevamente con los mismos valores mas los datos nuevos
        while (modelo.getRowCount() > 0) { //mientras las filas de la tabla sean mayor a cero entonces elimino la fila.
            modelo.removeRow(0);//remuevo una fila
        }
        inventario.setSubtotal(0); // el subtotal es cero.
        for (Producto p : listaVentas) { //por cada producto de la listaVentas
            Object x[] = new Object[3]; //creo un objeto con 3 espacios de un arreglo
            x[0] = p.getDescripcion(); //al espacio cero del arreglo le cargo la descripcion del producto
            x[1] = aMoneda(p.getPrecio()); //al espacio 1 del arreglo le cargo el precio
            x[2] = p.getCantidad(); // al espacio 2 del arreglo le cargo la cantidad
            double nuevoSubtotal = inventario.getSubtotal() + p.getPrecio();
            inventario.setSubtotal(nuevoSubtotal); // actualizo el subtotal obtenido sumando el valor del subtotal mas el precio del producto actual
            modelo.addRow(x); // agrego una fila con el objeto creado a la tabla
        }
        txtSubtotal.setText(aMoneda(inventario.getSubtotal())); //muestro el subTotal en la aplicacion
        tblProd.setModel(modelo);
    }

    public void calcularPrecio() {//precio por cantidad
        double precio = inventario.precios[cmbProducto.getSelectedIndex()];//segun el producto elegido en el combo box de productos, busco en el arrego precios el precio del id del producto y se lo asigno a la variable precio
        inventario.setPrecio(precio);
        int cantidad = Integer.parseInt(spnCantidad.getValue().toString());// segun el spinner de cantidad, tomo el valor del objeto, lo paso a tipo string luego lo paso a un entero y lo cargo en la variable cantidad
        inventario.setCantidad(cantidad);
        txtImporte.setText(aMoneda(inventario.getPrecio() * inventario.getCantidad()));//muestro una vista previa de precio por cantidad
    }

    public static String aMoneda(double precio) {//metodo que retorna un valor numerico como numero real y son simbologia de moneda argentina
        return "$ " + Math.round(precio * 100.00) / 100.00 + " ARS";
    }

    public static void main(String args[]) {//metodo principal
        java.awt.EventQueue.invokeLater(() -> {
            new CandyShop().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnDebito;
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevaOrden;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTabbedPane tabPanelPrincipal;
    private javax.swing.JPanel tabVentas;
    private javax.swing.JTable tblProd;
    private javax.swing.JLabel textoCant;
    private javax.swing.JLabel textoPrecio;
    private javax.swing.JLabel textoProd;
    private javax.swing.JLabel textoSeleccionePago;
    private javax.swing.JLabel textoSubtotal;
    private javax.swing.JLabel textoTotal;
    private javax.swing.JLabel txtImporte;
    private javax.swing.JLabel txtSubtotal;
    public javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
