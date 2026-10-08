package com.xiaonan.generics;

import com.xiaonan.Main;
import com.xiaonan.generics.impl.InfoImpl;

/**
 * @Author: jynan
 * @CreateTime: 2026-10-08  20:27
 * @Description: TODO
 * @Version: 1.0
 */
public class SimpleGenericDemo2 {
    public static void main() {
        Info<String> info = new InfoImpl<>("Hello, World!");
        System.out.println(info.getVar());
    }
}
