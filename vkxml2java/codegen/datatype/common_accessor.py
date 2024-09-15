from ..ctype import *
from ...entity import Member


def generate_bitfield_accessor(current: Member, next_: Member) -> str:
    return f'''    public int {current.name}() {{
        return segment.get(LAYOUT$bitfield${current.name}_{next_.name}, OFFSET$bitfield${current.name}_{next_.name}) >> 8;
    }}

    public void {current.name}(int value) {{
        int original = segment.get(LAYOUT$bitfield${current.name}_{next_.name}, OFFSET$bitfield${current.name}_{next_.name});
        int newValue = (value << 8) | (original & 0xFF);
        segment.set(LAYOUT$bitfield${current.name}_{next_.name}, OFFSET$bitfield${current.name}_{next_.name}, newValue);
    }}

    public int {next_.name}() {{
        return segment.get(LAYOUT$bitfield${current.name}_{next_.name}, OFFSET$bitfield${current.name}_{next_.name}) & 0xFF;
    }}

    public void {next_.name}(int value) {{
        int original = segment.get(LAYOUT$bitfield${current.name}_{next_.name}, OFFSET$bitfield${current.name}_{next_.name});
        int newValue = (original & 0xFF00) | value;
        segment.set(LAYOUT$bitfield${current.name}_{next_.name}, OFFSET$bitfield${current.name}_{next_.name}, newValue);
    }}\n\n'''


def generate_platform_dependent_int_accessor(member: Member) -> str:
    return f'''    public long {member.name}() {{
        return NativeLayout.readCLong(segment, OFFSET${member.name});
    }}

    public void {member.name}(long value) {{
        NativeLayout.writeCLong(segment, OFFSET${member.name}, value);
    }}\n\n'''


def generate_datatype_accessor(type_: CStructType | CUnionType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return new {type_.java_type()}(segment.asSlice(OFFSET${member.name}, LAYOUT${member.name}));
    }}

    public void {member.name}({type_.java_type()} value) {{
        MemorySegment.copy(value.segment(), 0, segment, OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}\n\n'''


def generate_fixed_int_type_accessor(type_: CFixedIntType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}({type_.java_type()} value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''


def generate_enum_accessor(type_: CEnumType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return {type_.java_type()}.fromInt(segment.get(LAYOUT${member.name}, OFFSET${member.name}));
    }}

    public void {member.name}({type_.java_type()} value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value.value());
    }}\n\n'''
