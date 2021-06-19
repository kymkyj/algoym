package CT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 딜리버리 1번
/*
   John Doe, Peter Benjamin Parker, Mary Jane Watson-Parker, John Elvis Doe, John Evan Doe, Jane Doe,  Peter Brian Parker

   John Doe <john.doe@example.com>,
   Peter Benjamin Parker <peter.parker@example.com>,
   Mary Jane Watson-Parker <mary.watsonparker@example.com>,
   John Elvis Doe <john.doe2@example.com>,
   John Evan Doe <john.doe3@example.com>,
   Jane Doe <jane.doe@example.com>,
   Peter Brian Parker <peter.parker2@example.com>
 */
public class delivery1 {
    public static void solution(String s, String c){
        String [] arr = s.split(",");
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            String tmp = "";
            sb.setLength(0);
            tmp = arr[i].trim();
            if(tmp.indexOf(" ") != tmp.lastIndexOf(" ")){
                sb.append(tmp.substring(0, tmp.indexOf(" ")).trim().toLowerCase().replaceAll("[-+.^:,]",""));
                sb.append(".");
                sb.append(tmp.substring(tmp.lastIndexOf(" ")).trim().toLowerCase().replaceAll("[-+.^:,]",""));
            }else {
                sb.append(tmp.replace(" ", ".").toLowerCase());
            }
            sb.append('@');
            sb.append(c);
            sb.append(".com");
            list.add(tmp +" "+"<"+sb.toString()+">");
        }
        for(int i=0; i<list.size(); i++){
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + "," + " ");
            }
        }
    }


    public static void main(String[] args) {
        String s = "John Doe, Peter Benjamin Parker, Mary Jane Watson-Parker, John Elvis Doe, John Evan Doe, Jane Doe,  Peter Brian Parker";
        String c = "example";
        solution(s, c);
    }
}
