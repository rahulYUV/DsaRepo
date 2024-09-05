#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int firstOcc(vector<int>& arr, int size, int key) {
        int left = 0;
        int right = size - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                ans = mid;       // answer
                right = mid - 1; // Move left to find earlier occurrence
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    int lastOcc(vector<int>& arr, int size, int key) {
        int left = 0;
        int right = size - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                ans = mid;      //  answer
                left = mid + 1; // Move right to find later occurrence
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    vector<int> searchRange(vector<int>& nums, int target) {
        int first = firstOcc(nums, nums.size(), target);
        int last = lastOcc(nums, nums.size(), target);
        return {first, last};
    }
};

int main() {
    Solution sol;
    vector<int> nums = {5, 7, 7, 8, 8, 10};
    int target = 8;

    vector<int> result = sol.searchRange(nums, target);

    cout << "First Occurrence: " << result[0] << endl;
    cout << "Last Occurrence: " << result[1] << endl;

    return 0;
}
