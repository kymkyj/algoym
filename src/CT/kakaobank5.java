package CT;

public class kakaobank5 {
    public static int [] solution(int[] prices){
        int[] answer = new int[prices.length];
        int cnt = 0;
        for(int i=0; i<1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i] > prices[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        return answer;
    }
    public static void main(String[] args) {
        int [] prices = {5, 3, 7, 9, 5, 2, 4, 9, 10, 6};
        solution(prices);
    }
}
