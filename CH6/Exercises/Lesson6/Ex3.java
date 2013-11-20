
class Ex3 {
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    System.out.println(isTriangle(2, 3, 4));
}
  public static boolean isTriangle(int a, int b, int c){
    if (a  > (b + c)) {
      return false;
    }else if (b > (a + c)) {
      return false;
    }else if (c > (a + b)) {
      return false;
    }else{
      return true;
  }
 }
}
