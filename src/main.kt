fun main(){
    val client1 = Client(1, "Ромчик", "Пушкинская 1", 5)
    val client2 = Client(2, "Марчик", "Садовая 1", 15)
    val client3 = Client(3, "Максим", "Ленина 3", 5)
    val client4 = Client(4, "Аня", "Комсомольская 19", 25)
    val client5 = Client(5, "КАНТ", "Газетный 84", 10)
    client1.show()

    val groupExample = ClientGroup("Основная группа клиентов")
    groupExample.addClient(client1)
    groupExample.addClient(client2)
    groupExample.addClient(client3)
    groupExample.addClient(client4)
    groupExample.addClient(client5)

    groupExample.showFullList()
    groupExample.sortByDiscount()
    groupExample.filterByDiscount()
}