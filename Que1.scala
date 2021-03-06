import scala.io.StdIn.readInt

object Q1{
    
    def GCD(a:Int,b:Int):Int=b match
    {
        case 0 => a
        case x if x>a => GCD(x,a)
        case x => GCD(x,a%x)
    }

    def prime(p:Int,n:Int=1):Boolean= n match
    {
        case x if(x==p && x==1) => false
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    def main(args: Array[String])
    {
        printf("Enter the Number : ")
        var number = readInt()
        do
        {
            if(prime(number)==true)
                printf("Prime Number\n")
            else
                printf("Not a Prime Number\n")
            printf("Enter the Number (-1 to exit) : ")
            number = readInt()
        }while(number!=(-1))
        
    }
}