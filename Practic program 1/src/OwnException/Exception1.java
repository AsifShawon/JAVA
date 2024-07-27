package OwnException;

class invalidPrimeNumber extends Exception{
    int n;
    public invalidPrimeNumber(int a){
        n = a;
    }
    public String toString(){
        return "invalidPrimeNumber: "+n;
    }
}

public class Exception1 {

    public static void isPrime(int a) throws invalidPrimeNumber{
        for(int i=2; i<a; i++){
            if(a%i==0) throw new invalidPrimeNumber(a);
        }
    }

    public static void main(String[] args) {
        int num = 15;
            try{
                isPrime(num);
                System.out.println("Prime :"+num);
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
}
