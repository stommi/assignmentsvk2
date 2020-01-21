package TDD;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsKata {
    private Map<String, Integer> roomalaiset;

    public RomanNumeralsKata() {
        this.roomalaiset = new HashMap<>();
    }

    public void lisaa(String rooma, int luku) {
        this.roomalaiset.put(rooma, luku);
    }

    public int hae(String rooma){
        return this.roomalaiset.get(rooma);
    }

}
