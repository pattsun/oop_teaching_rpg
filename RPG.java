public class RPG{
  public static void main(String[] args){
    Character a = new Character();
    a.introduce();

    Character b = new Character(300, 200, "ロト", "勇者");
    b.introduce();

    b.attack(a);
    a.introduce();
  }
}