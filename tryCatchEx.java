class tryCatchEx{
    public static void main(String[] args) {
        int n=args.length;
        int ans;

        try{
            ans=420/n;
            System.out.println("Division performed...");
        }
        catch(ArithmeticException e){
            System.err.println("Try to Divide by zero...");
            System.out.println(e);
            ans=-9999;
        }
        System.out.println("Ans :"+ans);
        System.out.println("Pg terminated...");
    }
}