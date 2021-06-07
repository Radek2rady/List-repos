package OOP.Animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  public int getHunger() {
    return hunger;
  }

  public void eat() {
    this.hunger -=1;
  }

  public void drink() {
    this.thirst -=1;
  }

  public void play() {
    this.hunger +=1;
    this.thirst +=1;
  }

}
