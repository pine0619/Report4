public class Main {
    public static void main(String arg[]){
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println(e + "が発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
