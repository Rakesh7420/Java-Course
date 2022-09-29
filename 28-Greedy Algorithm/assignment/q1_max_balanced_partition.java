public class q1_max_balanced_partition {
static int  balanced(String str, int n) {
    if (n == 0) return 0;
    int r = 0, l = 0;
    int ans = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'R') {
            r++;
        }
        else{
            l++;
        }

    if(l==r) {
        ans++;
    }}
    return ans;
}


    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int n=str.length();

        System.out.println(balanced(str,n));
    }
}
