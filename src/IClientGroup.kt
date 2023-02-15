interface IClientGroup {
    val name: String
    val group: MutableList<Client>
    fun sortByDiscount()
    fun filterByDiscount()
    fun addClient(newClient: Client)
    fun display()
    fun removeClient(clientToRemove: Client)
}