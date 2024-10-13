package Corejava;

public class SampleOutput extends AbstractClass implements Interf {

//    public void AB1(){ //Overriding method for Abstract_class
//        System.out.println("SampleOutput called");
//    }

        public static void main(String[] args) {

            SampleOutput a = new SampleOutput();
            a.AB1();

            EnacapClass b = new EnacapClass();
            int m = b.getX();
            System.out.println(m);

            b.setX();
            System.out.println(b.getX());

            Poly c = new Poly();
            c.login();
            c.login("Poly");
            Interf d = new Interf() {
                @Override
                public void AccountType(String a) {
                    System.out.println("Saving Account");
                }

                @Override
                public void Bankname(String b) {
                    System.out.println("HDFC");
                }
            };
        }


    /**
     * @param a
     */
    @Override
    public void AccountType(String a) {
        System.out.println("Saving Account");
    }

    /**
     * @param b
     */
    @Override
    public void Bankname(String b) {
        System.out.println("HDFC");

    }
}
