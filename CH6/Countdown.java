 class Countdown {

  public static void main(String[] args){
    //System.out.println("Start:");
    //equation(8,3,2,1);
    double r = 6.0;
    //countdown(99);
    double a = area(r);
    double x = area(1.0, 2.0, 4.0, 6.0);
    System.out.println("The area of the circle is " + x);
    //double dist = distance(1.0, 2.0, 4.0, 6.0);
    //System.out.println("Distance equals " + dist);
    //System.out.println("The area of the circle is " + a);
    //System.out.println("The absolute value of -6.0 is " + absoluteValue(-6.0));
  }

  public static void countdown(int x) {
     if (x==0) {
      System.out.println("BLASTOFF");
     } else {
      System.out.println(x);
      countdown(x-1);
  }
 }

  public static double distance(double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    double dsquared = dx*dx + dy*dy;
    return Math.sqrt(dsquared);
 }

  public static double area(double radius) {
     return Math.PI * radius * radius;
 }

  public static double area(double x1, double y1, double x2, double y2){
    return area(distance(x1, y1, x2, y2));
}
  public static double absoluteValue(double x) {
     if(x<0) {
       return -x;
     } else {
       return x;
  }
 }
  public static void equation(int a, int b, int c, int n) {
    double x = Math.pow(a,n);
    double y = Math.pow(b,n);
    double z = Math.pow(c,n);
   if ((x+y) == z) {
    System.out.println("Holy smokes! Fermet was wrong!!");
   }else{
    System.out.println("No, that doesn't work.");
  }
 }
}
