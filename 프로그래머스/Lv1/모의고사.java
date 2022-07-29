public class 모의고사 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};
            // 찍는방식 규칙
            int[] student1 = {1,2,3,4,5};
            int[] student2 = {2,1,2,3,2,4,2,5};
            int[] student3 = {3,3,1,1,2,2,4,4,5,5};
            
            int[] score = new int[3];
            
            for(int i=0; i<answers.length; i++){
                // 찍는 규칙의 길이
                if(answers[i] == student1[i%5]){
                    score[0]++;
                }
                 if(answers[i] == student2[i%8]){
                    score[1]++;
                }
                 if(answers[i] == student3[i%10]){
                    score[2]++;
                }
            }
            
            int point = 0;
            for(int i=0; i<3; i++){
                if(score[i] > point){
                    point = score[i];
                }
            }
            
            //가장 높은점수를 받은 사람 구하기
            int result = 0;
            for(int i=0; i<3; i++){
                if(score[i] == point){
                    result++;
                }
            }
            
            answer = new int[result];
            int idx = 0; 
            for(int i=0; i<3; i++){
                if(score[i] == point){
                    answer[idx++] = i+1;
                }
            }
            return answer;
        }
    }
}
