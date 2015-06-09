class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/api/canchas"(resources: 'cancha')
		"/api/reservas"(resources: 'reserva')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
