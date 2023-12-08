package section4_Hashmap_Treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 베스트앨범 {
    public static void main(String[] args) {
        int[] answer;
        // 장르, 재생횟수 설정
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int [] plays = {500,600,150,800,2500};
        
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<Music> arr = new ArrayList<>();
        for(int i=0; i<genres.length; i++){
            String genre = genres[i];
            int play = plays[i];
            map.put(genre,map.getOrDefault(genre,0)+play);
            arr.add(new Music(genre,play,i));
        }
        int played_max = 0;
        String best_genre="";
        // 장르 정렬
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        // 장르 내 노래 정렬
        Collections.sort(arr);
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(String key: keys){
            int cnt=1;
            for(int i=0; i<arr.size(); i++){
                Music m = arr.get(i);
                if(key.equals(m.genre) && cnt <=2){
                    arrlist.add(m.idx);
                    cnt++;
                }
            }
        }
        answer = new int[arrlist.size()];
        for(int i=0; i<arrlist.size(); i++){
            answer[i] = arrlist.get(i);
        }

    }
}
class Music implements Comparable <Music> {

    String genre;
    int played;
    int idx;
    Music(String genre, int played, int idx){
        this.played = played;
        this.genre = genre;
        this.idx = idx;
    }

    @Override
    public int compareTo(Music o) {
        if(o.played == this.played){
            return this.idx - o.idx;
        }else{
            return o.played - this.played;
        }
    }


}