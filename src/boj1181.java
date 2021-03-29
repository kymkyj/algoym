import java.util.*;

// 단어 정렬
public class boj1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        int N = sc.nextInt();
        String [] result;
        for(int i=0; i<N; i++){
            hashSet.add(sc.next());
        }
        result = new String[hashSet.size()]; // hashSet 사이즈만큼 만듬
        hashSet.toArray(result);

        Arrays.sort(result);
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length()); // 길이가 짧은것부터 정렬해야함
            }
        });

        for(String string : result){
            System.out.println(string);
        }

    }
}
