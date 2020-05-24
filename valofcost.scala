object Price {
def main(args:Array[String])
  {
    var n:Int=60;       //number of books
    var Total_amount:Double=n*24.95;
    var Discount:Double=Total_amount*0.4;
    var Shipping_cost:Double=3*n+(n-50)*0.75;
    var Whole_sale_cost:Double=Total_amount-Discount+Shipping_cost;
    println("The total whole sale cost of 60 books: "+Whole_sale_cost);
  }
}
