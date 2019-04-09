class ThrowEx{
    static void ex1(){throw new ClassCastException();}
    static void ex2(){throw new RuntimeException();}
    static void testMethod() throws MyEx{
        System.out.println("Calling MyEx from testMethod()");
        throw new MyEx();
    }
}