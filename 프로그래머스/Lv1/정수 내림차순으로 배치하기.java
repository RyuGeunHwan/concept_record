class Solution {
    public long solution(long n) {
        char[] sort = String.valueOf(n).toCharArray();
        //.toCharArray() : 자바 toCharArray() 메소드는 문자열을 char형 배열로 바꿔준다. 반환되는 배열의 길이는 문자열의 길이와 같다.
        // String.valueOf(n) : long(정수형)타입을 String형으로 변환

// 선택 정렬 시작
	int tmp = 0;
	for(int i=0; i<sort.length; i++) {
		for(int j=i+1; j<sort.length; j++) {			
			if(sort[i] < sort[j]) {
				tmp = sort[i];
				sort[i] = sort[j];
				sort[j] = (char) tmp;
				
			}
		}
	}
    // String형으로 변환 했던 배열 sort를 다시 long형으로 변환하여 return
	return Long.parseLong(String.valueOf(sort));
    }
}
