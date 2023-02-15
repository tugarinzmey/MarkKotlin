class ClientGroup constructor(_name: String): IClientGroup {
    override val name: String = _name
    override val group: MutableList<Client> = mutableListOf()

    override fun sortByDiscount(){
        println("Сортированный массив (по размеру скидки)")
        val sortedList = group.sortedWith(compareBy<Client>{it.discount})
        displayCustomList(sortedList as MutableList<Client>)
    }

    override fun filterByDiscount(){
        val filteredList = group.filter { it.discount == 5}
        if (filteredList.isNotEmpty()){
            println("Отфильтрованный массив (клиенты со скидкой 5%):")
            displayCustomList(filteredList as MutableList<Client>)
        }
        else
            println("Таких клиентов нет в списке")
    }

    override fun display(){
        println("Полный список группы '$name'")
        group.forEach { it.show() }
    }

    private fun displayCustomList(list: MutableList<Client>){
        list.forEach<Client>{ it.show()}
    }

    override fun addClient(newClient: Client){
        group.add(newClient)
    }

    override fun removeClient(clientToRemove: Client) {
        group.removeIf{ it.id == clientToRemove.id}
    }
}