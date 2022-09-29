public class q3_knight {
    static  int N=8;
    public static void print(int sol[][]){
        for(int x=0;x<N;x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");

            System.out.println();
        }

    }

    public static boolean isSafe(int x,int y,int sol[][]) {
        return (x >= 0&&x < N && y >= 0 && y < N && sol[x][y] == -1);
    }
    public static boolean knight(){
int sol[][]=new int [N][N];
for(int x=0;x<N;x++)
    for(int y=0;y<N;y++)
sol[x][y]=-1;

int xMove[]={2,1,-1,-2,-2,-1,1,2};
int yMove[]={1,2,2,1,-1,-2,-2,-1};
sol[0][0]=0;
if(!knightUtil(0,0,1,sol,xMove,yMove)){
    System.out.println("solution does not exist");
    return false;
}
print(sol);
return true;
    }

    public static boolean knightUtil(int x,int y,int Movei,int sol[][],int xMove[],int yMove[]){
int k, next_x, next_y;
if(Movei==N*N){
    return  true;
}
for( k=0;k<8;k++){
    next_x=x+xMove[k];
    next_y=y+yMove[k];
    if(isSafe(next_x,next_y,sol)){
        sol[next_x][next_y]=Movei;
        if(knightUtil(next_x,next_y,Movei+1,sol,xMove,yMove))
            return true;
        else
            sol[next_x][next_y]=-1;
    }
}
return false;
    }


    public static void main(String[] args) {
knight();
    }
}
