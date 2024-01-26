public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        if(m == 1 || n%2 == 0) return 2;
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(towerBreakers(2, 6));
    }
}
