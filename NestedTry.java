class NestedTry{
    public static void main(String[] args) {
        int n=args.length;
        int ans=0;
        int []a={1,2,3} ;

        try{
            System.out.println("Outer try starts ...");

            try{
                ans=420/n;
                System.out.println("Division performed...");
                System.out.println(a[10]);
            }
            catch(ArithmeticException e){
                System.out.println("Divide by zero : "+e);
                ans=-999;
            }

        }
        catch(ArrayIndexOutOfBoundsException  e){
            System.out.println(e);
        }
        System.out.println("Ans : "+ans);
        System.out.println("Pg terminated...");

    }
}