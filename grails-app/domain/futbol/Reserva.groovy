package futbol

class Reserva {

    Date fechaHora

    static constraints = {
        fechaHora(nullable:false, blank:false)
    }
}
