//Creamos la clase producto
class Producto {
  static contadorProductos = 0; //variable estatica para contar productos, se inicializa en 0
  constructor(nombre, precio, cantidad) {
    this._idProducto = ++Producto.contadorProductos; //incrementamos el contador de productos
    this.nombre = nombre;
    this.precio = precio;
  }

  //Metodos get y set
  get idProducto() {
    return this._idProducto;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get precio() {
    return this._precio;
  }

  set precio(precio) {
    this._precio = precio;
  }

  //Metodo toString
  toString() {
    //template literals: nos permite insertar codigo dinamico dentro de un string
    return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: ${this._precio}`;
  }
}

//Creamos la clase Orden
class Orden {
  static contadorOrdenes = 0; //variable estatica para contar ordenes, se inicializa en 0
  static getMAX_PRODUCTOS() {
    return 5;
  }

  constructor() {
    this._idOrden = ++Orden.contadorOrdenes; //incrementamos el contador de ordenes
    this._productos = []; //arreglo vacio para almacenar productos
    this._contadorProductosAgregados = 0;
  }

  //Metodo get
  get idOrden() {
    return this._idOrden;
  }

  //Metodo agregarProducto
  agregarProducto(producto) {
    if (this._productos.length < Orden.getMAX_PRODUCTOS()) {
      this._productos.push(producto); //sintaxis 1 para agregar un elemento a un arreglo
      //this._productos[this._contadorProductosAgregados++] = producto; //sintaxis 2
    } else {
      console.log("No se pueden agregar mas productos");
    }
  } //fin metodo agregarProducto

  //Metodo calcularTotal
  calcularTotal() {
    let totalVenta = 0;
    for (let producto of this._productos) {
      totalVenta += producto.precio;
    } //fin ciclo for
    return totalVenta;
  } //fin metodo calcularTotal

  //Metodo mostrarOrden
  mostrarOrden() {
    let productosOrden = "";
    for (let producto of this._productos) {
      productosOrden += "\n{ " + producto.toString() + " }";
    } //fin ciclo for
    console.log(
      `Orden: ${
        this._idOrden
      }, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`
    );
  } //fin metodo mostrarOrden
} //fin clase Orden

//Creamos nuevos objetos de la clase Producto
let producto1 = new Producto("Pantalon", 200);
let producto2 = new Producto("Camisa", 100);
let producto3 = new Producto("Corbata", 50);
let orden1 = new Orden(); //creamos un objeto de la clase Orden
let orden2 = new Orden(); //creamos un objeto de la clase Orden
orden1.agregarProducto(producto1); //agregamos un producto a la orden
orden1.agregarProducto(producto2); //agregamos un producto a la orden
orden1.agregarProducto(producto3); //agregamos un producto a la orden
orden1.agregarProducto(producto1); //agregamos un producto a la orden
orden1.agregarProducto(producto2); //agregamos un producto a la orden
orden2.agregarProducto(producto3);
orden1.mostrarOrden(); //mostramos la orden 1
orden2.mostrarOrden(); //mostramos la orden 2
//let productosTable = [producto1, producto2]; //creamos un arreglo de productos y le pasamos los objetos creados(de prueba)
//console.log(producto1.toString());
//console.log(producto2.toString());
//console.table(productosTable); //imprimimos el arreglo de productos en forma de tabla(de prueba)
