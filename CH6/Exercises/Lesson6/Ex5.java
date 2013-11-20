class Ex5 {
  public static void main(String[] args) {
    System.out.println(distance(1.0, 2.0, 3.0, 4.0));
}
  public static double distance(double x1, double y1, double x2, double y2) {
   return Math.sqrt((x2-x1)+(y2-y1));
 }
}
