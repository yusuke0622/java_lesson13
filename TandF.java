public class TandF extends Club {
    
    public TandF(String name) {
        super(name);
    }
    
    //抽象メソッドの中身をオーバーライドし、実装している
    public void practice() {
        System.out.println("ウォームアップ");
        System.out.println("インターバル");
        System.out.println("筋肉トレーニング");
    }
}