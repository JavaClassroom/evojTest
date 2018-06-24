package ru.wedro22.evojTest;

import net.sourceforge.evoj.core.annotation.Range;

public interface Property {
    @Range(min = "0", max = "100", strict = "true")
    public int get1();
    @Range(min = "0", max = "100", strict = "true")
    public int get2();
    @Range(min = "0", max = "100", strict = "true")
    public int get3();
}
