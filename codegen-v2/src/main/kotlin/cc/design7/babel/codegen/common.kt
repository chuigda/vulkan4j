package cc.design7.babel.codegen

import cc.design7.babel.registry.Identifier
import cc.design7.babel.util.buildDoc

internal fun prohibitUserConstruct(className: String) = buildDoc {
    +"/// Constructing this class is nonsense so the constructor is made private."
    +"private $className() {}"
}

internal fun prohibitUserConstruct(ident: Identifier) = prohibitUserConstruct(ident.value)
