int myAtoi(char* s) {

    // int  num = 0;
    // int sign = 1;
    // int i = 0;
    // int started = 0;

    // while (s[i] == ' ') { i++; }

    // if (s[i] == '-') {
    //     sign = -1;
    //     i++;
    // }

    // for(; s[i] != '\0'; i++){

    //     int ans = s[i] - '0';

    //     // if(s[0] == '-'){ continue; }

    //     if (!started && (ans < 0 || ans > 9)) { return 0; }

    //     if (started && (ans < 0 || ans > 9)) { break; }

    //     if (ans == 0 && num == 0) { 
    //         started = 1;
    //         continue; 
    //     }

    //     started = 1;
    //     num = (num * 10) + ans;
    // }

    // return num * sign;


    int num = 0;
    int sign = 1;
    int i = 0;
    int started = 0;

    // agal ni vadharanni  white spaces kadhi naakhse
    while (s[i] == ' ') {
        i++;
    }

    // sign check karvani
    if (s[i] == '-') {
        sign = -1;
        i++;
    } else if (s[i] == '+') { i++; }

    for (; s[i] != '\0'; i++) {

        int ans = s[i] - '0';

        // non-digit agar number pela aave to return 0
        if (!started && (ans < 0 || ans > 9)) { return 0; }

        // non-digit agar number pachhi aave to stop
        if (started && (ans < 0 || ans > 9)) { break; }

        started = 1;

        // 🚨 overflow check (not my logic)
        if (num > (INT_MAX - ans) / 10) {
            return (sign == 1) ? INT_MAX : INT_MIN;
        }

        num = num * 10 + ans;
    }

    return num * sign;
}