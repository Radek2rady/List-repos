package OOP.Sharpie;

public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;

  public void use() {
    this.inkAmount -= 1;
  }


}
