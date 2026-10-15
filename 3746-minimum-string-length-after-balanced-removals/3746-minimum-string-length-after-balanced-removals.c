int minLengthAfterRemovals(char* s) {
    int count = 0;

    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == 'a'){
            count++;
        }
        else{
            count--;
        }
    }
    if(count < 0){
        return count*(-1);
    }
    else{
        return count;
    }
}