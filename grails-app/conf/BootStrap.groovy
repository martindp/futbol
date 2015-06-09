import futbol.Cancha

class BootStrap {

    def init = { servletContext ->

    	Cancha c1 = new Cancha(nombre: "asd", direccion: "asd", telefono: "asd", precio: "asd")
    	c1.save()
    }
    def destroy = {
    }
}
