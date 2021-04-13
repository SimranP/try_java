public class MainClass {
  public static void main(String[] args) {
    SimpleClass simpleClass = new SimpleClass();
    DoosriClass doosriClass = new DoosriClass();
    System.out.println(simpleClass.getNumber());
    simpleClass.setNumber("800");
    System.out.println(simpleClass.getNumber());
    System.out.println(doosriClass.getNumber());
    System.out.println(simpleClass.getDoosraNumber());
    simpleClass.setDoosraNumber("800");
    System.out.println(simpleClass.getDoosraNumber());
    System.out.println(doosriClass.getDoosraNumber());
  }
}
