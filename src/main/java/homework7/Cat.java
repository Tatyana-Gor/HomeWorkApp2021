package homework7;

public class Cat {
  private String name;
  private boolean hungry;
  private int appetite;

  public Cat(String name){
      appetite = (int) (1 + Math.random() * 50);
      hungry = true;
      this.name = name;
  }

    public void eat(Plate plate){
      if (hungry) {
      if (plate.getFood() >= appetite) {
          hungry = false;
          plate.consumeFood(appetite);
          System.out.println("Кот " + name + " съел " + appetite + " " + "корма. Кот сыт");
      } else {
          System.out.println("Мало корма!");
          System.out.println("Насыпь еще корма");
      }
    } else {
          System.out.println("Кот наелся");
      }

  }
}
