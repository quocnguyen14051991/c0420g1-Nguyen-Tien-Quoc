
class Customer
{
    setName(name){
        this.name=name;
    }
    getName(){
        return this.name;
    }
    setCmnd(cmnd){
        this.cmnd=cmnd;
    }
    getCmnd(){
        return this.cmnd;
    }
    setBirthDay(birthday){
        this.birthday=birthday;
    }
    getBirthday(){
        return this.birthday;
    }
    setEmail(email){
        this.email=email;
    }
    getEmail(){
        return this.email;
    }
    setAddress(address){
        this.address=address;
    }
    getAddress(){
        return this.address;
    }
    setTypeCustomer(typeCustomer){
        this.typeCustomer=typeCustomer;
    }
    getTypeCustomer(){
        return this.typeCustomer;
    }
    setDiscount(discount){
        this.discount=discount;
    }
    getDiscount(){
        return parseInt(this.discount);
    }
    setQuanlityInclude(quanlityInclude){
        this.quanlityInclude=quanlityInclude;
    }
    getQuanlityInclude(){
        return this.quanlityInclude;
    }
    setTypeRoom(typeRoom){
        this.typeRoom=typeRoom;
    }
    getTypeRoom(){
        return this.typeRoom;
    }
    setRentDays(renDays){
        this.renDays=renDays;
    }
    getRentDays(){
        return parseInt(this.renDays);
    }
    setTypeService(typeService){
        this.typeService=typeService;
    }
    getTypeService(){
       return this.typeService;
    }
    totalPays(){
        let money=0;
        if(this.getTypeService()==="Villa"){
            money=500;
        }else if(this.getTypeService()==="House"){
            money=300;
        }else if(this.getTypeService()==="Room") {
            money=200;
        }
        return this.getRentDays()*money*(1-this.getDiscount()/100);
    }
}
