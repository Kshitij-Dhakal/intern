public class TowerOfHanoi {

    public static void Toh(int n , char rodA, char rodC,char rodB ){
        if (n == 0) {
            return;
        }
        Toh(n-1,rodA,rodB,rodC);
        System.out.println("Swap "+n+" from "+rodA+"to "+rodC);
        Toh(n-1,rodB,rodC,rodA);
    }

    public static void main(String[] args){
        int noOfDisk=4;
        Toh(noOfDisk,'A','B','C');
    }
}