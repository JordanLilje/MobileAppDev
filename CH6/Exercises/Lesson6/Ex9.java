class Ex9{
  public static void main(String[] args){
    System.out.println(power(1.0, 2));
}
  public static double power(double x, int n){
  if (n == 0){
    return 1;
  }else{
    return x*power(x,n - 1);
}}}
