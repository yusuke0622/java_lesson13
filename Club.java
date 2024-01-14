public abstract class Club {
    //部活名、定義内容共通
    private String name;
    
    public Club(String name) {
        this.name = name;
    }
    //定義・メソッド内容共に共通
    public void display() {
        System.out.println("部活動:" + name);
    }
    //定義のみ共通、抽象メソッド
    public abstract void practice();
}