public class Character{
  private int hp, mp;
  private String name;
  private String job;

  public Character(){
    this.hp = 5;
    this.mp = 0;
    this.name = "モブ";
    this.job = "村人";
  }

  public Character(int hp, int mp, String name, String job){
    this.hp = hp;
    this.mp = mp;
    this.name = name;
    this.job = job;
  }

  public String get_name(){
    return name;
  }

  public int get_hp(){
    return hp;
  }

  public void introduce(){
    if(check_dead())return;
    System.out.println("私の名は"+name+"、HP"+hp+"、MP"+mp+"の"+job+"だ！");
  }

  private void damage(int power){
    hp -= power;
    System.out.println(name+"は"+power+"ポイントのダメージを受けた！");
    if(hp<=0)System.out.println(name+"はいきたえた");
  }

  public void attack(Character target){
    if(check_dead())return;
    System.out.println(name+"の攻撃！");
    target.damage(10);
  }

  private boolean check_dead(){
    boolean is_dead = hp<=0;
    if(is_dead)System.out.println(name+"はしんでいる");
    return is_dead;
  }
}