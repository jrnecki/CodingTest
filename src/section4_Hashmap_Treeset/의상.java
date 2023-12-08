package section4_Hashmap_Treeset;

import java.util.HashMap;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        // 의상의 종류와 그 개수
        for(String [] str : clothes){
            String clotheType = str[1];
            map.put(clotheType, map.getOrDefault(clotheType,0)+1);
        }
        // 경우의 수 구하기
        for(String key : map.keySet()){
            answer*=(map.get(key)+1);
        }
        // 아무것도 착용 안한 경우 제외
        System.out.println(answer-1);
    }
}
