#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) 
{
    vector<int> answer;

    int count = commands.size();
    int order = 0;
    int index = 0;

    vector<int> temp;

    while (count > 0)
    {
        for (int i = commands[order][index] - 1; i <= commands[order][index + 1] - 1; i++)
        {
            temp.push_back(array[i]);
        }

        sort(temp.begin(), temp.end());

        int pick = temp[commands[order][index + 2] - 1];

        answer.push_back(pick);

        temp.clear();
        order++;
        count--;
    }

    return answer;
}