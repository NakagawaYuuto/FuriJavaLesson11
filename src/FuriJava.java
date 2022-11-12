import java.util.ArrayList;

public class FuriJava {
    //chap4_7_1
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("日本");
//        list.add("アメリカ");
//        list.add("イギリス");
//        list.add("中国");
//        System.out.println(list.get(2));

//        Chap4_7_1
//        list.add("日本");
//        list.add("アメリカ");
//        list.add("イギリス");
//        list.add("中国");
//        System.out.println(list.get(2));
//        list.remove(2);
//        System.out.println(list.get(2));

//        //Chap4_7_3
//        list.add("日本");
//        list.add("アメリカ");
//        list.add("イギリス");
//        for (String str : list){
//            System.out.println(str);
//        }

        //Chap4_8_1
        String [] jobList = {"剣士", "魔法使い", "格闘家"};
        ArrayList<Chara> charaList = new ArrayList<Chara>();
        for (String job : jobList){
            charaList.add(new Chara(job));
        }
        for (Chara chara :charaList){
            chara.sayJob();
        }

        Enemy enemy = new Enemy();
    }
}
