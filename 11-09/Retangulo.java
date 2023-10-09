public class Retangulo {
   private double base = 2;
   private double altura = 1;


   public Retangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
   }
   public Retangulo(){}

   public double getArea(double r) {
      return base * altura;
   }

   public double getPerimeter() {
      return base*2 + altura*2;
   }

   public double getBase() {
      return base;
   }

   public double getAltura() {
      return altura;
   }

   public boolean isSquare() {
      return base == altura;
   }

   public void showInfos() {
      System.out.printf("Base: %f\n", getBase());
      System.out.printf("Altura: %f\n", getAltura());
      System.out.printf("Area: %f\n", getArea());
      System.out.printf("Perimetro: %f\n", getPerimeter());
   }

}
