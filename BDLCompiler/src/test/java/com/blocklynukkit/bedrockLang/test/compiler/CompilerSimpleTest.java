package com.blocklynukkit.bedrockLang.test.compiler;

import com.blocklynukkit.bedrockLang.compiler.app.Compiler;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Method;

import static com.blocklynukkit.bedrockLang.test.TestUtils.*;

public class CompilerSimpleTest {
    @Test
    public void test1() {
        final byte[] bytes = Compiler.builder().sourceName("helloWorld.bdl")
                .sourceCode(getCode("helloWorld.bdl")).build().compile();
        saveTo(bytes, new File("test/helloWorld.class"));
    }

    @Test
    public void test2Performance() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("fibonacci.bdl")
                .sourceCode(getCode("fibonacci.bdl")).build().compile();
        saveTo(bytes, new File("test/fibonacci.class"));
        Class<?> cls = loadClass("fibonacci", bytes);
        Method main = cls.getMethod("main");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            main.invoke(cls);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test3() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("bigNum.bdl")
                .sourceCode(getCode("bigNum.bdl")).build().compile();
        saveTo(bytes, new File("test/bigNum.class"));
        Class<?> cls = loadClass("bigNum", bytes);
        Method main = cls.getMethod("main");
        main.invoke(cls);
    }

    @Test
    public void test4() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("say.bdl")
                .sourceCode(getCode("say.bdl")).build().compile();
        saveTo(bytes, new File("test/say.class"));
        Class<?> cls = loadClass("say", bytes);
        Method main = cls.getMethod("main");
        main.invoke(cls);
    }

    @Test
    public void test5() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("ifWithIf.bdl")
                .sourceCode(getCode("ifWithIf.bdl")).build().compile();
        saveTo(bytes, new File("test/ifWithIf.class"));
        Class<?> cls = loadClass("ifWithIf", bytes);
        Method main = cls.getMethod("main");
        main.invoke(cls);
    }

    @Test
    public void test6() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("arrayCmd.bdl")
                .sourceCode(getCode("arrayCmd.bdl")).build().compile();
        saveTo(bytes, new File("test/arrayCmd.class"));
        Class<?> cls = loadClass("arrayCmd", bytes);
        Method main = cls.getMethod("main", String[].class);
        main.invoke(cls, (Object) new String[0]);
    }

    @Test
    public void test7() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("manyFunction.bdl")
                .sourceCode(getCode("manyFunction.bdl")).build().compile();
        saveTo(bytes, new File("test/manyFunction.class"));
        Class<?> cls = loadClass("manyFunction", bytes);
        Method main = cls.getMethod("main", String[].class);
        main.invoke(cls, (Object) new String[0]);
    }

    @Test
    public void test8() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("importArrays.bdl")
                .sourceCode(getCode("importArrays.bdl")).build().compile();
        saveTo(bytes, new File("test/importArrays.class"));
        Class<?> cls = loadClass("importArrays", bytes);
        Method main = cls.getMethod("main", String[].class);
        main.invoke(cls, (Object) new String[0]);
    }

    @Test
    public void test9() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("newObject.bdl")
                .sourceCode(getCode("newObject.bdl")).build().compile();
        saveTo(bytes, new File("test/newObject.class"));
        Class<?> cls = loadClass("newObject", bytes);
        Method main = cls.getMethod("main");
        main.invoke(cls);
    }

    @Test
    public void testSwing1() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("simpleWindow.bdl")
                .sourceCode(getCode("swing/simpleWindow.bdl")).build().compile();
        saveTo(bytes, new File("test/swing/simpleWindow.class"));
        Class<?> cls = loadClass("simpleWindow", bytes);
        Method main = cls.getMethod("main", String[].class);
        try {
            main.invoke(cls, (Object) new String[0]);
        } catch (Exception ignore) {

        }
    }

    @Test
    public void test10() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("mainArgsLength.bdl")
                .sourceCode(getCode("mainArgsLength.bdl")).build().compile();
        saveTo(bytes, new File("test/mainArgsLength.class"));
        Class<?> cls = loadClass("mainArgsLength", bytes);
        Method main = cls.getMethod("main", String[].class);
        main.invoke(cls, (Object) new String[]{"I'm", "BDL"});
    }

    @Test
    public void test11() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("chainSetVar.bdl")
                .sourceCode(getCode("chainSetVar.bdl")).build().compile();
        saveTo(bytes, new File("test/chainSetVar.class"));
        Class<?> cls = loadClass("chainSetVar", bytes);
        Method main = cls.getMethod("main");
        main.invoke(cls);
    }

    @Test
    public void test12() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("printArgs.bdl")
                .sourceCode(getCode("printArgs.bdl")).build().compile();
        saveTo(bytes, new File("test/printArgs.class"));
        Class<?> cls = loadClass("printArgs", bytes);
        Method main = cls.getMethod("main", String[].class);
        main.invoke(cls, (Object) new String[]{"I'm", "BDL"});
    }

    @Test
    public void test13() throws Exception {
        final byte[] bytes = Compiler.builder().sourceName("writeArray.bdl")
                .sourceCode(getCode("writeArray.bdl")).build().compile();
        saveTo(bytes, new File("test/writeArray.class"));
        Class<?> cls = loadClass("writeArray", bytes);
        Method main = cls.getMethod("test", int[][].class);
        main.invoke(cls, (Object) new int[][]{{0, 0}, {0, 0}});
    }
}
