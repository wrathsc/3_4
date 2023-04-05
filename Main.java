class Main {
  public static void main(String[]args) {
  int wysokosc = 10;
  int szerokosc=10;
  for(int i=1; i<=wysokosc; i++) {
   
    for(int j=1; j<=szerokosc; j++) {
      System.out.print(j*i+"\t" );
    }
   
    System.out.println();
  }
}
}