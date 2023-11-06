import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int num = playersMap.get(callings[i]);
            String temp = players[num];
            players[num] = players[num - 1];
            players[num - 1] = temp;
            
            playersMap.put(players[num], num);
            playersMap.put(players[num - 1], num - 1);
        }
        
        return players;
    }
}