import scala.io.StdIn.readInt
object Q1{
    def salary(full:Int, overtime:int)={
        var normal=full-overtime
        val ph=150
        val otp=75
        val tax=10.0
        var take_home=((normal*ph)+(overtime*otp))*((100-tax)/100)
        printf("Take home salary is :%.2f",take_home)
    }

    def main(args:Array[string]){
        printf("Enter the working hours :")
        var all=readInt()
        printf("Enter the over time hours :")
        var ot=readInt()
        salary(50,10)
    }
}