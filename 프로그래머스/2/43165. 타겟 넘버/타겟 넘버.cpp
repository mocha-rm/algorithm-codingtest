#include <functional>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int target) {
       int answer = 0;

   function<void(int, int)> explore_combinations = [&](int index, int sum) {
       if (index == numbers.size()) {
           if (sum == target) {
               answer++;
           }
           return;
       }

       
       explore_combinations(index + 1, sum + numbers[index]);
       explore_combinations(index + 1, sum - numbers[index]);
       };
   explore_combinations(0, 0);

   return answer;
}