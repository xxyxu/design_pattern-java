# 補足

## プロパティをストリームに読み書きするメソッド
### void load(InputStream in) throws IOException
- プロパティの集合をInputStreamから読み込む

### void store(OutputStream out, String header) throws IOException
- プロパティの集合をOutputStreamに書き込む。headerはコメント文字列