// Chapter 6 - Excercise 6.2
class Ex2 {

  public static void main(String[] args){
    double x = multadd(1.0, 2.0, 3.0);
    System.out.println("5 == " + x);
    Math.sin(Math.PI/4);
    System.out.println(multadd(Math.sin(Math.PI/4), Math.cos(Math.PI/4/2)));
    System.out.println(Math.log(10)+Math.log(20));
    double e = 2.0;
}
  public static double multadd(double a, double b, double c) {
    return a*b + c;
}
  public static double multadd(double a, double b) {
   return a + b;
}
  public static double yikes(double x) {
   return yikes(x*Math.exp(-x)+ Math.sqrt(1-Math.exp(-x)));
}}
