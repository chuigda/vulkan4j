package club.doki7.babel.extract.openxr

import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.intern

internal fun Registry<OpenXRRegistryExt>.addDependencies() {
    log.info("手动添加类型 LUID")
    val LUID = "LUID".intern()
    structures.put(
        LUID, Structure(
            LUID,
            mutableListOf(
                Member("LowPart", IdentifierType("DWORD"), null, null, null, false, null),
                Member("HighPart", IdentifierType("LONG"), null, null, null, false, null)
            )
        )
    )
}