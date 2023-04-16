export default class Order{

    foodId;
    options;
    address;
    customerId;
    status;


    toString(){
        return "This order is " + this.foodId + " with options " + this.options + " for customer " + this.customerId;
    }

}