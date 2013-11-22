class Ex8{
  public static void main(String[] args){
    System.out.println(first("Party"));
    System.out.println(rest("Party"));
    System.out.println(length("Party"));
    printString("Party");
    System.out.println("");
    printBackward("Party", 4);
}
  public static char first(String s) {
    return s.charAt(0);
}
  public static String rest(String s) {
    return s.substring(1, s.length());
}
  public static int length(String s) {
    return s.length();
}
  public static void printString(String s){
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(1));
    System.out.println(s.charAt(2));
    System.out.println(s.charAt(3));
    System.out.println(s.charAt(4));
}
  public static void printBackward(String s, int n){
    if (n==0){
     System.out.println(s.charAt(0));
    }else{
     System.out.println(s.charAt(n));
    printBackward("Party", n-1);
}}}
