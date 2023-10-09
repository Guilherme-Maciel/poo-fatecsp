import java.lang.Math;

public class Circulo {
   private double raio = 0;

   public Circulo(double r) {
      setRaio(r);
   }

   public void setRaio(double r) {
      if (r > 0)
         raio = r;
      else
         System.out.println("Raio deve ser maior que 0");
   }

   public double getRaio() {
      return raio;
   }

   public double getDiameter() {
      return 2 * raio;
   }

   public double getArea() {
      return Math.PI * Math.pow(raio, 2);
   }

   public double getCircumference() {
      return 2 * Math.PI * raio;
   }

   public void exibeInfo() {
      System.out.printf("Raio: %f\n", getRaio());
      System.out.printf("Diametro: %f\n", getDiameter());
      System.out.printf("Area: %f\n", getArea());
      System.out.printf("Circunferencia: %f\n", getCircumference());

   }

}
