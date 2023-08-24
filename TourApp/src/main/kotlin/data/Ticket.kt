package data

data class Ticket(
    val id: Long,
    val userId: Long,
    val packageId: Long,
    val amount: Double,
    val createdDate: String,
)
