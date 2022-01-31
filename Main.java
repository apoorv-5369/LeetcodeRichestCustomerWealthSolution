class Solution {
    public int maximumWealth(int[][] accounts) {
       int m=accounts.length, n= accounts[0].length;
        int[] arr = new int[m];
        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                arr[i]+=accounts[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[m-1];
    }
}
