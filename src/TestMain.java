public class TestMain {

    public static void main(String[] args) {
        /**
         * If u use Java Object Layout (JOL) - https://openjdk.org/projects/code-tools/jol/
         * u could see that ClassLayout.parseClass(Long.class).toPrintable() returns 24 bytes. Why is it 24 bytes?
         * Just watch next table (the result of statement above):
         * OFF  SZ   TYPE DESCRIPTION               VALUE
         *   0   8        (object header: mark)     N/A
         *   8   4        (object header: class)    N/A
         *  12   4        (alignment/padding gap)
         *  16   8   long Long.value                N/A
         * Instance size: 24 bytes
         *
         * Therefore, Long Wrapper has metadata and primitive value inside. Primitive long takes up 8 bytes.
         * The total size will be 24 bytes.
         */
        System.out.println(InstrumentationAgent.getObjectSize(123L)); // 24 bytes
    }
}
