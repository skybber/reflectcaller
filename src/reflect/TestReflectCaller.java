package reflectcall;

import java.lang.reflect.Method;

public class TestReflectCaller {
    public static void main(String args[]) {
        for(;;)
            try {
                TestReflectCall t1 = new TestReflectCall();
                Method declaredMethod = TestReflectCall.class.getDeclaredMethod("hallo", null);
                declaredMethod.invoke(t1);
                Thread.sleep(2000);
            } catch (Exception e) {
        }
    }
}
