package home_tasks.lesson2;

import java.util.Arrays;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
        
        String inSql = "select * from students where ";
        String inJson = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        inJson = inJson.replaceAll("\"", "").replaceAll(",", "").replaceAll(":", " ");
        String[] words = inJson.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder.append(inSql);
        for (int i = 0; i < words.length ; i += 2){
            if (!(words[i+1].equals("null"))){
                // System.out.println(i + words[i] + "~" + (i + 1) + words[i+1]); /* проверка итераций */
                stringBuilder = stringBuilder.append("'" + words[i] + "=" + words[i+1] + "'");
                if (i < words.length - 4) stringBuilder = stringBuilder.append(" and ");
            }
        }
        System.out.println(stringBuilder);
        
    }
}
