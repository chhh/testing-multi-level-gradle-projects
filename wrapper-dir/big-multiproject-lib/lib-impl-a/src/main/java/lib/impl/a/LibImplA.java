/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lib.impl.a;

import lib.api.LibApi;

public class LibImplA implements LibApi {

    @Override
    public String getStr1() {
        return this.getClass().getCanonicalName() + " 01";
    }

    @Override
    public String getStr2() {
        return this.getClass().getCanonicalName() + " 02";
    }
}
