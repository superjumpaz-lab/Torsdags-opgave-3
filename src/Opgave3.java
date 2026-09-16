public class Opgave3 {

    double applyDiscount(double price, double discountPercent){
        return price - (price * discountPercent / 100);
    }

    double addTax(double price){
        double taxPercent = 25;
        return price + (price * taxPercent / 100);
    }

    double calculateFinalPrice(double basePrice, double discount){
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }

    void main(){
        double finalPrice = calculateFinalPrice(500,20);
        System.out.println("Total price is: " + finalPrice);



    }






}
