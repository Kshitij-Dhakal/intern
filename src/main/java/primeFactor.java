

class primeFactor {
    public static void main(String args[])
        {
            long num=600851475143L;

            for(long i=2;i<num;i++)
            {
                while(num%i == 0) {
                    num=num/i;
                }
            }
            if(num>2)
                System.out.println(num);
        }
    }
