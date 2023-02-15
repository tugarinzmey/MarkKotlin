class ClientGroup constructor(private val _name: String): IClientGroup {
    override val name: String = _name
    override val group: MutableList<Client> = mutableListOf<Client>()

    override fun sortByDiscount(){
        group.sortBy { client -> client.discount }
        println("Сортированный массив (по размеру скидки)")
        showFullList()
    }

    override fun filterByDiscount(){
        val filteredList = group.filter { client -> client.discount == 5}
        println("Отфильтрованный массив (клиенты со скидкой 5%):")
        filteredList.forEach { client -> client.show() }
    }

    override fun showFullList(){
        println("Полный список группы '$name'")
        group.forEach { client -> client.show() }
    }

    override fun addClient(newClient: Client){
        group.add(newClient)
    }
}