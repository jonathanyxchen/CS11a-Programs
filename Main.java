public class Main {
  public static void main(String[] args) {
int a=5;
int b=8;
int n=0;
while (a != 9) {
    int t = (a+b) % 10;
    n++;
    TextIO.putf("%d %d %d %d%n",n,b,a,t);
    b=a;
    a=t;
}
TextIO.putf("%d steps",n);
  }
}