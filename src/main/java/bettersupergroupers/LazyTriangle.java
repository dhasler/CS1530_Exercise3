package bettersupergroupers;

public class LazyTriangle {
  public static void main(String[] args) {
    
    int numberToCount = 0;

    try{
      numberToCount = Integer.parseInt(args[1]);
      if(numberToCount < 0){
        System.out.println("Enter a positive number you fool!");
        System.exit(2);
      }
    }
    catch (NumberFormatException e){
      System.out.println("Enter a valid integer.");
      System.exit(1);
    }

    if(args[0].equals("triangle")){
      System.out.println("Tri(" + numberToCount + ") = " + triangleSequence(numberToCount));
    }
    else if(args[0].equals("lazy")){
      System.out.println("Lazy(" + numberToCount + ") = " + lazySequence(numberToCount));
    }

  }

  public static int triangleSequence(int n){
    if(n > 0)
      return n + triangleSequence(n - 1);
    else
      return 0;
  }


  public static int lazySequence(int n){
    return (n * n + n + 2) / 2;
  }
}