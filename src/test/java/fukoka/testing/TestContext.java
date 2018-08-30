package fukoka.testing;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TestContext {


    private AtomicInteger atomicInteger = new AtomicInteger(1);

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

}
