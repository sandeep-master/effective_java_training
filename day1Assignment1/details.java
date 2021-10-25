
class details {
    private int AccountNumber=1;
    private String name;
    private String password;
    private float Balance=2500;
    private float Rate;
    public details() {
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public float getBalance() {
        return Balance;
    }
   
    public float getRate() {
        return Rate;
    }
    public void setRate(float rate) {
        Rate = rate;
    }
    public void withdraw(int n,String s){
        if(s==password){
        if(n<Balance && n>0 ){
            Balance-=n;
            System.out.println("withdrawn success of"+n+" balance is "+Balance );
        }
        else if(n==0 || n<0){
            System.out.println("wrong input");
        }
        else {
            System.out.println("withdrawn cannot be possible because account excessed balance");
        }
    }
    else{
        System.out.println("wronng password");
    }
    }
    public void Deposit(int a){
        if(a>0 && a!=0){
            Balance+=a;
            System.out.println("deposit sucess of "+a+" balance after deposit is "+Balance);
        }
        else{
            System.out.println("failed");
        }
    }
    public void ratecalculate(){
        Balance+=(Balance*Rate/1200);
        System.out.println("after 1 month of rate "+Rate+" balance is "+Balance);
    }
    
}
