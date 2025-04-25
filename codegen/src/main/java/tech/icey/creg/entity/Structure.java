package tech.icey.creg.entity;

import java.util.List;

public final class Structure extends Entity {
    public final boolean isUnion;
    public final List<Member> memberList;
    public final List<String> verbatim;

    public Structure(
            String name,
            boolean isUnion,
            List<Member> memberList,
            List<String> verbatim
    ) {
        super(name);
        this.isUnion = isUnion;
        this.memberList = memberList;
        this.verbatim = verbatim;
    }
}
