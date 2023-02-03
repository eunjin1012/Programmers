class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[][] word = {{"zero", "0"}, {"one", "1"}, {"two", "2"}, {"three", "3"},{"four", "4"}, {"five", "5"}, {"six", "6"}, {"seven", "7"}, {"eight", "8"}, {"nine", "9"}};
        for(int i=0; i<word.length; i++){
            if(numbers.contains(word[i][0])){
                numbers = numbers.replace(word[i][0], word[i][1]);
            }
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}
