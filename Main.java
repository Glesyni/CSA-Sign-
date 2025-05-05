public class Main{
    public static void main(String[] args){
        String str; 
        int x;
        Sign signl = new Sign ("ABC222DE", 3) ;
        System.out.println(signl.numberOfLines());
        System.out.println(str = signl.getLines());
        System.out.println(str = signl.getLines());
        Sign sign2 = new Sign ( "ABCD", 10) ;
        System.out.println(sign2.numberOfLines());
        System.out.println(sign2.getLines ());
        Sign sign3 = new Sign ("ABCDEF", 6) ;
        System.out.println(sign3.numberOfLines());
        System.out.println(sign3.getLines ());
        Sign sign4 = new Sign ("", 4) ;
        System.out.println(sign4.numberOfLines ());
        System.out.println(sign4.getLines ());
        Sign sign5 = new Sign ("AB_CD_EF", 2); 
        System.out.println(sign5.numberOfLines ());
        System.out.println(sign5.getLines ());
    }
}
