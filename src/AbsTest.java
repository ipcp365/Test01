public abstract class AbsTest { //추상클래스

    abstract void atest();
    abstract void btest();


    void cTest(){ //그냥 메소드 만들떄에는 abstract 안써도 괜찮음

        System.out.println("추상클래스 출력");

    }
}
