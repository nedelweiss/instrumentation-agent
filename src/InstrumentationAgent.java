import java.lang.instrument.Instrumentation;

public class InstrumentationAgent {

    private static volatile Instrumentation instrumentation;

    public static void premain(final String agentArgs, final Instrumentation instrumentation) {
        InstrumentationAgent.instrumentation = instrumentation;
    }

    public static long getObjectSize(final Object object) {
        if (instrumentation == null) {
            throw new IllegalStateException("Agent not initialized.");
        }
        return instrumentation.getObjectSize(object);
    }
}
