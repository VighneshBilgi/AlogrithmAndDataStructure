package algorithmanddatastructure;

public class PrimePalindrome {

    public void printPrime(){
        int i,count;

        for(int j=2;j<=1000;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(j + " is a prime number.");
                isPalindrome(j);
            }
        }
    }

    public void isPalindrome(int n){
        int rem,sum=0,temp;

        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(temp +" is a palindrome number.");
    }

    public static void main(String[] args) {

        PrimePalindrome pp = new PrimePalindrome();

        System.out.println("Prime numbers from 1 to 1000 are :");
        pp.printPrime();

    }
}
