class Client constructor(private val _id: Int, private val _fullName: String, private val _address: String, val _discount: Int) : IClientInfo {
    override var id: Int = _id
    override var fullName: String = _fullName
    override var address: String = _address
    override var discount: Int = _discount

    fun show(){
        println("ID: $id")
        println("ФИО: $fullName")
        println("Адрес: $address")
        println("Скидка: $discount")
    }

    fun changeDiscount(newDiscountValue: Int){
        discount = newDiscountValue
    }
}