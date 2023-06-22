package Hashmaps;

import java.util.HashMap;
import java.util.Map;

    public class Distinctchar {
        public static void main(String[] args) {
            String input = "Backend Assignment";

            Map<Character, Integer> charCountMap = new HashMap<>();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }

