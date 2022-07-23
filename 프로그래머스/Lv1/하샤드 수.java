#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    bool answer = true;
    int sum = 0;
    int harshad = x;
    
    while(harshad>0){
        sum += harshad % 10;
        harshad /= 10;
        // 풀이  : 
    }
    if(x%sum == 0){
        return true;
    }else{
        return false;
    }
}