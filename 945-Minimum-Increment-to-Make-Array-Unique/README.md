
- Given an array of integers A, a move consists of choosing any A[i], and incrementing it by 1.

- Return the least number of moves to make every value in A unique.



Example 1:


Input: [1,2,2]

Output: 1

Explanation:  After 1 move, the array could be [1, 2, 3].




Example 2:

Input: [3,2,1,2,1,7]

Output: 6

Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
It can be shown with 5 or less moves that it is impossible for the array to have all unique values.




Note:

0 <= A.length <= 40000
0 <= A[i] < 40000




## License

Copyright [2019] [XiaoQian Huang]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
