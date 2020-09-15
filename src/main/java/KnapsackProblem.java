/**
 * Given weights and values of n items, put these items in a knapsack of capacity W to get the
 * maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and
 * wt[0..n-1] which represent values and weights associated with n items respectively. Also given
 * an integer W which represents knapsack capacity, find out the maximum value subset of val[]
 * such that sum of the weights of this subset is smaller than or equal to W. You cannot break
 * an item, either pick the complete item or don’t pick it (0-1 property).
 */
class KnapsackProblem {
static int maxValue(int a , int b){
    return(a>b)?a:b;
}
static void printValue(int W , int weight[], int value[],int n){
    int i,j;
    int K[][] = new int [n+1][W+1];

for(i=0;i<=n;i++){
    for(j=0;j<=W;j++){
        if(i==0||j==0)
                K[i][j]=0;
        else if (weight[i-1]<=j)
            K[i][j]=Math.max(value[i-1]+K[i-1][j-weight[i-1]],K[i-1][j]);
        else K[i][j]=K[i-1][j];
    }
    }
int result=K[n][W];
System.out.println(result);
j=W;
for(i=n;i>0&& result>0;i--){
if (result==K[i-1][j])
continue;
else
System.out.println(weight[i-1]+" ");
result=result-value[i-1];
j=j-weight[i-1];
}
}

public static void main (String args[]){
    int value[]={20,30,40};
    int weight[]={1,2,3};
    int W=25;
    int n =value.length;
    printValue(W,weight,value,n);
}}