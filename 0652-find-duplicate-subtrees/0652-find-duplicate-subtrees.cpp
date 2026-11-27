/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<TreeNode*> ans;
    unordered_map<string,int> mp;

    string preorder(TreeNode* root) {
        if(!root) return "N";

        string curr = to_string(root->val);
        string left = preorder(root->left);
        string right = preorder(root->right);

        string finalnode = curr + "," + left + "," + right;

        if(mp.find(finalnode) != mp.end()) {
            if(mp[finalnode] == 1) {
                ans.push_back(root);
            }
            mp[finalnode]++;
        }
        else {
            mp[finalnode] = 1;
        }

        return finalnode;
    }

    vector<TreeNode*> findDuplicateSubtrees(TreeNode* root) {
        preorder(root);
        return ans;
    }
};