# Iteratorパターン
- 集合体の要素を、統一した方法で1つ1つ数え上げていくパターン

## 実装がどうであれ、Iteratorを使える
- Iteratorを使うことで、実装とは切り離して、数え上げを行うことができる
- 例: 下記のwhileループは、BookShelfの実装には依存しない
```
while (it.hasNext()) {
    Book book = (Book) it.next();
    System.out.println(book.getName());
}
```

## 抽象クラスやIFを使用したプログラミング
- 具体的なクラスだけを使うと、クラス間の結合が強くなってしまい、部品として再利用することが難しくなる
- 結合を弱め、クラスを部品として再利用しやすくするために、抽象クラスやIFが導入される

## AggregateとIteratorの対応
- AggregateとIteratorという2つのIFは対となる

## 「次」は間違いやすい
- nextメソッドは、より詳しく言えば「returnCurrentElementAndAdvanceToNextPosion（現在の要素を返しつつ、次の位置に進める）」

## 「最後」も間違いやすい
- hasNextメソッドは、最後の要素を得る前はtrueを返すが、最後の要素を得た後はfalseを返す
- 注意深く作らないと、最後の1個を返し損ねる危険がある
- 「次にnextメソッドを呼んでも大丈夫かどうかを調べるもの」と覚えておくと良い

## 複数のIterator
- 「数え上げの仕組みがAggregateの外に置かれている」というのは、Iteratorパターンの特徴の一つ
- この特徴により、1つのConcreteAggregate対して複数のConcreeteIteratorを作ることができる

## Iteratorの種類
- Iteratorクラスのスキャンには様々なバリエーションがある
- - 最後尾から開始して逆方向に進む
- - 順方向にも逆方向にも行く（nextメソッドだけでなくpreviousメソッドも持つ）
- - 番号を指定して、いきなりそこにジャンプする

## deleteIteratorは不要
- Javaでは、使われなくなったインスタンスは自動的に削除される（ガベージコレクション）

## 関連するパターン
### Visitorパターン
- 集合体から1つずつ要素を取り出して、数え上げていくパターン
- Iteratorはただ数え上げるが、Visitorは数え上げながら同時に定型処理をさせる

### Compositeパターン
- 再起的な構造を持ったパターン
- Iteratorを適用するのは難しい

### Factory Methodパターン
- iteratorメソッドがIteratorのインスタンスを生成するときに、Factory Methodパターンが使われる場合がある