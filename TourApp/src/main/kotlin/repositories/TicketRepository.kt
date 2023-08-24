package repositories

import data.Ticket

object TicketRepository {

    private val tickets = mutableListOf<Ticket>()

    init {
        tickets.add(Ticket(1L, 1504L, 1L, 350.50, "2023/01/01"))
        tickets.add(Ticket(2L, 1504L, 4L, 100.75, "2023/01/01"))
        tickets.add(Ticket(3L, 1504L, 7L, 250.50, "2023/01/01"))
        tickets.add(Ticket(4L, 1504L, 10L, 50.00, "2023/01/01"))
        tickets.add(Ticket(5L, 1504L, 13L, 1350.15, "2023/01/01"))
        tickets.add(Ticket(6L, 2802L, 2L, 20.30, "2023/01/01"))
        tickets.add(Ticket(7L, 2802L, 9L, 450.75, "2023/01/01"))
        tickets.add(Ticket(8L, 2802L, 11L, 500.00, "2023/01/01"))
        tickets.add(Ticket(9L, 1510L, 3L, 350.50, "2023/01/01"))
        tickets.add(Ticket(10L, 1510L, 5L, 150.00, "2023/01/01"))
    }

    fun add(ticket: Ticket) {
        //TODO Implementar solucion para agregar una nueva compra
    }

    fun get() : List<Ticket> {
        return emptyList() //TODO Implementar solucion para obtener todas las compras
    }
    
}