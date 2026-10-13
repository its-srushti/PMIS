// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class aa {
   aa() {
   }

   public static void main(String[] var0) {
      Circle var1 = new Circle((double)0.5F);
      Rectangle var2 = new Rectangle((double)12.0F, (double)6.0F);
      ((Shape)var1).setColor("red");
      ((Shape)var2).setColor("blue");
      System.out.printf("%s Circle area is %.2f", ((Shape)var1).getcolour(), ((Shape)var1).calculateArea());
      System.out.printf("%s Rectangle area is %.2f", ((Shape)var2).getcolour(), ((Shape)var2).calculateArea());
   }
}
