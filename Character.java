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

  public void introduce(){
    if(hp<=0){
      System.out.println("返事がない、ただのしかばねのようだ");
    }else{
      System.out.println("私の名は"+name+"、HP"+hp+"、MP"+mp+"の"+job+"だ！");
    }
  }

  private void damage(int power){
    hp -= power;
    System.out.println(name+"は"+power+"ポイントのダメージを受けた！");
    if(hp<=0)System.out.println(name+"はいきたえた");
  }

  public void attack(Character target){
    System.out.println(name+"の攻撃！");
    target.damage(10);
  }
}