/**
Grep prints out each line in a file containing a specified word
**/
public class Grep{
  public static void main(String[] args){
    if (args.length!=2) {
      System.out.printf("Usage: %%java Grep WORD FILENAME ");
      return;
    }
    String word = args[0];
    TextIO.readFile(args[1]);  //open the FILENAME for reading ...
    String line;
    int i=1;
    while (!TextIO.eof()){
      line = TextIO.getln();
      if (line.contains(word)) {
          TextIO.putf("%d. %s%n",i,line);
      }i++;
    }
  }
}