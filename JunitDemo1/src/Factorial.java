public class Factorial {

    public int fact(int num)

    {

        int output;

        if(num==1){

            return 1;

        }

        //Recursion: Function calling itself!!

        output = fact(num-1)* num;

        return output;

    }
}
