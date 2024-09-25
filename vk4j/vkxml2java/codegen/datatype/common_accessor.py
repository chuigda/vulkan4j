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


def generate_platform_dependent_int_accessor(type_: CType, member: Member) -> str:
    if type_ == CTYPE_LONG:
        return f'''    public long {member.name}() {{
            return NativeLayout.readCLong(segment, OFFSET${member.name});
        }}
    
        public void {member.name}(long value) {{
            NativeLayout.writeCLong(segment, OFFSET${member.name}, value);
        }}\n\n'''
    elif type_ == CTYPE_SIZET:
        return f'''    public @unsigned long {member.name}() {{
            return NativeLayout.readCSizeT(segment, OFFSET${member.name});
        }}
    
        public void {member.name}(@unsigned long value) {{
            NativeLayout.writeCSizeT(segment, OFFSET${member.name}, value);
        }}\n\n'''
    else:
        raise ValueError(f'Unsupported platform dependent int type: {type_}')


def generate_ref_type_accessor(type_: CStructType | CUnionType | CHandleType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return new {type_.java_type()}(segment.asSlice(OFFSET${member.name}, LAYOUT${member.name}));
    }}

    public void {member.name}({type_.java_type()} value) {{
        MemorySegment.copy(value.segment(), 0, segment, OFFSET${member.name}, LAYOUT${member.name}.byteSize());
    }}\n\n'''


def generate_handle_type_accessor(type_: CHandleType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return new {type_.java_type()}(segment.get(LAYOUT${member.name}, OFFSET${member.name}));
    }}

    public void {member.name}({type_.java_type()} value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value.segment());
    }}\n\n'''


def generate_fixed_type_accessor(type_: CFixedIntType | CFloatType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}({type_.java_type()} value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''


def generate_enum_accessor(type_: CEnumType, member: Member) -> str:
    return f'''    public {type_.java_type()} {member.name}() {{
        return segment.get(LAYOUT${member.name}, OFFSET${member.name});
    }}

    public void {member.name}({type_.java_type()} value) {{
        segment.set(LAYOUT${member.name}, OFFSET${member.name}, value);
    }}\n\n'''
