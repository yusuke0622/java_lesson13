public class Student {
    // 氏名
    private String name;   
    // Clubオブジェクト(Clubクラスのclubという変数を持たせる→どこの部活に所属しているか)
    private Club club;
    
    public Student(String name, Club club) {
        this.name = name;
        // スーパー＝サブ 参照型の型変換（自動）
        this.club = club;
    }
    
    public void display() {
        System.out.println("名前:" + name);
        club.display();
        // club.display(); = System.out.println("部活動:" + name);
    }
    // メンバ変数が持っているpractice()メソッドを呼び出す
    public void practice() {
        club.practice();
    }
}