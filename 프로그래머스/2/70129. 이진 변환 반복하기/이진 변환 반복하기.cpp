#include <string>
#include <vector>
#include <iostream>


using namespace std;

vector<int> solution(string s)
{
    int rounds = 0;
    int zeroCount = 0;
    
    while(s != "1")
    {
        string str = "";
        int num;
        rounds++;

        for(int i = 0; i < s.size(); i++)
        {
            if(s[i] == '0')
            {
                zeroCount++;
            }
            else
            {
                str += "1";
            }
        }

        num = str.size();
        s = "";

        while(num > 0)
        {
            s += to_string(num % 2);
            num /= 2;
        }
    }
    return {rounds, zeroCount};
}