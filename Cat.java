public class Cat{
  public static void main(String[] args){
    if (args.length!=1) {
      System.out.printf("Usage: %java Printer FILENAME ");
      return;
    }
    TextIO.readFile(args[0]);  //open the FILENAME for reading ...
    String line;
    int i=1;
    while (!TextIO.eof()){
      line = TextIO.getln();
      TextIO.putf("%d. %s%n",i,line);
      i++
    }
  }
}