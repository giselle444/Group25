package Group25.Busra;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        System.out.println("The result of Division = " + Division(66, -10));
    }
    public static int Division(int num1, int num2)
    {
        if(num1 == 0)
            return 0;

        if(num2 == 0)
            System.out.println("invalid number");

        boolean numIsNegative = false;

        if(num1 < 0)
        {
            num1 = -num1;
            if(num2 < 0)
                num2 = -num2;
            else
                numIsNegative = true;

        }
        else if(num2 < 0)
        {
            num2 = -num2;
            numIsNegative = true;
        }

        int resultOfDivision = 0;

        while( num1 >= num2){ // n1= 10  n2= 2
            num1 = num1 - num2 ;  // n1 = 8 4
            resultOfDivision++; //12 5
        }
        if(numIsNegative)
        {
            resultOfDivision = -resultOfDivision;
        }
        return resultOfDivision;

    }
}


