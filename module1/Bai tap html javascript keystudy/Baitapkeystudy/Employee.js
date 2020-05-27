class Employee {
    setName(name){
        this.name=name;
    }
    getName(){
        return this.name;
    }
    setBirthDay(birthday){
        this.birthday=birthday;
    }
    getBirthDay(){
        return this.birthday;
    }

    getPhone(){
        return this.phone;
    }
    setPhone(phone){
        this.phone=phone;
    }
    setEmail(email){
        this.email=email;
    }
    getEmail(){
        return this.email;
    }
    setCmnd(cmnd){
        this.cmnd=cmnd;
    }
    getCmnd(){
        return this.cmnd;
    }
    getLevel(){
        return this.level;
    }
    setLevel(level){
        this.level=level;
    }

    setLocation(location){
        this.location=location;
    }
    getLocation(){
        return this.location;
    }
    getSalary(){
        if(this.getLocation()==="Manager")
        {
            this.salary=500;
        }else if(this.getLocation()==="Sale"){
            this.salary=300
        }else if(this.getLocation()==="Markerting"){
            this.salary=200;
        }
        return this.salary;
    }
}