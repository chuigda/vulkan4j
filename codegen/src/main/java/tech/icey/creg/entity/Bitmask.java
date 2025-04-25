package tech.icey.creg.entity;

import java.util.List;

public final class Bitmask extends Entity {
    public final List<Bitflag> bitflags;
    public final int bitwidth;

    public Bitmask(String name, List<Bitflag> bitflags, int bitwidth) {
        super(name);
        this.bitflags = bitflags;
        this.bitwidth = bitwidth;
    }

    public Bitmask(String name, List<Bitflag> bitflags) {
        this(name, bitflags, 32);
    }
}
