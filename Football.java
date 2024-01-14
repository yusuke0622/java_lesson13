public class Football extends Club {
    
    public Football(String name) {
        super(name);
    }
    
    //抽象メソッドの中身をオーバーライドし、実装している
    public void practice() {
        System.out.println("ドリブル練習");
        System.out.println("シュート練習");
        System.out.println("ミニゲーム");
    }
}