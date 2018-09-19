public class RPG{
  public static void main(String[] args){
    Character[][] party = new Character[2][3];
    party[0][0] = new Character(300, 200, "孫悟空", "神仙");
    party[0][1] = new Character(100, 100, "猪八戒", "神仙");
    party[0][2] = new Character(100, 100, "沙悟浄", "神仙");

    party[1][0] = new Character(100, 0, "羅刹女", "牛魔王の妻");
    party[1][1] = new Character(200, 200, "牛魔王", "魔王");
    party[1][2] = new Character(150, 0, "紅孩児", "牛魔王の息子");

    for(int i=0;i<party.length;i++){
      for(int j=0;j<party[i].length;j++){
        party[i][j].introduce();
      }
    }

    System.out.println("_/_/_/_/_/_/戦闘開始_/_/_/_/_/_/");

    int winner = -1;
    while(winner == -1){
      for(int i=0;i<party.length;i++){
        for(int j=0;j<party[i].length;j++){
          party[i][j].attack(party[(i-1)*-1][(int)(Math.random()*party[i].length)]);
        }
      }

      for(int i=0;i<party.length;i++){
        int party_hp = 0;
        for(int j=0;j<party[i].length;j++){
          party_hp += party[i][j].get_hp();
        }
        if(party_hp<=0)winner = (i-1)*-1;
      }
    }

    System.out.println("_/_/_/_/_/_/以下のパーティの勝ちです_/_/_/_/_/_/");
    for(int i=0;i<party[winner].length;i++){
      party[winner][i].introduce();
    }

  }
}