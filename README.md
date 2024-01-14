# 抽象クラスとポリモフィズム（多態性）  
・実装内容を持たないメソッドを抽象メソッドと呼び、abstract(抽象的な）をつける  
・抽象メソッドを持つクラスを抽象クラスと呼び、abstractをつける。インスタンス化は不可  
```
abstract class Club {
  String name;  // 共通
  Club(String name) {  
    this.name = name;
  }
  void display() {  // メソッド定義も実装内容も共通
    System.out.println("部活:" + name);
  }
  abstract void practice();  // メソッド定義だけ共通（＝抽象メソッド）→サブクラスで抽象メソッドをオーバーライドして実装する
}
```
下記のコードのように、Studentクラスのメソッドはclubオブジェクトによって、それぞれ異なる適した処理をする（＝ポリモフィズム（多態性））
```
class Student {
  club club;
  Student(Club club) {
    this.club = club;
  }
  void display() {
    club.display();
  }
  void practice() {
    club.practice();
  }
```
## ポリモフィズムのメリット  
・プログラムの書き方を統一できる  
 クラスが増えてもスーパークラスを継承することで、全部メソッド名や書くべきメソッド処理を統一することができる→メソッドの作成漏れ防ぐ、プログラムが見やすい  
・利用するクラス側（呼び出す側）の書き方も統一できる
　　他のクラス（呼び出される側）が増えても、呼び出す側の内容を変更する必要がない→拡張できる
