class MultipleCatches{
    public static void main(String[] args) {
        int n=args.length;
        int ans = 0;
        int []a={1,2,3,4};

        try{
            ans=420/n;
            System.out.println("Division performed...");
            System.out.println("a[10] : "+a[10]);
        }
        catch(ArithmeticException e){
            System.err.println("Trying to divide by zero  !!! real exception : "+e);
            ans=-999;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound !!! real exception : "+e);
        }
        
        System.out.println("Ans : "+ans);
        System.out.println("Pg terminated...");
    }
}