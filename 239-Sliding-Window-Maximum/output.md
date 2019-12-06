
- Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.



Example:


Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3


Output: [3,3,5,5,6,7] 



Explanation: 


Window position                Max

---------------               -----

[1  3  -1] -3  5  3  6  7       3

 1 [3  -1  -3] 5  3  6  7       3

 1  3 [-1  -3  5] 3  6  7       5

 1  3  -1 [-3  5  3] 6  7       5

 1  3  -1  -3 [5  3  6] 7       6

 1  3  -1  -3  5 [3  6  7]      7




Note:
You may assume k is always valid, 1 ≤ k ≤ input array's size for non-empty array.



Follow up:
Could you solve it in linear time?




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
