package programmers.level_3;

import java.util.ArrayList;
import java.util.HashMap;

class 다단계칫솔판매 {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        ArrayList<Person> list = new ArrayList<>();
        HashMap<String,Person> map = new HashMap<>();
        map.put("-",new Person());

        for(int i=0; i<enroll.length; i++){
            Person p = new Person();
            p.name = enroll[i];
            p.up = map.get(referral[i]);
            map.put(p.name, p);
        }

        for(int i=0; i<seller.length; i++){
            String name = seller[i];

            Person p = map.get(name);
            p.money += amount[i] *90;
            double add = amount[i] * 10;
            while(p.up != null){
                if(p.up.up != null){
                    p.up.money+= add - Math.floor(add*(0.1));
                    add = Math.floor(add*(0.1));
                }else{
                    p.up.money+=add;
                }
                p = p.up;
            }

        }
        for(int i=0; i<enroll.length; i++){
            answer[i] = map.get(enroll[i]).money;
        }



        return answer;
    }
}
class Person{
    String name;
    Person up;
    int money;

}